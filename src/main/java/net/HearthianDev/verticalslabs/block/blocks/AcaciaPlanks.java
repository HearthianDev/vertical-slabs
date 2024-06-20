package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class AcaciaPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public AcaciaPlanks() {
        super("vertical_acacia_slab", VERTICAL_SLAB, "acacia_planks", Items.ACACIA_PLANKS, Items.ACACIA_SLAB, false);
        registerBlockItem(ID, this);
    }
}
