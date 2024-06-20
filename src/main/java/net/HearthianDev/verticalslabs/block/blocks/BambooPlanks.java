package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class BambooPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB).sounds(BlockSoundGroup.BAMBOO_WOOD).hardness(2f));

    public BambooPlanks() {
        super("vertical_bamboo_slab", VERTICAL_SLAB, "bamboo_planks", Items.BAMBOO_PLANKS, Items.BAMBOO_SLAB, false);
        registerBlockItem(ID, this);
    }
}
