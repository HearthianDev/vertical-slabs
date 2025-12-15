package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Bricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Bricks.VERTICAL_SLAB;

    public AbstractBricks() {
        super(Bricks.ID, VERTICAL_SLAB, "bricks", Items.BRICKS, Items.BRICK_SLAB);
    }
}
