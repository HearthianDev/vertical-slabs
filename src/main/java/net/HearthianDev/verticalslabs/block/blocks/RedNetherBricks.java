package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class RedNetherBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public RedNetherBricks() {
        super("vertical_red_nether_brick_slab", VERTICAL_SLAB, "red_nether_bricks", Items.RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
        registerBlockItem(ID, this);
    }
}
