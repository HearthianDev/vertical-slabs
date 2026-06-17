package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WaxedCutCopper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractWaxedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WaxedCutCopper.VERTICAL_SLAB;

    public AbstractWaxedCutCopper() {
        super(WaxedCutCopper.ID, VERTICAL_SLAB, "cut_copper", Items.CUT_COPPER.waxed().unaffected(), Items.CUT_COPPER_SLAB.waxed().unaffected());
    }
}
