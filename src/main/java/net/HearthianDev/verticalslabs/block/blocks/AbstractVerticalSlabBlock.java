package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
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
            new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/" + this.PARENT_ID)),
            blockStateModelGenerator.modelCollector
        );
    }

    public MultipartBlockStateSupplier getBlockStates(MultipartBlockStateSupplier supplier) {
        return supplier
                .with(When.create().set(Properties.HORIZONTAL_FACING, Direction.NORTH).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, true)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.EAST).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, true)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.SOUTH).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, true)
                ).with(When.create().set(Properties.HORIZONTAL_FACING, Direction.WEST).set(VerticalSlabBlock.TYPE, VerticalSlabType.HALF),
                        BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                .put(VariantSettings.MODEL, Identifier.of("verticalslabs:block/" + this.ID))
                                .put(VariantSettings.UVLOCK, true)
                ).with(When.create().set(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, Identifier.ofVanilla("block/" + this.PARENT_ID))
                );
    }
}

