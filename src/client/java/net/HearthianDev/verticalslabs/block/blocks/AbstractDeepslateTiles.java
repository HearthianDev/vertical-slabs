package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.DeepslateTiles;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class AbstractDeepslateTiles extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = DeepslateTiles.VERTICAL_SLAB;

    public AbstractDeepslateTiles() {
        super(DeepslateTiles.ID, VERTICAL_SLAB, "deepslate_tiles", Items.DEEPSLATE_TILES, Items.DEEPSLATE_TILE_SLAB);
    }
}
