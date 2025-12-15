package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Diorite;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractDiorite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Diorite.VERTICAL_SLAB;

    public AbstractDiorite() {
        super(Diorite.ID, VERTICAL_SLAB, "diorite", Items.DIORITE, Items.DIORITE_SLAB);
    }
}
