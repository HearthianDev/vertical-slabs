package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothStone;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.client.render.model.json.*;
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
    public VariantsBlockModelDefinitionCreator getBlockStates() {
        return VariantsBlockModelDefinitionCreator.of(VERTICAL_SLAB, BlockStateModelGenerator.createWeightedVariant(Identifier.of("verticalslabs:block/" + this.ID)))
            .apply(
                BlockStateVariantMap.operations(Properties.HORIZONTAL_FACING, VerticalSlabBlock.TYPE)
                    .register(Direction.NORTH, VerticalSlabType.HALF, BlockStateModelGenerator.NO_OP)
                    .register(Direction.EAST, VerticalSlabType.HALF, BlockStateModelGenerator.ROTATE_Y_90)
                    .register(Direction.SOUTH, VerticalSlabType.HALF, BlockStateModelGenerator.ROTATE_Y_180)
                    .register(Direction.WEST, VerticalSlabType.HALF, BlockStateModelGenerator.ROTATE_Y_270)
                    .register(Direction.NORTH, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)).then(BlockStateModelGenerator.ROTATE_X_90))
                    .register(Direction.EAST, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)).then(BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_90)))
                    .register(Direction.SOUTH, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)).then(BlockStateModelGenerator.ROTATE_X_270))
                    .register(Direction.WEST, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)).then(BlockStateModelGenerator.ROTATE_X_270.then(BlockStateModelGenerator.ROTATE_Y_90)))
            );
    }
}
