package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Purpur;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPurpur extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Purpur.VERTICAL_SLAB;

    public AbstractPurpur() {
        super(Purpur.ID, VERTICAL_SLAB, "purpur_block", Items.PURPUR_BLOCK, Items.PURPUR_SLAB);
    }
}
