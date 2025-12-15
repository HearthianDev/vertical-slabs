package net.HearthianDev.verticalslabs.block;

import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.*;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.Optional;

public abstract class AbstractVerticalSlabBlock {
    public String ID;
    public Block VERTICAL_SLAB;
    public String PARENT_ID;
    public Item PARENT;
    public Item SLAB;
    public TextureMap textures;
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

    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_all")), Optional.empty()).upload(
            this.VERTICAL_SLAB,
            textures = new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/" + this.PARENT_ID)),
            blockStateModelGenerator.modelCollector
        );
    }

    public VariantsBlockModelDefinitionCreator getBlockStates() {
        return VariantsBlockModelDefinitionCreator.of(this.VERTICAL_SLAB, BlockStateModelGenerator.createWeightedVariant(Identifier.of("verticalslabs:block/" + this.ID)))
            .apply(BlockStateModelGenerator.UV_LOCK)
            .apply(
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

