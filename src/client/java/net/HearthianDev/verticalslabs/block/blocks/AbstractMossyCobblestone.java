package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.MossyCobblestone;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractMossyCobblestone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = MossyCobblestone.VERTICAL_SLAB;

    public AbstractMossyCobblestone() {
        super(MossyCobblestone.ID, VERTICAL_SLAB, "mossy_cobblestone", Items.MOSSY_COBBLESTONE, Items.MOSSY_COBBLESTONE_SLAB);
    }
}
