package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothStone;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import java.util.Optional;

public class AbstractSmoothStone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SmoothStone.VERTICAL_SLAB;

    public AbstractSmoothStone() {
        super(SmoothStone.ID, VERTICAL_SLAB, "smooth_stone_slab_double", Items.SMOOTH_STONE, Items.SMOOTH_STONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_column_sided")), Optional.empty()).create(
            VERTICAL_SLAB,
            new TextureMapping()
                .putForced(TextureSlot.END, new Material(Identifier.withDefaultNamespace("block/smooth_stone")))
                .putForced(TextureSlot.SIDE, new Material(Identifier.withDefaultNamespace("block/smooth_stone_slab_side"))),
            blockStateModelGenerator.modelOutput
        );
    }

    @Override
    public MultiVariantGenerator getBlockStates() {
        return MultiVariantGenerator.dispatch(VERTICAL_SLAB, BlockModelGenerators.plainVariant(Identifier.parse("verticalslabs:block/" + this.ID)))
            .with(
                PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING, VerticalSlabBlock.TYPE)
                    .select(Direction.NORTH, VerticalSlabType.HALF, BlockModelGenerators.NOP)
                    .select(Direction.EAST, VerticalSlabType.HALF, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.SOUTH, VerticalSlabType.HALF, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, VerticalSlabType.HALF, BlockModelGenerators.Y_ROT_270)
                    .select(Direction.NORTH, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)).then(BlockModelGenerators.X_ROT_90))
                    .select(Direction.EAST, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)).then(BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_90)))
                    .select(Direction.SOUTH, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)).then(BlockModelGenerators.X_ROT_270))
                    .select(Direction.WEST, VerticalSlabType.DOUBLE, VariantMutator.MODEL.withValue(Identifier.withDefaultNamespace("block/" + this.PARENT_ID)).then(BlockModelGenerators.X_ROT_270.then(BlockModelGenerators.Y_ROT_90)))
            );
    }
}
