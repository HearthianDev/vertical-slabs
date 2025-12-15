package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Andesite;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractAndesite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Andesite.VERTICAL_SLAB;

    public AbstractAndesite() {
        super(Andesite.ID, VERTICAL_SLAB, "andesite", Items.ANDESITE, Items.ANDESITE_SLAB);
    }
}
