package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedDiorite;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPolishedDiorite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedDiorite.VERTICAL_SLAB;

    public AbstractPolishedDiorite() {
        super(PolishedDiorite.ID, VERTICAL_SLAB, "polished_diorite", Items.POLISHED_DIORITE, Items.POLISHED_DIORITE_SLAB);
    }
}
