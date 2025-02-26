package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PaleOakPlanks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPaleOakPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PaleOakPlanks.VERTICAL_SLAB;

    public AbstractPaleOakPlanks() {
        super(PaleOakPlanks.ID, VERTICAL_SLAB, "pale_oak_planks", Items.PALE_OAK_PLANKS, Items.PALE_OAK_SLAB, false);
    }
}
