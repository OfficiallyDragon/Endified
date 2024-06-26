package me.officiallydragon.endified.datagen;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SULFUR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDINIUM_DEBRIS);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENDIFIED_DAHLIA, ModBlocks.POTTED_ENDIFIED_DAHLIA, BlockStateModelGenerator.TintType.NOT_TINTED);

        Identifier identifier = blockStateModelGenerator.createSubModel(ModBlocks.ENDIFIED_VINES, "", Models.CROSS, TextureMap::cross);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.ENDIFIED_VINES, "_lit", Models.CROSS, TextureMap::cross);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ENDIFIED_VINES)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.BERRIES, identifier2, identifier)));
        Identifier identifier3 = blockStateModelGenerator.createSubModel(ModBlocks.ENDIFIED_VINES_PLANT, "", Models.CROSS, TextureMap::cross);
        Identifier identifier4 = blockStateModelGenerator.createSubModel(ModBlocks.ENDIFIED_VINES_PLANT, "_lit", Models.CROSS, TextureMap::cross);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ENDIFIED_VINES_PLANT)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.BERRIES, identifier4, identifier3)));
        
        endStonePool.stairs(ModBlocks.END_STONE_STAIRS);
        endStonePool.slab(ModBlocks.END_STONE_SLAB);
        endStonePool.wall(ModBlocks.END_STONE_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_0, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORE_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SULFUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SULFUR_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_CARBIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_UPGRADE_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_BERRIES, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDINIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDINIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDINIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDINIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDINIUM_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDINIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDINIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDINIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDINIUM_BOOTS));
    }
}
