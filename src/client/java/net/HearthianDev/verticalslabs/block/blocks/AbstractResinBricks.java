package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.ResinBricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractResinBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = ResinBricks.VERTICAL_SLAB;

    public AbstractResinBricks() {
        super(ResinBricks.ID, VERTICAL_SLAB, "resin_bricks", Items.RESIN_BRICKS, Items.RESIN_BRICK_SLAB);
    }
}
