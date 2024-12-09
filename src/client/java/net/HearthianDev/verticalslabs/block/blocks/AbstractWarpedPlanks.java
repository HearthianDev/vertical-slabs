package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WarpedPlanks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractWarpedPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WarpedPlanks.VERTICAL_SLAB;

    public AbstractWarpedPlanks() {
        super(WarpedPlanks.ID, VERTICAL_SLAB, "warped_planks", Items.WARPED_PLANKS, Items.WARPED_SLAB, false);
    }
}
