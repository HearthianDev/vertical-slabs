package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.DarkOakPlanks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractDarkOakPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = DarkOakPlanks.VERTICAL_SLAB;

    public AbstractDarkOakPlanks() {
        super(DarkOakPlanks.ID, VERTICAL_SLAB, "dark_oak_planks", Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, false);
    }
}
