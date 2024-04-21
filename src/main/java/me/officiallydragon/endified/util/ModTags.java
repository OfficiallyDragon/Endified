package me.officiallydragon.endified.util;

import me.officiallydragon.endified.Endified;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORE_DETECTOR_DETECTABLE_BLOCKS = createTag("ore_detector_detectable_blocks");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Endified.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Endified.MOD_ID, name));
        }
    }

}
