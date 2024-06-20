package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class MudBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB).sounds(BlockSoundGroup.MUD_BRICKS).hardness(2f).requiresTool());

    public MudBricks() {
        super("vertical_mud_brick_slab", VERTICAL_SLAB, "mud_bricks", Items.MUD_BRICKS, Items.MUD_BRICK_SLAB);
        registerBlockItem(ID, this);
    }
}
