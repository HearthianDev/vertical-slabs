package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.MangrovePlanks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractMangrovePlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = MangrovePlanks.VERTICAL_SLAB;

    public AbstractMangrovePlanks() {
        super(MangrovePlanks.ID, VERTICAL_SLAB, "mangrove_planks", Items.MANGROVE_PLANKS, Items.MANGROVE_SLAB, false);
    }
}
