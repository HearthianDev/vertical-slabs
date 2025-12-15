package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Cobblestone;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractCobblestone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Cobblestone.VERTICAL_SLAB;

    public AbstractCobblestone() {
        super(Cobblestone.ID, VERTICAL_SLAB, "cobblestone", Items.COBBLESTONE, Items.COBBLESTONE_SLAB);
    }
}
