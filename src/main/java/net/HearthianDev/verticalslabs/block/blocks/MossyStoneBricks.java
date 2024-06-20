package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class MossyStoneBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public MossyStoneBricks() {
        super("vertical_mossy_stone_brick_slab", VERTICAL_SLAB, "mossy_stone_bricks", Items.MOSSY_STONE_BRICKS, Items.MOSSY_STONE_BRICK_SLAB);
        registerBlockItem(ID, this);
    }
}
