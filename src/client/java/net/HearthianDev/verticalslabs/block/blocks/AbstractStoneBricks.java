package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.StoneBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractStoneBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = StoneBricks.VERTICAL_SLAB;

    public AbstractStoneBricks() {
        super(StoneBricks.ID, VERTICAL_SLAB, "stone_bricks", Items.STONE_BRICKS, Items.STONE_BRICK_SLAB);
    }
}
