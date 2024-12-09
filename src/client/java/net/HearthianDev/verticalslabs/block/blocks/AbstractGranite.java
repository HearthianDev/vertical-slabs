package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Granite;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractGranite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Granite.VERTICAL_SLAB;

    public AbstractGranite() {
        super(Granite.ID, VERTICAL_SLAB, "granite", Items.GRANITE, Items.GRANITE_SLAB);
    }
}
