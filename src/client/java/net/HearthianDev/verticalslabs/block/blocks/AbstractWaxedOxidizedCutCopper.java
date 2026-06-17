package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WaxedOxidizedCutCopper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractWaxedOxidizedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WaxedOxidizedCutCopper.VERTICAL_SLAB;

    public AbstractWaxedOxidizedCutCopper() {
        super(WaxedOxidizedCutCopper.ID, VERTICAL_SLAB, "oxidized_cut_copper", Items.CUT_COPPER.waxed().oxidized(), Items.CUT_COPPER_SLAB.waxed().oxidized());
    }
}
