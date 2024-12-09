package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Stone;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractStone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Stone.VERTICAL_SLAB;

    public AbstractStone() {
        super(Stone.ID, VERTICAL_SLAB, "stone", Items.STONE, Items.STONE_SLAB);
    }
}
