package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blocks.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.HearthianDev.verticalslabs.VerticalSlabs.BLOCKS;

public class LootTableGeneration extends FabricBlockLootTableProvider {
    public LootTableGeneration(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            addDrop(block.VERTICAL_SLAB, LootTable.builder().pool(
                    LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f)).with(this.applyExplosionDecay(block.VERTICAL_SLAB,
                            ItemEntry.builder(block.VERTICAL_SLAB).apply(
                                    SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))
                                            .conditionally(BlockStatePropertyLootCondition.builder(block.VERTICAL_SLAB)
                                                    .properties(StatePredicate.Builder.create().exactMatch(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE))
                                            )
                            )
                    ))
            ));
        }
    }
}
