package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CherryPlanks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractCherryPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CherryPlanks.VERTICAL_SLAB;

    public AbstractCherryPlanks() {
        super(CherryPlanks.ID, VERTICAL_SLAB, "cherry_planks", Items.CHERRY_PLANKS, Items.CHERRY_SLAB, false);
    }
}
