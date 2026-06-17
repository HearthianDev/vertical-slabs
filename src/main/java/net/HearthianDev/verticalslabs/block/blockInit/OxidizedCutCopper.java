package net.HearthianDev.verticalslabs.block.blockInit;

import net.HearthianDev.verticalslabs.block.CopperVerticalSlabBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.HearthianDev.verticalslabs.VerticalSlabs.MOD_ID;

//TODO: remove sound, destroy and requires tool because is being copied from line 21

public class OxidizedCutCopper {
    public static final String ID = "vertical_oxidized_cut_copper_slab";
    public static final Block VERTICAL_SLAB = new CopperVerticalSlabBlock(
        WeatheringCopper.WeatherState.UNAFFECTED,
        BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER_SLAB.weathering().oxidized())
            .sound(SoundType.METAL)
            .destroyTime(2f)
            .requiresCorrectToolForDrops()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "vertical_oxidized_cut_copper_slab")))
    );
}
