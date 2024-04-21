package me.officiallydragon.endified.datagen;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDINIUM_SMELTABLES = List.of(ModBlocks.ENDINIUM_DEBRIES);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ENDINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_0, 0.7f, 200, "endinium");
        offerBlasting(exporter, ENDINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ENDINIUM_SCRAP_0, 1.4f, 100, "endinium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDINIUM_CARBIDE, RecipeCategory.MISC, ModBlocks.ENDINIUM_BLOCK);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.SULFER_DUST, ModItems.RAW_SULFER, 1);

    }
}
