package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.BirchPlanks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractBirchPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = BirchPlanks.VERTICAL_SLAB;

    public AbstractBirchPlanks() {
        super(BirchPlanks.ID, VERTICAL_SLAB, "birch_planks", Items.BIRCH_PLANKS, Items.BIRCH_SLAB, false);
    }
}
