package net.HearthianDev.verticalslabs;

import net.HearthianDev.verticalslabs.generation.LootTableGeneration;
import net.HearthianDev.verticalslabs.generation.ModelGeneration;
import net.HearthianDev.verticalslabs.generation.RecipeGeneration;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VerticalSlabsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Adding a provider example:
        //
        // pack.addProvider(AdvancementsProvider::new);
        pack.addProvider(RecipeGeneration::new);
        pack.addProvider(LootTableGeneration::new);
        pack.addProvider(ModelGeneration::new);
    }
}
