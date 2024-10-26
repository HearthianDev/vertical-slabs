package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.HearthianDev.verticalslabs.VerticalSlabs.MOD_ID;
import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class DeepslateBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)
                    .sounds(BlockSoundGroup.STONE)
                    .hardness(2f)
                    .requiresTool()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "vertical_deepslate_brick_slab")))
    );

    public DeepslateBricks() {
        super("vertical_deepslate_brick_slab", VERTICAL_SLAB, "deepslate_bricks", Items.DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICK_SLAB);
        registerBlockItem(ID, this);
    }
}
