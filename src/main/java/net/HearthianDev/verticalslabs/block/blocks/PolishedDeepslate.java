package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class PolishedDeepslate extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public PolishedDeepslate() {
        super("vertical_polished_deepslate_slab", VERTICAL_SLAB, "polished_deepslate", Items.POLISHED_DEEPSLATE, Items.POLISHED_DEEPSLATE_SLAB);
        registerBlockItem(ID, this);
    }
}
