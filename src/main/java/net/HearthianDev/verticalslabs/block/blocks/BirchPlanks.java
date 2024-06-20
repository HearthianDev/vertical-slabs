package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class BirchPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public BirchPlanks() {
        super("vertical_birch_slab", VERTICAL_SLAB, "birch_planks", Items.BIRCH_PLANKS, Items.BIRCH_SLAB, false);
        registerBlockItem(ID, this);
    }
}
