package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.JunglePlanks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractJunglePlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = JunglePlanks.VERTICAL_SLAB;

    public AbstractJunglePlanks() {
        super(JunglePlanks.ID, VERTICAL_SLAB, "jungle_planks", Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, false);
    }
}
