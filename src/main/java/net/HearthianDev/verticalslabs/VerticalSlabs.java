package net.HearthianDev.verticalslabs;

import net.HearthianDev.verticalslabs.block.blockInit.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class VerticalSlabs implements ModInitializer {
    public static final String MOD_ID = "verticalslabs";

    @Override
    public void onInitialize() {
        registerBlockItem(AcaciaPlanks.ID, AcaciaPlanks.VERTICAL_SLAB);
        registerBlockItem(Andesite.ID, Andesite.VERTICAL_SLAB);
        registerBlockItem(BambooMosaic.ID, BambooMosaic.VERTICAL_SLAB);
        registerBlockItem(BambooPlanks.ID, BambooPlanks.VERTICAL_SLAB);
        registerBlockItem(BirchPlanks.ID, BirchPlanks.VERTICAL_SLAB);
        registerBlockItem(Blackstone.ID, Blackstone.VERTICAL_SLAB);
        registerBlockItem(Bricks.ID, Bricks.VERTICAL_SLAB);
        registerBlockItem(CherryPlanks.ID, CherryPlanks.VERTICAL_SLAB);
        registerBlockItem(CobbledDeepslate.ID, CobbledDeepslate.VERTICAL_SLAB);
        registerBlockItem(Cobblestone.ID, Cobblestone.VERTICAL_SLAB);
        registerBlockItem(CrimsomPlanks.ID, CrimsomPlanks.VERTICAL_SLAB);
        registerBlockItem(CutCopper.ID, CutCopper.VERTICAL_SLAB);
        registerBlockItem(CutRedSandstone.ID, CutRedSandstone.VERTICAL_SLAB);
        registerBlockItem(CutSandstone.ID, CutSandstone.VERTICAL_SLAB);
        registerBlockItem(DarkOakPlanks.ID, DarkOakPlanks.VERTICAL_SLAB);
        registerBlockItem(DarkPrismarine.ID, DarkPrismarine.VERTICAL_SLAB);
        registerBlockItem(DeepslateBricks.ID, DeepslateBricks.VERTICAL_SLAB);
        registerBlockItem(DeepslateTiles.ID, DeepslateTiles.VERTICAL_SLAB);
        registerBlockItem(Diorite.ID, Diorite.VERTICAL_SLAB);
        registerBlockItem(EndStoneBricks.ID, EndStoneBricks.VERTICAL_SLAB);
        registerBlockItem(ExposedCutCopper.ID, ExposedCutCopper.VERTICAL_SLAB);
        registerBlockItem(Granite.ID, Granite.VERTICAL_SLAB);
        registerBlockItem(JunglePlanks.ID, JunglePlanks.VERTICAL_SLAB);
        registerBlockItem(MangrovePlanks.ID, MangrovePlanks.VERTICAL_SLAB);
        registerBlockItem(MossyCobblestone.ID, MossyCobblestone.VERTICAL_SLAB);
        registerBlockItem(MossyStoneBricks.ID, MossyStoneBricks.VERTICAL_SLAB);
        registerBlockItem(MudBricks.ID, MudBricks.VERTICAL_SLAB);
        registerBlockItem(NetherBricks.ID, NetherBricks.VERTICAL_SLAB);
        registerBlockItem(OakPlanks.ID, OakPlanks.VERTICAL_SLAB);
        registerBlockItem(OxidizedCutCopper.ID, OxidizedCutCopper.VERTICAL_SLAB);
        registerBlockItem(PaleOakPlanks.ID, PaleOakPlanks.VERTICAL_SLAB);
        registerBlockItem(PolishedAndesite.ID, PolishedAndesite.VERTICAL_SLAB);
        registerBlockItem(PolishedBlackstone.ID, PolishedBlackstone.VERTICAL_SLAB);
        registerBlockItem(PolishedBlackstoneBricks.ID, PolishedBlackstoneBricks.VERTICAL_SLAB);
        registerBlockItem(PolishedDeepslate.ID, PolishedDeepslate.VERTICAL_SLAB);
        registerBlockItem(PolishedDiorite.ID, PolishedDiorite.VERTICAL_SLAB);
        registerBlockItem(PolishedGranite.ID, PolishedGranite.VERTICAL_SLAB);
        registerBlockItem(PolishedTuff.ID, PolishedTuff.VERTICAL_SLAB);
        registerBlockItem(Prismarine.ID, Prismarine.VERTICAL_SLAB);
        registerBlockItem(PrismarineBricks.ID, PrismarineBricks.VERTICAL_SLAB);
        registerBlockItem(Purpur.ID, Purpur.VERTICAL_SLAB);
        registerBlockItem(Quartz.ID, Quartz.VERTICAL_SLAB);
        registerBlockItem(RedNetherBricks.ID, RedNetherBricks.VERTICAL_SLAB);
        registerBlockItem(RedSandstone.ID, RedSandstone.VERTICAL_SLAB);
        registerBlockItem(ResinBricks.ID, ResinBricks.VERTICAL_SLAB);
        registerBlockItem(Sandstone.ID, Sandstone.VERTICAL_SLAB);
        registerBlockItem(SmoothQuartz.ID, SmoothQuartz.VERTICAL_SLAB);
        registerBlockItem(SmoothRedSandstone.ID, SmoothRedSandstone.VERTICAL_SLAB);
        registerBlockItem(SmoothSandstone.ID, SmoothSandstone.VERTICAL_SLAB);
        registerBlockItem(SmoothStone.ID, SmoothStone.VERTICAL_SLAB);
        registerBlockItem(SprucePlanks.ID, SprucePlanks.VERTICAL_SLAB);
        registerBlockItem(Stone.ID, Stone.VERTICAL_SLAB);
        registerBlockItem(StoneBricks.ID, StoneBricks.VERTICAL_SLAB);
        registerBlockItem(Tuff.ID, Tuff.VERTICAL_SLAB);
        registerBlockItem(TuffBricks.ID, TuffBricks.VERTICAL_SLAB);
        registerBlockItem(WarpedPlanks.ID, WarpedPlanks.VERTICAL_SLAB);
        registerBlockItem(WaxedCutCopper.ID, WaxedCutCopper.VERTICAL_SLAB);
        registerBlockItem(WaxedExposedCutCopper.ID, WaxedExposedCutCopper.VERTICAL_SLAB);
        registerBlockItem(WaxedOxidizedCutCopper.ID, WaxedOxidizedCutCopper.VERTICAL_SLAB);
        registerBlockItem(WaxedWeatheredCutCopper.ID, WaxedWeatheredCutCopper.VERTICAL_SLAB);
        registerBlockItem(WeatheredCutCopper.ID, WeatheredCutCopper.VERTICAL_SLAB);

        initOxidizableChains();
        initCreativePlacement();
    }

    public static void registerBlockItem(String path, Block block) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, path));
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, path));
        Registry.register(Registries.BLOCK, blockKey, block);
        Registry.register(Registries.ITEM, itemKey, new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(itemKey)));
    }

    private void initOxidizableChains() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CutCopper.VERTICAL_SLAB, ExposedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ExposedCutCopper.VERTICAL_SLAB, WeatheredCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WeatheredCutCopper.VERTICAL_SLAB, OxidizedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CutCopper.VERTICAL_SLAB, WaxedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ExposedCutCopper.VERTICAL_SLAB, WaxedExposedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WeatheredCutCopper.VERTICAL_SLAB, WaxedWeatheredCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OxidizedCutCopper.VERTICAL_SLAB, WaxedOxidizedCutCopper.VERTICAL_SLAB);
    }

    private void initCreativePlacement() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addBefore(Items.ACACIA_SLAB, AcaciaPlanks.VERTICAL_SLAB);
            content.addBefore(Items.ANDESITE_SLAB, Andesite.VERTICAL_SLAB);
            content.addBefore(Items.BAMBOO_MOSAIC_SLAB, BambooMosaic.VERTICAL_SLAB);
            content.addBefore(Items.BAMBOO_SLAB, BambooPlanks.VERTICAL_SLAB);
            content.addBefore(Items.BIRCH_SLAB, BirchPlanks.VERTICAL_SLAB);
            content.addBefore(Items.BLACKSTONE_SLAB, Blackstone.VERTICAL_SLAB);
            content.addBefore(Items.BRICK_SLAB, Bricks.VERTICAL_SLAB);
            content.addBefore(Items.CHERRY_SLAB, CherryPlanks.VERTICAL_SLAB);
            content.addBefore(Items.COBBLED_DEEPSLATE_SLAB, CobbledDeepslate.VERTICAL_SLAB);
            content.addBefore(Items.COBBLESTONE_SLAB, Cobblestone.VERTICAL_SLAB);
            content.addBefore(Items.CRIMSON_SLAB, CrimsomPlanks.VERTICAL_SLAB);
            content.addBefore(Items.CUT_COPPER_SLAB, CutCopper.VERTICAL_SLAB);
            content.addBefore(Items.CUT_RED_SANDSTONE_SLAB, CutRedSandstone.VERTICAL_SLAB);
            content.addBefore(Items.CUT_SANDSTONE_SLAB, CutSandstone.VERTICAL_SLAB);
            content.addBefore(Items.DARK_OAK_SLAB, DarkOakPlanks.VERTICAL_SLAB);
            content.addBefore(Items.DARK_PRISMARINE_SLAB, DarkPrismarine.VERTICAL_SLAB);
            content.addBefore(Items.DEEPSLATE_BRICK_SLAB, DeepslateBricks.VERTICAL_SLAB);
            content.addBefore(Items.DEEPSLATE_TILE_SLAB, DeepslateTiles.VERTICAL_SLAB);
            content.addBefore(Items.DIORITE_SLAB, Diorite.VERTICAL_SLAB);
            content.addBefore(Items.END_STONE_BRICK_SLAB, EndStoneBricks.VERTICAL_SLAB);
            content.addBefore(Items.EXPOSED_CUT_COPPER_SLAB, ExposedCutCopper.VERTICAL_SLAB);
            content.addBefore(Items.GRANITE_SLAB, Granite.VERTICAL_SLAB);
            content.addBefore(Items.JUNGLE_SLAB, JunglePlanks.VERTICAL_SLAB);
            content.addBefore(Items.MANGROVE_SLAB, MangrovePlanks.VERTICAL_SLAB);
            content.addBefore(Items.MOSSY_COBBLESTONE_SLAB, MossyCobblestone.VERTICAL_SLAB);
            content.addBefore(Items.MOSSY_STONE_BRICK_SLAB, MossyStoneBricks.VERTICAL_SLAB);
            content.addBefore(Items.MUD_BRICK_SLAB, MudBricks.VERTICAL_SLAB);
            content.addBefore(Items.NETHER_BRICK_SLAB, NetherBricks.VERTICAL_SLAB);
            content.addBefore(Items.OAK_SLAB, OakPlanks.VERTICAL_SLAB);
            content.addBefore(Items.OXIDIZED_CUT_COPPER_SLAB, OxidizedCutCopper.VERTICAL_SLAB);
            content.addBefore(Items.PALE_OAK_SLAB, PaleOakPlanks.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_ANDESITE_SLAB, PolishedAndesite.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_BLACKSTONE_SLAB, PolishedBlackstone.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_BLACKSTONE_BRICK_SLAB, PolishedBlackstoneBricks.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_DEEPSLATE_SLAB, PolishedDeepslate.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_DIORITE_SLAB, PolishedDiorite.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_GRANITE_SLAB, PolishedGranite.VERTICAL_SLAB);
            content.addBefore(Items.POLISHED_TUFF_SLAB, PolishedTuff.VERTICAL_SLAB);
            content.addBefore(Items.PRISMARINE_SLAB, Prismarine.VERTICAL_SLAB);
            content.addBefore(Items.PRISMARINE_BRICK_SLAB, PrismarineBricks.VERTICAL_SLAB);
            content.addBefore(Items.PURPUR_SLAB, Purpur.VERTICAL_SLAB);
            content.addBefore(Items.QUARTZ_SLAB, Quartz.VERTICAL_SLAB);
            content.addBefore(Items.RED_NETHER_BRICK_SLAB, RedNetherBricks.VERTICAL_SLAB);
            content.addBefore(Items.RED_SANDSTONE_SLAB, RedSandstone.VERTICAL_SLAB);
            content.addBefore(Items.RESIN_BRICK_SLAB, ResinBricks.VERTICAL_SLAB);
            content.addBefore(Items.SANDSTONE_SLAB, Sandstone.VERTICAL_SLAB);
            content.addBefore(Items.SMOOTH_QUARTZ_SLAB, SmoothQuartz.VERTICAL_SLAB);
            content.addBefore(Items.SMOOTH_RED_SANDSTONE_SLAB, SmoothRedSandstone.VERTICAL_SLAB);
            content.addBefore(Items.SMOOTH_SANDSTONE_SLAB, SmoothSandstone.VERTICAL_SLAB);
            content.addBefore(Items.SMOOTH_STONE_SLAB, SmoothStone.VERTICAL_SLAB);
            content.addBefore(Items.SPRUCE_SLAB, SprucePlanks.VERTICAL_SLAB);
            content.addBefore(Items.STONE_SLAB, Stone.VERTICAL_SLAB);
            content.addBefore(Items.STONE_BRICK_SLAB, StoneBricks.VERTICAL_SLAB);
            content.addBefore(Items.TUFF_SLAB, Tuff.VERTICAL_SLAB);
            content.addBefore(Items.TUFF_BRICK_SLAB, TuffBricks.VERTICAL_SLAB);
            content.addBefore(Items.WARPED_SLAB, WarpedPlanks.VERTICAL_SLAB);
            content.addBefore(Items.WAXED_CUT_COPPER_SLAB, WaxedCutCopper.VERTICAL_SLAB);
            content.addBefore(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, WaxedExposedCutCopper.VERTICAL_SLAB);
            content.addBefore(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, WaxedOxidizedCutCopper.VERTICAL_SLAB);
            content.addBefore(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, WaxedWeatheredCutCopper.VERTICAL_SLAB);
            content.addBefore(Items.WEATHERED_CUT_COPPER_SLAB, WeatheredCutCopper.VERTICAL_SLAB);
        });
    }
}
