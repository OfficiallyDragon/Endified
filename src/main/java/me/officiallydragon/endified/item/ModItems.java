package me.officiallydragon.endified.item;

import me.officiallydragon.endified.Endified;
import me.officiallydragon.endified.item.custom.OreDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDINIUM_UPGRADE_TEMPLATE = registerItem("endinium_upgrade_template", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_SCRAP_0 = registerItem("endinium_scrap_0", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_SCRAP_1 = registerItem("endinium_scrap_1", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_SCRAP_2 = registerItem("endinium_scrap_2", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_SCRAP_3 = registerItem("endinium_scrap_3", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_SCRAP_4 = registerItem("endinium_scrap_4", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_CARBIDE = registerItem("endinium_carbide", new Item(new FabricItemSettings()));
    public static final Item ORE_DETECTOR = registerItem("ore_detector", new OreDetectorItem(new FabricItemSettings().maxDamage(100)));
    public static final Item END_BERRIES = registerItem("end_berries", new Item(new FabricItemSettings().food(ModFoodComponents.END_BERRIES)));
    public static final Item RAW_SULFUR = registerItem("raw_sulfur", new Item(new FabricItemSettings()));
    public static final Item SULFUR_DUST = registerItem("sulfur_dust", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDINIUM_SCRAP_0);
        entries.add(ENDINIUM_SCRAP_1);
        entries.add(ENDINIUM_SCRAP_2);
        entries.add(ENDINIUM_SCRAP_3);
        entries.add(ENDINIUM_SCRAP_4);
        entries.add(ENDINIUM_UPGRADE_TEMPLATE);
        entries.add(ENDINIUM_CARBIDE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Endified.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Endified.LOGGER.info("Registering Mod Items for " + Endified.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
