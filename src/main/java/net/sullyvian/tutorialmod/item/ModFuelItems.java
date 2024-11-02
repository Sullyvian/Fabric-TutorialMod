package net.sullyvian.tutorialmod.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelItems {

    public static void registerModItemsAsFuel() {
        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);

    }
}
