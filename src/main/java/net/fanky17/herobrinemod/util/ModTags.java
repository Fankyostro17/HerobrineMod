package net.fanky17.herobrinemod.util;

import net.fanky17.herobrinemod.HerobrineMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_OBSCURED_GEM_TOOL = createTag("needs_obscured_gem_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBSCURED_GEM_TOOL = createTag("incorrect_for_obscured_gem_tool");

        public static final TagKey<Block> NEEDS_GALAXY_TOOL = createTag("needs_galaxy_tool");
        public static final TagKey<Block> INCORRECT_FOR_GALAXY_TOOL = createTag("incorrect_for_galaxy_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HerobrineMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HerobrineMod.MOD_ID, name));
        }
    }
}
