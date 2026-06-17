package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CinnabarBricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractCinnabarBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CinnabarBricks.VERTICAL_SLAB;

    public AbstractCinnabarBricks() {
        super(CinnabarBricks.ID, VERTICAL_SLAB, "cinnabar_bricks", Items.CINNABAR_BRICKS, Items.CINNABAR_BRICK_SLAB, true);
    }
}
