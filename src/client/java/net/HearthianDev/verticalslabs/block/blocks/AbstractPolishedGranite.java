package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedGranite;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPolishedGranite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedGranite.VERTICAL_SLAB;

    public AbstractPolishedGranite() {
        super(PolishedGranite.ID, VERTICAL_SLAB, "polished_granite", Items.POLISHED_GRANITE, Items.POLISHED_GRANITE_SLAB);
    }
}
