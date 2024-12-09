package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.TuffBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractTuffBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = TuffBricks.VERTICAL_SLAB;

    public AbstractTuffBricks() {
        super(TuffBricks.ID, VERTICAL_SLAB, "tuff_bricks", Items.TUFF_BRICKS, Items.TUFF_BRICK_SLAB);
    }
}
