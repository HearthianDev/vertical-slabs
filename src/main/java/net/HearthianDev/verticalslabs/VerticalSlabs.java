package net.HearthianDev.verticalslabs;

import net.HearthianDev.verticalslabs.block.blocks.OakPlanks;
import net.HearthianDev.verticalslabs.block.blocks.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class VerticalSlabs implements ModInitializer {
  public static final String MOD_ID = "verticalslabs";

  public static AbstractVerticalSlabBlock[] BLOCKS = {
          new AcaciaPlanks(),
          new Andesite(),
          new BambooMosaic(),
          new BambooPlanks(),
          new BirchPlanks(),
          new Blackstone(),
          new Bricks(),
          new CherryPlanks(),
          new CobbledDeepslate(),
          new Cobblestone(),
          new CrimsomPlanks(),
          new CutCopper(),
          new CutRedSandstone(),
          new CutSandstone(),
          new DarkOakPlanks(),
          new DarkPrismarine(),
          new DeepslateBricks(),
          new DeepslateTiles(),
          new Diorite(),
          new EndStoneBricks(),
          new ExposedCutCopper(),
          new Granite(),
          new JunglePlanks(),
          new MangrovePlanks(),
          new MossyCobblestone(),
          new MossyStoneBricks(),
          new MudBricks(),
          new NetherBricks(),
          new OakPlanks(),
          new OxidizedCutCopper(),
          new PolishedAndesite(),
          new PolishedBlackstone(),
          new PolishedBlackstoneBricks(),
          new PolishedDeepslate(),
          new PolishedDiorite(),
          new PolishedGranite(),
          new PolishedTuff(),
          new Prismarine(),
          new PrismarineBricks(),
          new Purpur(),
          new Quartz(),
          new RedNetherBricks(),
          new RedSandstone(),
          new Sandstone(),
          new SmoothQuartz(),
          new SmoothRedSandstone(),
          new SmoothSandstone(),
          new SmoothStone(),
          new SprucePlanks(),
          new Stone(),
          new StoneBricks(),
          new Tuff(),
          new TuffBricks(),
          new WarpedPlanks(),
          new WaxedCutCopper(),
          new WaxedExposedCutCopper(),
          new WaxedOxidizedCutCopper(),
          new WaxedWeatheredCutCopper(),
          new WeatheredCutCopper()
  };

  @Override
  public void onInitialize() {
    initOxidizableChains();
    initCreativePlacement();
  }


  public static void registerBlockItem(String path, AbstractVerticalSlabBlock block) {
    Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block.VERTICAL_SLAB);
    Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), new BlockItem(block.VERTICAL_SLAB, new Item.Settings()));
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
