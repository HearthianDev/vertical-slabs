package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.DeepslateBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractDeepslateBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = DeepslateBricks.VERTICAL_SLAB;

    public AbstractDeepslateBricks() {
        super(DeepslateBricks.ID, VERTICAL_SLAB, "deepslate_bricks", Items.DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICK_SLAB);
    }
}
