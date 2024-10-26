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

public class BambooMosaic extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(
            AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .hardness(2f)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "vertical_bamboo_mosaic_slab")))
    );

    public BambooMosaic() {
        super("vertical_bamboo_mosaic_slab", VERTICAL_SLAB, "bamboo_mosaic", Items.BAMBOO_MOSAIC, Items.BAMBOO_MOSAIC_SLAB, false);
        registerBlockItem(ID, this);
    }
}
