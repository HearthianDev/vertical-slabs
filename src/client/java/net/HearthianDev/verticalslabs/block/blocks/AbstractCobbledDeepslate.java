package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CobbledDeepslate;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractCobbledDeepslate extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CobbledDeepslate.VERTICAL_SLAB;

    public AbstractCobbledDeepslate() {
        super(CobbledDeepslate.ID, VERTICAL_SLAB, "cobbled_deepslate", Items.COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE_SLAB);
    }
}
