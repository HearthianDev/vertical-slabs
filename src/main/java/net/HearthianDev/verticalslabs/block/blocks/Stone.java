package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class Stone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public Stone() {
        super("vertical_stone_slab", VERTICAL_SLAB, "stone", Items.STONE, Items.STONE_SLAB);
        registerBlockItem(ID, this);
    }
}
