package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedBlackstoneBricks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractPolishedBlackstoneBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedBlackstoneBricks.VERTICAL_SLAB;

    public AbstractPolishedBlackstoneBricks() {
        super(PolishedBlackstoneBricks.ID, VERTICAL_SLAB, "polished_blackstone_bricks", Items.POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICK_SLAB);
    }
}
