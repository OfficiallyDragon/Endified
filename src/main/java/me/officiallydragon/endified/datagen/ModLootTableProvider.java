package me.officiallydragon.endified.datagen;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ENDINIUM_BLOCK);
        addDrop(ModBlocks.ENDINIUM_DEBRIS);

        addDrop(ModBlocks.SULFUR_ORE, copperLikeOreDrops(ModBlocks.SULFUR_ORE, ModItems.RAW_SULFUR));

        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_SLAB, slabDrops(ModBlocks.END_STONE_SLAB));
        addDrop(ModBlocks.END_STONE_WALL);

        addDrop(ModBlocks.ENDIFIED_DAHLIA);
        addPottedPlantDrops(ModBlocks.POTTED_ENDIFIED_DAHLIA);
    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder)ItemEntry.builder(item)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

}
