package me.officiallydragon.endified.datagen;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.ModItems;
import me.officiallydragon.endified.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORE_DETECTOR)
                .input(Character.valueOf('I'), Items.IRON_INGOT)
                .input(Character.valueOf('C'), ModItems.ENDINIUM_CARBIDE)
                .pattern("  I")
                .pattern(" I ")
                .pattern("CC ")
                .criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ORE_DETECTOR) + "_crafting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDINIUM_CARBIDE)
                .input(Character.valueOf('N'), Items.NETHERITE_SCRAP)
                .input(Character.valueOf('E'), ModItems.ENDINIUM_SCRAP_4)
                .pattern("NE ")
                .pattern("NEE")
                .pattern("NNE")
                .criterion("has_endinium_scrap_4", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_SCRAP_4))
                .offerTo(exporter,RecipeProvider.getItemPath(ModItems.ENDINIUM_CARBIDE) + "_crafting");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(ModItems.ENDINIUM_SCRAP_0), Ingredient.ofItems(Items.EMERALD),
                RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_1).criterion("has_endinium_upgrade_template", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_UPGRADE_TEMPLATE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_SCRAP_1) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(ModItems.ENDINIUM_SCRAP_1), Ingredient.ofItems(Items.DIAMOND),
                RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_2).criterion("has_endinium_scrap_1", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_SCRAP_1))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_SCRAP_2) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(ModItems.ENDINIUM_SCRAP_2), Ingredient.ofItems(Items.REDSTONE),
                RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_3).criterion("has_endinium_scrap_2", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_SCRAP_2))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_SCRAP_3) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(ModItems.ENDINIUM_SCRAP_3), Ingredient.ofItems(Items.GOLD_INGOT),
                RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_4).criterion("has_endinium_scrap_3", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_SCRAP_3))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_SCRAP_4) + "_smithing");


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

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_HELMET), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_HELMET).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_HELMET) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_CHESTPLATE), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_CHESTPLATE).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_CHESTPLATE) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_LEGGINGS), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_LEGGINGS).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_LEGGINGS) + "_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ENDINIUM_UPGRADE_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_BOOTS), Ingredient.ofItems(ModItems.ENDINIUM_CARBIDE),
                RecipeCategory.COMBAT, ModItems.ENDINIUM_BOOTS).criterion("has_endinium_carbide", RecipeProvider.conditionsFromItem(ModItems.ENDINIUM_CARBIDE))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.ENDINIUM_BOOTS) + "_smithing");

    }

}
