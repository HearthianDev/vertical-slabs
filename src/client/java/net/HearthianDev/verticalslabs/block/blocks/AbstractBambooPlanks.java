package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.BambooPlanks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractBambooPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = BambooPlanks.VERTICAL_SLAB;

    public AbstractBambooPlanks() {
        super(BambooPlanks.ID, VERTICAL_SLAB, "bamboo_planks", Items.BAMBOO_PLANKS, Items.BAMBOO_SLAB, false);
    }
}
