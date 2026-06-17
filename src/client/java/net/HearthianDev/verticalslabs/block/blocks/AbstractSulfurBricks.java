package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SulfurBricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractSulfurBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SulfurBricks.VERTICAL_SLAB;

    public AbstractSulfurBricks() {
        super(SulfurBricks.ID, VERTICAL_SLAB, "sulfur_bricks", Items.SULFUR_BRICKS, Items.SULFUR_BRICK_SLAB, true);
    }
}
