package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SprucePlanks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractSprucePlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SprucePlanks.VERTICAL_SLAB;

    public AbstractSprucePlanks() {
        super(SprucePlanks.ID, VERTICAL_SLAB, "spruce_planks", Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, false);
    }
}
