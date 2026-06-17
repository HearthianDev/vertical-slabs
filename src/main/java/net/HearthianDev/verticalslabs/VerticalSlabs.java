package net.HearthianDev.verticalslabs;

import net.HearthianDev.verticalslabs.block.VerticalSlab;
import net.HearthianDev.verticalslabs.block.blockInit.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class VerticalSlabs implements ModInitializer {
    public static final String MOD_ID = "verticalslabs";

    @Override
    public void onInitialize() {
        registerBlockItem(Cinnabar.ID, Cinnabar.VERTICAL_SLAB);
        registerBlockItem(PolishedCinnabar.ID, PolishedCinnabar.VERTICAL_SLAB);
        registerBlockItem(CinnabarBricks.ID, CinnabarBricks.VERTICAL_SLAB);
        registerBlockItem(Sulfur.ID, Sulfur.VERTICAL_SLAB);
        registerBlockItem(PolishedSulfur.ID, PolishedSulfur.VERTICAL_SLAB);
        registerBlockItem(SulfurBricks.ID, SulfurBricks.VERTICAL_SLAB);
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

// TODO: make this generic
//    public static void registerBlockItem(VerticalSlab block) {
//        registerBlockItem(block.ID, block.VERTICAL_SLAB);
//    }

    public static void registerBlockItem(String path, Block block) {
        ResourceKey<@NotNull Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));
        ResourceKey<@NotNull Block> blockKey = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, path));
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        Registry.register(BuiltInRegistries.ITEM, itemKey, new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(itemKey)));
    }

    private void initOxidizableChains() {
        OxidizableBlocksRegistry.registerNextStage(CutCopper.VERTICAL_SLAB, ExposedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerNextStage(ExposedCutCopper.VERTICAL_SLAB, WeatheredCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerNextStage(WeatheredCutCopper.VERTICAL_SLAB, OxidizedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(CutCopper.VERTICAL_SLAB, WaxedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(ExposedCutCopper.VERTICAL_SLAB, WaxedExposedCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(WeatheredCutCopper.VERTICAL_SLAB, WaxedWeatheredCutCopper.VERTICAL_SLAB);
        OxidizableBlocksRegistry.registerWaxable(OxidizedCutCopper.VERTICAL_SLAB, WaxedOxidizedCutCopper.VERTICAL_SLAB);
    }

    private void initCreativePlacement() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
            content.insertBefore(Items.CINNABAR_SLAB, Cinnabar.VERTICAL_SLAB);
            content.insertBefore(Items.CINNABAR_BRICK_SLAB, CinnabarBricks.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_CINNABAR_SLAB, PolishedCinnabar.VERTICAL_SLAB);
            content.insertBefore(Items.SULFUR_SLAB, Sulfur.VERTICAL_SLAB);
            content.insertBefore(Items.SULFUR_BRICK_SLAB, SulfurBricks.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_SULFUR_SLAB, PolishedSulfur.VERTICAL_SLAB);
            content.insertBefore(Items.ACACIA_SLAB, AcaciaPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.ANDESITE_SLAB, Andesite.VERTICAL_SLAB);
            content.insertBefore(Items.BAMBOO_MOSAIC_SLAB, BambooMosaic.VERTICAL_SLAB);
            content.insertBefore(Items.BAMBOO_SLAB, BambooPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.BIRCH_SLAB, BirchPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.BLACKSTONE_SLAB, Blackstone.VERTICAL_SLAB);
            content.insertBefore(Items.BRICK_SLAB, Bricks.VERTICAL_SLAB);
            content.insertBefore(Items.CHERRY_SLAB, CherryPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.COBBLED_DEEPSLATE_SLAB, CobbledDeepslate.VERTICAL_SLAB);
            content.insertBefore(Items.COBBLESTONE_SLAB, Cobblestone.VERTICAL_SLAB);
            content.insertBefore(Items.CRIMSON_SLAB, CrimsomPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.weathering().unaffected(), CutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.weathering().exposed(), ExposedCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.weathering().oxidized(), OxidizedCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.weathering().weathered(), WeatheredCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.waxed().unaffected(), WaxedCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.waxed().exposed(), WaxedExposedCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.waxed().oxidized(), WaxedOxidizedCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_COPPER_SLAB.waxed().weathered(), WaxedWeatheredCutCopper.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_RED_SANDSTONE_SLAB, CutRedSandstone.VERTICAL_SLAB);
            content.insertBefore(Items.CUT_STANDSTONE_SLAB, CutSandstone.VERTICAL_SLAB);
            content.insertBefore(Items.DARK_OAK_SLAB, DarkOakPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.DARK_PRISMARINE_SLAB, DarkPrismarine.VERTICAL_SLAB);
            content.insertBefore(Items.DEEPSLATE_BRICK_SLAB, DeepslateBricks.VERTICAL_SLAB);
            content.insertBefore(Items.DEEPSLATE_TILE_SLAB, DeepslateTiles.VERTICAL_SLAB);
            content.insertBefore(Items.DIORITE_SLAB, Diorite.VERTICAL_SLAB);
            content.insertBefore(Items.END_STONE_BRICK_SLAB, EndStoneBricks.VERTICAL_SLAB);
            content.insertBefore(Items.GRANITE_SLAB, Granite.VERTICAL_SLAB);
            content.insertBefore(Items.JUNGLE_SLAB, JunglePlanks.VERTICAL_SLAB);
            content.insertBefore(Items.MANGROVE_SLAB, MangrovePlanks.VERTICAL_SLAB);
            content.insertBefore(Items.MOSSY_COBBLESTONE_SLAB, MossyCobblestone.VERTICAL_SLAB);
            content.insertBefore(Items.MOSSY_STONE_BRICK_SLAB, MossyStoneBricks.VERTICAL_SLAB);
            content.insertBefore(Items.MUD_BRICK_SLAB, MudBricks.VERTICAL_SLAB);
            content.insertBefore(Items.NETHER_BRICK_SLAB, NetherBricks.VERTICAL_SLAB);
            content.insertBefore(Items.OAK_SLAB, OakPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.PALE_OAK_SLAB, PaleOakPlanks.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_ANDESITE_SLAB, PolishedAndesite.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_BLACKSTONE_SLAB, PolishedBlackstone.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_BLACKSTONE_BRICK_SLAB, PolishedBlackstoneBricks.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_DEEPSLATE_SLAB, PolishedDeepslate.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_DIORITE_SLAB, PolishedDiorite.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_GRANITE_SLAB, PolishedGranite.VERTICAL_SLAB);
            content.insertBefore(Items.POLISHED_TUFF_SLAB, PolishedTuff.VERTICAL_SLAB);
            content.insertBefore(Items.PRISMARINE_SLAB, Prismarine.VERTICAL_SLAB);
            content.insertBefore(Items.PRISMARINE_BRICK_SLAB, PrismarineBricks.VERTICAL_SLAB);
            content.insertBefore(Items.PURPUR_SLAB, Purpur.VERTICAL_SLAB);
            content.insertBefore(Items.QUARTZ_SLAB, Quartz.VERTICAL_SLAB);
            content.insertBefore(Items.RED_NETHER_BRICK_SLAB, RedNetherBricks.VERTICAL_SLAB);
            content.insertBefore(Items.RED_SANDSTONE_SLAB, RedSandstone.VERTICAL_SLAB);
            content.insertBefore(Items.RESIN_BRICK_SLAB, ResinBricks.VERTICAL_SLAB);
            content.insertBefore(Items.SANDSTONE_SLAB, Sandstone.VERTICAL_SLAB);
            content.insertBefore(Items.SMOOTH_QUARTZ_SLAB, SmoothQuartz.VERTICAL_SLAB);
            content.insertBefore(Items.SMOOTH_RED_SANDSTONE_SLAB, SmoothRedSandstone.VERTICAL_SLAB);
            content.insertBefore(Items.SMOOTH_SANDSTONE_SLAB, SmoothSandstone.VERTICAL_SLAB);
            content.insertBefore(Items.SMOOTH_STONE_SLAB, SmoothStone.VERTICAL_SLAB);
            content.insertBefore(Items.SPRUCE_SLAB, SprucePlanks.VERTICAL_SLAB);
            content.insertBefore(Items.STONE_SLAB, Stone.VERTICAL_SLAB);
            content.insertBefore(Items.STONE_BRICK_SLAB, StoneBricks.VERTICAL_SLAB);
            content.insertBefore(Items.TUFF_SLAB, Tuff.VERTICAL_SLAB);
            content.insertBefore(Items.TUFF_BRICK_SLAB, TuffBricks.VERTICAL_SLAB);
            content.insertBefore(Items.WARPED_SLAB, WarpedPlanks.VERTICAL_SLAB);
        });
    }
}
