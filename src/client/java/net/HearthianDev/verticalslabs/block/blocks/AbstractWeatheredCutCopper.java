package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.WeatheredCutCopper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractWeatheredCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = WeatheredCutCopper.VERTICAL_SLAB;

    public AbstractWeatheredCutCopper() {
        super(WeatheredCutCopper.ID, VERTICAL_SLAB, "weathered_cut_copper", Items.CUT_COPPER.weathering().weathered(), Items.CUT_COPPER_SLAB.weathering().weathered());
    }
}
