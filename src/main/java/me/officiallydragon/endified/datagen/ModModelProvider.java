package me.officiallydragon.endified.datagen;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SULFER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDINIUM_DEBRIES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_SCRAP_0, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORE_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SULFER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SULFER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_CARBIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDINIUM_UPGRADE_TEMPLATE, Models.GENERATED);
    }
}