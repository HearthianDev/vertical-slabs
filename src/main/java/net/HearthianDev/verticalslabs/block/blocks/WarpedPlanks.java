package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class WarpedPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public WarpedPlanks() {
        super("vertical_warped_slab", VERTICAL_SLAB, "warped_planks", Items.WARPED_PLANKS, Items.WARPED_SLAB, false);
        registerBlockItem(ID, this);
    }
}
