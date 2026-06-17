package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.PolishedSulfur;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractPolishedSulfur extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = PolishedSulfur.VERTICAL_SLAB;

    public AbstractPolishedSulfur() {
        super(PolishedSulfur.ID, VERTICAL_SLAB, "polished_sulfur", Items.POLISHED_SULFUR, Items.POLISHED_SULFUR_SLAB, true);
    }
}
