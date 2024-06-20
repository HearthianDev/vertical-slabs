package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class Cobblestone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public Cobblestone() {
        super("vertical_cobblestone_slab", VERTICAL_SLAB, "cobblestone", Items.COBBLESTONE, Items.COBBLESTONE_SLAB);
        registerBlockItem(ID, this);
    }
}
