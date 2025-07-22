package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PrismarineBricks;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.Optional;

public class AbstractPrismarineBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PrismarineBricks.VERTICAL_SLAB;

    public AbstractPrismarineBricks() {
        super(PrismarineBricks.ID, VERTICAL_SLAB, "prismarine_bricks", Items.PRISMARINE_BRICKS, Items.PRISMARINE_BRICK_SLAB);
    }

    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_all")), Optional.empty()).upload(
            VERTICAL_SLAB,
            textures = new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/" + this.PARENT_ID)),
            blockStateModelGenerator.modelCollector
        );
    }

    public VariantsBlockModelDefinitionCreator getBlockStates() {
        return VariantsBlockModelDefinitionCreator.of(VERTICAL_SLAB, BlockStateModelGenerator.createWeightedVariant(Identifier.of("verticalslabs:block/" + this.ID)))
            .apply(BlockStateModelGenerator.UV_LOCK)
            .coordinate(
                BlockStateVariantMap.operations(Properties.HORIZONTAL_FACING, VerticalSlabBlock.TYPE)
                    .register(Direction.NORTH, VerticalSlabType.HALF, BlockStateModelGenerator.NO_OP)
                    .register(Direction.EAST, VerticalSlabType.HALF, BlockStateModelGenerator.ROTATE_Y_90)
                    .register(Direction.SOUTH, VerticalSlabType.HALF, BlockStateModelGenerator.ROTATE_Y_180)
                    .register(Direction.WEST, VerticalSlabType.HALF, BlockStateModelGenerator.ROTATE_Y_270)
                    .register(Direction.NORTH, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)))
                    .register(Direction.EAST, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)))
                    .register(Direction.SOUTH, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)))
                    .register(Direction.WEST, VerticalSlabType.DOUBLE, ModelVariantOperator.MODEL.withValue(Identifier.ofVanilla("block/" + this.PARENT_ID)))
            );
    }
}
