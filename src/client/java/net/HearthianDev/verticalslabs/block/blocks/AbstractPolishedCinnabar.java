package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedCinnabar;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractPolishedCinnabar extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedCinnabar.VERTICAL_SLAB;

    public AbstractPolishedCinnabar() {
        super(PolishedCinnabar.ID, VERTICAL_SLAB, "polished_cinnabar", Items.POLISHED_CINNABAR, Items.POLISHED_CINNABAR_SLAB, true);
    }
}
