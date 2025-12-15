package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.EndStoneBricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractEndStoneBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = EndStoneBricks.VERTICAL_SLAB;

    public AbstractEndStoneBricks() {
        super(EndStoneBricks.ID, VERTICAL_SLAB, "end_stone_bricks", Items.END_STONE_BRICKS, Items.END_STONE_BRICK_SLAB);
    }
}
