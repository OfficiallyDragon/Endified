package me.officiallydragon.endified.item;

import me.officiallydragon.endified.Endified;
import me.officiallydragon.endified.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENDIFIED_TOOL_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_tools"))
                    .icon(() -> new ItemStack(ModItems.ENDINIUM_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDINIUM_PICKAXE);
                        entries.add(ModItems.ENDINIUM_AXE);
                        entries.add(ModItems.ENDINIUM_SHOVEL);
                        entries.add(ModItems.ENDINIUM_HOE);
                        entries.add(ModItems.ORE_DETECTOR);

                    }).build());
    public static final ItemGroup ENDIFIED_COMBAT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_combat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_combat"))
                    .icon(() -> new ItemStack(ModItems.ENDINIUM_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDINIUM_SWORD);
                        entries.add(ModItems.ENDINIUM_AXE);
                        entries.add(ModItems.ENDINIUM_HELMET);
                        entries.add(ModItems.ENDINIUM_CHESTPLATE);
                        entries.add(ModItems.ENDINIUM_LEGGINGS);
                        entries.add(ModItems.ENDINIUM_BOOTS);

                    }).build());
    public static final ItemGroup ENDIFIED_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.ENDINIUM_DEBRIS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.END_STONE_STAIRS);
                        entries.add(ModBlocks.END_STONE_SLAB);
                        entries.add(ModBlocks.END_STONE_WALL);
                        entries.add(ModBlocks.SULFUR_ORE);
                        entries.add(ModBlocks.ENDINIUM_DEBRIS);
                        entries.add(ModBlocks.ENDINIUM_BLOCK);

                    }).build());
    public static final ItemGroup ENDIFIED_PLANT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_plants"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_plants"))
                    .icon(() -> new ItemStack(ModItems.END_BERRIES)).entries((displayContext, entries) -> {
                        entries.add(ModItems.END_BERRIES);
                        entries.add(ModBlocks.ENDIFIED_DAHLIA);

                    }).build());
    public static final ItemGroup ENDIFIED_RESOURCE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_resources"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_resources"))
                    .icon(() -> new ItemStack(ModItems.SULFUR_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SULFUR_DUST);
                        entries.add(ModItems.RAW_SULFUR);
                        entries.add(ModItems.ENDINIUM_UPGRADE_TEMPLATE);
                        entries.add(ModItems.ENDINIUM_CARBIDE);
                        entries.add(ModItems.ENDINIUM_SCRAP_0);
                        entries.add(ModItems.ENDINIUM_SCRAP_1);
                        entries.add(ModItems.ENDINIUM_SCRAP_2);
                        entries.add(ModItems.ENDINIUM_SCRAP_3);
                        entries.add(ModItems.ENDINIUM_SCRAP_4);


                    }).build());
    public static void registerItemGroups() {
        Endified.LOGGER.info("Register Item Groups for " + Endified.MOD_ID);
    }
}
