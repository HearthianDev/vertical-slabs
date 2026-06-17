package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Sulfur;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractSulfur extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Sulfur.VERTICAL_SLAB;

    public AbstractSulfur() {
        super(Sulfur.ID, VERTICAL_SLAB, "sulfur", Items.SULFUR, Items.SULFUR_SLAB, true);
    }
}
