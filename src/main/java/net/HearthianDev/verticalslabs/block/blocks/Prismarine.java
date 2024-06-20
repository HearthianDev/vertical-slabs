package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class Prismarine extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public Prismarine() {
        super("vertical_prismarine_slab", VERTICAL_SLAB, "prismarine", Items.PRISMARINE, Items.PRISMARINE_SLAB);
        registerBlockItem(ID, this);
    }
}
