package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CutCopper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CutCopper.VERTICAL_SLAB;

    public AbstractCutCopper() {
        super(CutCopper.ID, VERTICAL_SLAB, "cut_copper", Items.CUT_COPPER.weathering().unaffected(), Items.CUT_COPPER_SLAB.weathering().unaffected());
    }
}
