package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.DarkPrismarine;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractDarkPrismarine extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = DarkPrismarine.VERTICAL_SLAB;

    public AbstractDarkPrismarine() {
        super(DarkPrismarine.ID, VERTICAL_SLAB, "dark_prismarine", Items.DARK_PRISMARINE, Items.DARK_PRISMARINE_SLAB);
    }
}
