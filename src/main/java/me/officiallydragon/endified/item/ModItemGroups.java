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
    public static final ItemGroup ENDIFIED_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified"))
                    .icon(() -> new ItemStack(ModItems.ENDINIUM_CARBIDE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDINIUM_CARBIDE);
                        entries.add(ModItems.ENDINIUM_SCRAP_0);
                        entries.add(ModItems.ENDINIUM_SCRAP_1);
                        entries.add(ModItems.ENDINIUM_SCRAP_2);
                        entries.add(ModItems.ENDINIUM_SCRAP_3);
                        entries.add(ModItems.ENDINIUM_SCRAP_4);
                        entries.add(ModItems.ENDINIUM_UPGRADE_TEMPLATE);
                        entries.add(ModItems.RAW_SULFER);

                        entries.add(ModBlocks.ENDINIUM_BLOCK);
                        entries.add(ModBlocks.ENDINIUM_DEBRIES);

                        entries.add(ModItems.ORE_DETECTOR);

                        entries.add(ModItems.END_BERRIES);

                    }).build());
    public static final ItemGroup ENDIFIED_TOOL_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_tools"))
                    .icon(() -> new ItemStack(ModItems.ORE_DETECTOR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ORE_DETECTOR);

                    }).build());
    public static final ItemGroup ENDIFIED_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.ENDINIUM_DEBRIES)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ENDINIUM_DEBRIES);
                        entries.add(ModBlocks.ENDINIUM_BLOCK);
                        entries.add(ModBlocks.SULFER_ORE);

                    }).build());
    public static final ItemGroup ENDIFIED_PLANT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Endified.MOD_ID, "endified_plants"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endified_plants"))
                    .icon(() -> new ItemStack(ModItems.END_BERRIES)).entries((displayContext, entries) -> {
                        entries.add(ModItems.END_BERRIES);

                    }).build());
    public static void registerItemGroups() {
        Endified.LOGGER.info("Register Item Groups for " + Endified.MOD_ID);
    }
}
