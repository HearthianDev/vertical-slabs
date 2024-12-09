package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WaxedCutCopper;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractWaxedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WaxedCutCopper.VERTICAL_SLAB;

    public AbstractWaxedCutCopper() {
        super(WaxedCutCopper.ID, VERTICAL_SLAB, "cut_copper", Items.WAXED_CUT_COPPER, Items.WAXED_CUT_COPPER_SLAB);
    }
}
