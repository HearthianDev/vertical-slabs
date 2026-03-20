package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PrismarineBricks;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import java.util.Optional;

public class AbstractPrismarineBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PrismarineBricks.VERTICAL_SLAB;

    public AbstractPrismarineBricks() {
        super(PrismarineBricks.ID, VERTICAL_SLAB, "prismarine_bricks", Items.PRISMARINE_BRICKS, Items.PRISMARINE_BRICK_SLAB);
    }

    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_all")), Optional.empty()).create(
            VERTICAL_SLAB,
            textures = new TextureMapping().putForced(TextureSlot.ALL, new Material(Identifier.withDefaultNamespace("block/" + this.PARENT_ID))),
            blockStateModelGenerator.modelOutput
        );
    }

    public MultiVariantGenerator getBlockStates() {
        return MultiVariantGenerator.dispatch(VERTICAL_SLAB, BlockModelGenerators.plainVariant(Identifier.parse("verticalslabs:block/" + this.ID)))
            .with(BlockModelGenerators.UV_LOCK)
            .with(
                PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING, VerticalSlabBlock.TYPE)
                    .select(Direction.NORTH, VerticalSlabType.HALF, BlockModelGenerators.NOP)
                    .select(Direction.EAST, VerticalSlabType.HALF, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.SOUTH, VerticalSlabType.HALF, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, VerticalSlabType.HALF, BlockModelGenerators.Y_ROT_270)
                    .select(Direction.NORTH, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)))
                    .select(Direction.EAST, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)))
                    .select(Direction.SOUTH, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)))
                    .select(Direction.WEST, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)))
            );
    }
}
