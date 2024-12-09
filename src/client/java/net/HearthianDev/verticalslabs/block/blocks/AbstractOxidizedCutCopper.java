package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.OxidizedCutCopper;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractOxidizedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = OxidizedCutCopper.VERTICAL_SLAB;

    public AbstractOxidizedCutCopper() {
        super(OxidizedCutCopper.ID, VERTICAL_SLAB, "oxidized_cut_copper", Items.OXIDIZED_CUT_COPPER, Items.OXIDIZED_CUT_COPPER_SLAB);
    }
}
