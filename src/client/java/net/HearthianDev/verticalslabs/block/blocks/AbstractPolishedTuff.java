package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedTuff;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractPolishedTuff extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedTuff.VERTICAL_SLAB;

    public AbstractPolishedTuff() {
        super(PolishedTuff.ID, VERTICAL_SLAB, "polished_tuff", Items.TUFF, Items.TUFF_SLAB);
    }
}
