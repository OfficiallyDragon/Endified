package me.officiallydragon.endified.datagen;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDINIUM_SMELTABLES = List.of(ModBlocks.ENDINIUM_DEBRIS);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ENDINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_0, 0.7f, 200, "endinium");
        offerBlasting(exporter, ENDINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_0, 1.4f, 100, "endinium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDINIUM_CARBIDE, RecipeCategory.MISC, ModBlocks.ENDINIUM_BLOCK);
        
        createStairsRecipe(ModBlocks.END_STONE_STAIRS, Ingredient.ofItems(Blocks.END_STONE)).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.END_STONE_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.SULFUR_DUST, ModItems.RAW_SULFUR, 1);



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_SWORD), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_SWORD).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_SWORD) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_AXE), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_AXE).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_AXE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_HOE), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_HOE).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_HOE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_PICKAXE), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_PICKAXE).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_PICKAXE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_SHOVEL), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_SHOVEL).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_SHOVEL) + "_smithing");

    }

}
