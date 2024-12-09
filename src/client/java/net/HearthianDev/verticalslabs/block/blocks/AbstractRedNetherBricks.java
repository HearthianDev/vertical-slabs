package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.RedNetherBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractRedNetherBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = RedNetherBricks.VERTICAL_SLAB;

    public AbstractRedNetherBricks() {
        super(RedNetherBricks.ID, VERTICAL_SLAB, "red_nether_bricks", Items.RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
    }
}
