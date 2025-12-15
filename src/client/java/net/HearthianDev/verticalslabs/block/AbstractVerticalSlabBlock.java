package net.HearthianDev.verticalslabs.block;

import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import java.util.Optional;

public abstract class AbstractVerticalSlabBlock {
    public String ID;
    public Block VERTICAL_SLAB;
    public String PARENT_ID;
    public Item PARENT;
    public Item SLAB;
    public TextureMapping textures;
    public boolean isCuttable;

    public AbstractVerticalSlabBlock(String id, Block verticalSlab, Item parent, Item slab) {
        this(id, verticalSlab, null, parent, slab);
    }

    public AbstractVerticalSlabBlock(String id, Block verticalSlab, String parentId, Item parent, Item slab) {
        this(id, verticalSlab, parentId, parent, slab, true);
    }

    public AbstractVerticalSlabBlock(String id, Block verticalSlab, Item parent, Item slab, boolean isCuttable) {
        this(id, verticalSlab, null, parent, slab, isCuttable);
    }

    public AbstractVerticalSlabBlock(String id, Block verticalSlab, String parentId, Item parent, Item slab, boolean isCuttable) {
        this.ID = id;
        this.VERTICAL_SLAB = verticalSlab;
        this.PARENT_ID = parentId;
        this.PARENT = parent;
        this.SLAB = slab;
        this.isCuttable = isCuttable;
    }

    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_all")), Optional.empty()).create(
            this.VERTICAL_SLAB,
            textures = new TextureMapping().putForced(TextureSlot.ALL, Identifier.withDefaultNamespace("block/" + this.PARENT_ID)),
            blockStateModelGenerator.modelOutput
        );
    }

    public MultiVariantGenerator getBlockStates() {
        return MultiVariantGenerator.dispatch(this.VERTICAL_SLAB, BlockModelGenerators.plainVariant(Identifier.parse("verticalslabs:block/" + this.ID)))
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

