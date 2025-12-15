package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.MossyStoneBricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractMossyStoneBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = MossyStoneBricks.VERTICAL_SLAB;

    public AbstractMossyStoneBricks() {
        super(MossyStoneBricks.ID, VERTICAL_SLAB, "mossy_stone_bricks", Items.MOSSY_STONE_BRICKS, Items.MOSSY_STONE_BRICK_SLAB);
    }
}
