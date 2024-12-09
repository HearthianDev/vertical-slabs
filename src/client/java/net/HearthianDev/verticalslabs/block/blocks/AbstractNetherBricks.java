package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.NetherBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractNetherBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = NetherBricks.VERTICAL_SLAB;

    public AbstractNetherBricks() {
        super(NetherBricks.ID, VERTICAL_SLAB, "nether_bricks", Items.NETHER_BRICKS, Items.NETHER_BRICK_SLAB);
    }
}
