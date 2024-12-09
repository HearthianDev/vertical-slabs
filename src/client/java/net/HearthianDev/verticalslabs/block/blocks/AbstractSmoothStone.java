package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothStone;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.Optional;

public class AbstractSmoothStone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SmoothStone.VERTICAL_SLAB;

    public AbstractSmoothStone() {
        super(SmoothStone.ID, VERTICAL_SLAB, "smooth_stone_slab_double", Items.SMOOTH_STONE, Items.SMOOTH_STONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_column_sided")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap()
                        .register(TextureKey.END, Identifier.ofVanilla("block/smooth_stone"))
                        .register(TextureKey.SIDE, Identifier.ofVanilla("block/smooth_stone_slab_side")),
                blockStateModelGenerator.modelCollector
        );
    }

    @Override
    public MultipartBlockStateSupplier getBlockStates(MultipartBlockStateSupplier supplier) {
        return supplier
                .with(When.create().set(Properties.HORIZONTAL_FACING, Direction.NORTH).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, false)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.EAST).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, false)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.SOUTH).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, false)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.WEST).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, false)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.NORTH).set(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE),
                        BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.MODEL, Identifier.ofVanilla("block/" + this.PARENT_ID))
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.EAST).set(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE),
                        BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                .put(VariantSettings.MODEL, Identifier.ofVanilla("block/" + this.PARENT_ID))
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.SOUTH).set(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE),
                        BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                .put(VariantSettings.MODEL, Identifier.ofVanilla("block/" + this.PARENT_ID))
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.WEST).set(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE),
                        BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                .put(VariantSettings.MODEL, Identifier.ofVanilla("block/" + this.PARENT_ID))
                );
    }
}
