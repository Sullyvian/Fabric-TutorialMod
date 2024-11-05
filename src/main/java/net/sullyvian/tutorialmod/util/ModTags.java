package net.sullyvian.tutorialmod.util;

// import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sullyvian.tutorialmod.TutorialMod;

/**
 * Tags for blocks/items. Usable by other mods too
 */
public class ModTags {

    /**
     * See <code>data/tutorialmod/tags/block</code> for the list of all tagged
     * blocks.
     */
    public static class Blocks {

        // private static TagKey<Block> createTag(String name) {
        //     return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));
        // }
    }

    /**
     * See <code>data/tutorialmod/tags/item</code> for the list of all tagged items.
     */
    public static class Items {

        /**
         * A tag to define if an item is transformable on the magic block. See
         * "transformable_items.json".
         */
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = creatTag("transformable_items");

        private static TagKey<Item> creatTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name));
        }
    }
}
