package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.BambooMosaic;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractBambooMosaic extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = BambooMosaic.VERTICAL_SLAB;

    public AbstractBambooMosaic() {
        super(BambooMosaic.ID, VERTICAL_SLAB, "bamboo_mosaic", Items.BAMBOO_MOSAIC, Items.BAMBOO_MOSAIC_SLAB, false);
    }
}
