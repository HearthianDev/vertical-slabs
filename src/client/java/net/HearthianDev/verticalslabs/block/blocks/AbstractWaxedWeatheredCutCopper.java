package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WaxedWeatheredCutCopper;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractWaxedWeatheredCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WaxedWeatheredCutCopper.VERTICAL_SLAB;

    public AbstractWaxedWeatheredCutCopper() {
        super(WaxedWeatheredCutCopper.ID, VERTICAL_SLAB, "weathered_cut_copper", Items.WAXED_WEATHERED_CUT_COPPER, Items.WAXED_WEATHERED_CUT_COPPER_SLAB);
    }
}
