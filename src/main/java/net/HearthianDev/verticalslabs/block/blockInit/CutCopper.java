package net.HearthianDev.verticalslabs.block.blockInit;

import net.HearthianDev.verticalslabs.block.CopperVerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.HearthianDev.verticalslabs.VerticalSlabs.MOD_ID;

public class CutCopper {
    public static final String ID = "vertical_cut_copper_slab";
    public static final Block VERTICAL_SLAB = new CopperVerticalSlabBlock(
            Oxidizable.OxidationLevel.UNAFFECTED,
            AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB)
                    .sounds(BlockSoundGroup.METAL)
                    .hardness(2f)
                    .requiresTool()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "vertical_cut_copper_slab")))
    );
}
