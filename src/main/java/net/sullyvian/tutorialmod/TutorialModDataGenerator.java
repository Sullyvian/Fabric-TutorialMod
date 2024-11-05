package net.sullyvian.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sullyvian.tutorialmod.datagen.ModBlockTagProvider;
import net.sullyvian.tutorialmod.datagen.ModItemTagProvider;
import net.sullyvian.tutorialmod.datagen.ModLootTableProvider;
import net.sullyvian.tutorialmod.datagen.ModModelProvider;
import net.sullyvian.tutorialmod.datagen.ModRecipeProvider;

/**
 * Generates all blockstates, models and data json files
 */
public class TutorialModDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new); // add the block tag provider
		pack.addProvider(ModItemTagProvider::new); // add the item tag provider
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
