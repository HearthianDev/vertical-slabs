package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.Optional;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class MudBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB).sounds(BlockSoundGroup.MUD_BRICKS).hardness(2f).requiresTool());

    public MudBricks() {
        super("vertical_mud_brick_slab", VERTICAL_SLAB, "mud_bricks", Items.MUD_BRICKS, Items.MUD_BRICK_SLAB);
        registerBlockItem(ID, this);
    }

    @Override
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
