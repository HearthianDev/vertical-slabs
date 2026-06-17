package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.enums.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import java.util.concurrent.CompletableFuture;

import static net.HearthianDev.verticalslabs.VerticalSlabsClient.BLOCKS;

public class LootTableGeneration extends FabricBlockLootSubProvider {
    public LootTableGeneration(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            dropOther(block.VERTICAL_SLAB, (ItemLike) LootTable.lootTable().withPool(
                    LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f)).add(this.applyExplosionDecay(block.VERTICAL_SLAB,
                            LootItem.lootTableItem(block.VERTICAL_SLAB).apply(
                                    SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))
                                            .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block.VERTICAL_SLAB)
                                                    .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE))
                                            )
                            )
                    ))
            ));
        }
    }
}
