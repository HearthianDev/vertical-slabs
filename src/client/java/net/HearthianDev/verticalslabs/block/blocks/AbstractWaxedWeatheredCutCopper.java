package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WaxedWeatheredCutCopper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractWaxedWeatheredCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WaxedWeatheredCutCopper.VERTICAL_SLAB;

    public AbstractWaxedWeatheredCutCopper() {
        super(WaxedWeatheredCutCopper.ID, VERTICAL_SLAB, "weathered_cut_copper", Items.CUT_COPPER.waxed().weathered(), Items.CUT_COPPER_SLAB.waxed().weathered());
    }
}
