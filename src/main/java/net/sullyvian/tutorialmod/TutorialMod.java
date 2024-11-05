package net.sullyvian.tutorialmod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.sullyvian.tutorialmod.block.ModBlocks;
import net.sullyvian.tutorialmod.item.ModFuelItems;
import net.sullyvian.tutorialmod.item.ModItemGroups;
import net.sullyvian.tutorialmod.item.ModItems;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems(); // add items
		ModBlocks.registerModBlocks(); // add blocks
		ModItemGroups.registerItemGroups(); // add creative mode item groups
		ModFuelItems.registerModItemsAsFuel(); // add fuel items
	}
}