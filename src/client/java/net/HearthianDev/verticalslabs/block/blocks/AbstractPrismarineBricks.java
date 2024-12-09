package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PrismarineBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPrismarineBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PrismarineBricks.VERTICAL_SLAB;

    public AbstractPrismarineBricks() {
        super(PrismarineBricks.ID, VERTICAL_SLAB, "prismarine_bricks", Items.PRISMARINE_BRICKS, Items.PRISMARINE_BRICK_SLAB);
    }
}
