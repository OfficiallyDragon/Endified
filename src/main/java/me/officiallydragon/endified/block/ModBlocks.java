package me.officiallydragon.endified.block;

import me.officiallydragon.endified.Endified;
import me.officiallydragon.endified.block.custom.EndifiedDahliaBlock;
import me.officiallydragon.endified.block.custom.EndifiedVinesBodyBlock;
import me.officiallydragon.endified.block.custom.EndifiedVinesHeadBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
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
    public static final Block ENDIFIED_VINES = registerBlock("endified_vines", new EndifiedVinesHeadBlock(AbstractBlock.Settings.create()
            .mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().luminance(CaveVines.getLuminanceSupplier(14)).breakInstantly()
            .sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ENDIFIED_VINES_PLANT = registerBlock("endified_vines_plant", new EndifiedVinesBodyBlock(AbstractBlock.Settings.create()
            .mapColor(MapColor.DARK_GREEN).noCollision().luminance(CaveVines.getLuminanceSupplier(14)).breakInstantly()
            .sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ENDIFIED_DAHLIA = registerBlock("endified_dahlia",
            new EndifiedDahliaBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()
                    .sounds(BlockSoundGroup.FLOWERING_AZALEA).strength(3.0f,9.0f).dynamicBounds()));
    public static final Block POTTED_ENDIFIED_DAHLIA = Registry.register(Registries.BLOCK, new Identifier(Endified.MOD_ID, "potted_endified_dahlia"),
            new FlowerPotBlock(ENDIFIED_DAHLIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque().breakInstantly()));

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
