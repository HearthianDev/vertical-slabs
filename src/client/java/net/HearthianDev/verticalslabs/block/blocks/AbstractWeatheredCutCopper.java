package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WeatheredCutCopper;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractWeatheredCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WeatheredCutCopper.VERTICAL_SLAB;

    public AbstractWeatheredCutCopper() {
        super(WeatheredCutCopper.ID, VERTICAL_SLAB, "weathered_cut_copper", Items.WEATHERED_CUT_COPPER, Items.WEATHERED_CUT_COPPER_SLAB);
    }
}
