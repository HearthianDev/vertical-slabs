package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CrimsomPlanks;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractCrimsomPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CrimsomPlanks.VERTICAL_SLAB;

    public AbstractCrimsomPlanks() {
        super(CrimsomPlanks.ID, VERTICAL_SLAB, "crimson_planks", Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, false);
    }
}
