package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class TuffBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB).sounds(BlockSoundGroup.TUFF_BRICKS).hardness(2f).requiresTool());

    public TuffBricks() {
        super("vertical_tuff_brick_slab", VERTICAL_SLAB, "tuff_bricks", Items.TUFF_BRICKS, Items.TUFF_BRICK_SLAB);
        registerBlockItem(ID, this);
    }
}
