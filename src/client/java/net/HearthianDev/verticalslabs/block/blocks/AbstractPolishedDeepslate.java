package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedDeepslate;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPolishedDeepslate extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedDeepslate.VERTICAL_SLAB;

    public AbstractPolishedDeepslate() {
        super(PolishedDeepslate.ID, VERTICAL_SLAB, "polished_deepslate", Items.POLISHED_DEEPSLATE, Items.POLISHED_DEEPSLATE_SLAB);
    }
}
