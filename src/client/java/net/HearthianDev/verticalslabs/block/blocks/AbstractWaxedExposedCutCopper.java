package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WaxedExposedCutCopper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractWaxedExposedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WaxedExposedCutCopper.VERTICAL_SLAB;

    public AbstractWaxedExposedCutCopper() {
        super(WaxedExposedCutCopper.ID, VERTICAL_SLAB, "exposed_cut_copper", Items.WAXED_EXPOSED_CUT_COPPER, Items.WAXED_EXPOSED_CUT_COPPER_SLAB);
    }
}
