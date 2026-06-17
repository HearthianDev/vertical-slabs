package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Cinnabar;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractCinnabar extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Cinnabar.VERTICAL_SLAB;

    public AbstractCinnabar() {
        super(Cinnabar.ID, VERTICAL_SLAB, "cinnabar", Items.CINNABAR, Items.CINNABAR_SLAB, true);
    }
}
