package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CutCopper;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CutCopper.VERTICAL_SLAB;

    public AbstractCutCopper() {
        super(CutCopper.ID, VERTICAL_SLAB, "cut_copper", Items.CUT_COPPER, Items.CUT_COPPER_SLAB);
    }
}
