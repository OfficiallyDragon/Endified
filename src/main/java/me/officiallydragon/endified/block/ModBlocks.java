package me.officiallydragon.endified.block;

import me.officiallydragon.endified.Endified;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ENDINIUM_BLOCK = registerBlock("endinium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block ENDINIUM_DEBRIS = registerBlock("endinium_debris",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(25.0f,1200.0f)));
    public static final Block SULFUR_ORE = registerBlock("sulfur_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.TUFF).strength(3.0f,9.0f)));
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.TUFF).strength(3.0f,9.0f)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(FabricBlockSettings
                    .copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.TUFF).strength(3.0f,9.0f)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings
                    .copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.TUFF).strength(3.0f,9.0f)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Endified.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Endified.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Endified.LOGGER.info("Registering ModBlocks for " + Endified.MOD_ID);
    }
}
