package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.OakPlanks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractOakPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = OakPlanks.VERTICAL_SLAB;

    public AbstractOakPlanks() {
        super(OakPlanks.ID, VERTICAL_SLAB, "oak_planks", Items.OAK_PLANKS, Items.OAK_SLAB, false);
    }
}
