package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Prismarine;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractPrismarine extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Prismarine.VERTICAL_SLAB;

    public AbstractPrismarine() {
        super(Prismarine.ID, VERTICAL_SLAB, "prismarine", Items.PRISMARINE, Items.PRISMARINE_SLAB);
    }
}
