package net.sullyvian.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.sullyvian.tutorialmod.block.ModBlocks;
import net.sullyvian.tutorialmod.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems(); // add items
		ModBlocks.registerModBlocks(); // add blocks
	}
}