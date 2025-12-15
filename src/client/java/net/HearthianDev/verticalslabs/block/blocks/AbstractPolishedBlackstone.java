package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedBlackstone;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractPolishedBlackstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedBlackstone.VERTICAL_SLAB;

    public AbstractPolishedBlackstone() {
        super(PolishedBlackstone.ID, VERTICAL_SLAB, "polished_blackstone", Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_SLAB);
    }
}
