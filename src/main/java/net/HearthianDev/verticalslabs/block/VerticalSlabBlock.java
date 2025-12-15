package net.HearthianDev.verticalslabs.block;

import com.mojang.serialization.MapCodec;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;


public class VerticalSlabBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final MapCodec<VerticalSlabBlock> CODEC = simpleCodec(VerticalSlabBlock::new);
    public static final BooleanProperty WATERLOGGED;
    public static final EnumProperty<@NotNull VerticalSlabType> TYPE;
    private static final VoxelShape NORTH_SHAPE;
    private static final VoxelShape EAST_SHAPE;
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape WEST_SHAPE;

    public VerticalSlabBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, true).setValue(TYPE, VerticalSlabType.HALF));
    }

    @Override
    protected @NotNull MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public @NotNull FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    public boolean placeLiquid(@NotNull LevelAccessor world, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull FluidState fluidState) {
        return SimpleWaterloggedBlock.super.placeLiquid(world, pos, state, fluidState);
    }

    @Override
    protected @NotNull BlockState updateShape(BlockState state, @NotNull LevelReader world, @NotNull ScheduledTickAccess tickView, @NotNull BlockPos pos, @NotNull Direction direction, @NotNull BlockPos neighborPos, @NotNull BlockState neighborState, @NotNull RandomSource random) {
        if (state.getValue(WATERLOGGED)) {
            ((LevelAccessor) world).scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

//  public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
//    if (Objects.requireNonNull(type) == NavigationType.WATER) {
//      return world.getFluidState(pos).isIn(FluidTags.WATER);
//    }
//
//    return false;
//  }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState blockState) {
        return RenderShape.MODEL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<@NotNull Block, @NotNull BlockState> builder) {
        builder.add(WATERLOGGED, FACING, TYPE);
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return state.getValue(TYPE) != VerticalSlabType.DOUBLE;
    }


    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter view, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        if (!useShapeForLightOcclusion(state)) {
            return Shapes.block();
        }

        return switch (state.getValue(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> super.getShape(state, view, pos, context);
        };
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockPos blockPos = ctx.getClickedPos();
        BlockState blockState = ctx.getLevel().getBlockState(blockPos);
        if (blockState.is(this)) {
            return (blockState.setValue(TYPE, VerticalSlabType.DOUBLE)).setValue(WATERLOGGED, false);
        } else {
            FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
            boolean waterLog = fluidState.is(FluidTags.WATER) && fluidState.getAmount() == 8;

            return Objects.requireNonNull(super.getStateForPlacement(ctx)).setValue(WATERLOGGED, waterLog)
                    .setValue(FACING, ctx.getHorizontalDirection().getOpposite());
        }
    }

    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        ItemStack itemStack = context.getItemInHand();
        Direction facing = state.getValue(FACING);

        if (useShapeForLightOcclusion(state) && itemStack.is(this.asItem())) {
            if (context.replacingClickedOnBlock()) {
                boolean blSouth = context.getClickLocation().z - (double)context.getClickedPos().getZ() > 0.5;
                boolean blEast = context.getClickLocation().x - (double)context.getClickedPos().getX() > 0.5;
                Direction direction = context.getClickedFace();

                return switch (facing) {
                    case NORTH -> direction == Direction.NORTH || !blSouth && direction.getAxis().isHorizontal();
                    case SOUTH -> direction == Direction.SOUTH || blSouth && direction.getAxis().isHorizontal();
                    case EAST -> direction == Direction.EAST || blEast && direction.getAxis().isHorizontal();
                    case WEST -> direction == Direction.WEST || !blEast && direction.getAxis().isHorizontal();
                    default -> false;
                };
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        TYPE = EnumProperty.create("type", VerticalSlabType.class);
        NORTH_SHAPE = Block.box(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
        EAST_SHAPE = Block.box(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
        SOUTH_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
        WEST_SHAPE = Block.box(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    }
}
