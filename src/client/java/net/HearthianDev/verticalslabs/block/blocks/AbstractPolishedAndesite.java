package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedAndesite;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPolishedAndesite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedAndesite.VERTICAL_SLAB;

    public AbstractPolishedAndesite() {
        super(PolishedAndesite.ID, VERTICAL_SLAB, "polished_andesite", Items.POLISHED_ANDESITE, Items.POLISHED_ANDESITE_SLAB);
    }
}
