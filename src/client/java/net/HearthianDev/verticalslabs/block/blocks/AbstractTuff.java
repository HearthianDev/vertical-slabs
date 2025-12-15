package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Tuff;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractTuff extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Tuff.VERTICAL_SLAB;

    public AbstractTuff() {
        super(Tuff.ID, VERTICAL_SLAB, "tuff", Items.TUFF, Items.TUFF_SLAB);
    }
}
