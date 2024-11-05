package net.sullyvian.tutorialmod.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;
import net.sullyvian.tutorialmod.block.ModBlocks;

/**
 * Create block tags in the /block tags directory
 */
public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup wrapperLookup) {
        // add the blocks to mineable/pickaxe.json
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                // add the Pink Garnet's derivatives
                .add(ModBlocks.PINK_GARNET_STAIRS, ModBlocks.PINK_GARNET_SLAB, ModBlocks.PINK_GARNET_BUTTON,
                        ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModBlocks.PINK_GARNET_FENCE,
                        ModBlocks.PINK_GARNET_FENCE_GATE, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_DOOR,
                        ModBlocks.PINK_GARNET_TRAPDOOR);

        // add the blocks to needs_iron_tool.json
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                // add the Pink Garnet's derivatives
                .add(ModBlocks.PINK_GARNET_STAIRS, ModBlocks.PINK_GARNET_SLAB, ModBlocks.PINK_GARNET_BUTTON,
                        ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModBlocks.PINK_GARNET_FENCE,
                        ModBlocks.PINK_GARNET_FENCE_GATE, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_DOOR,
                        ModBlocks.PINK_GARNET_TRAPDOOR);

        // to connect to fences / walls (possible to only include wooden fences)
        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);
    }

}
