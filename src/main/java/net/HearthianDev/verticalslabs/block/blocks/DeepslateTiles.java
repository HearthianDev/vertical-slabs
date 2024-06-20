package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class DeepslateTiles extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public DeepslateTiles() {
        super("vertical_deepslate_tile_slab", VERTICAL_SLAB, "deepslate_tiles", Items.DEEPSLATE_TILES, Items.DEEPSLATE_TILE_SLAB);
        registerBlockItem(ID, this);
    }
}
