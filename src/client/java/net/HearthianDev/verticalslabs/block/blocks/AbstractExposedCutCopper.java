package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.ExposedCutCopper;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractExposedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = ExposedCutCopper.VERTICAL_SLAB;

    public AbstractExposedCutCopper() {
        super(ExposedCutCopper.ID, VERTICAL_SLAB, "exposed_cut_copper", Items.EXPOSED_CUT_COPPER, Items.EXPOSED_CUT_COPPER_SLAB);
    }
}
