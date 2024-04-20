package me.officiallydragon.endified.item;

import me.officiallydragon.endified.Endified;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDINIUM_SCRAP = registerItem("endinium_scrap", new Item(new FabricItemSettings()));
    public static final Item ENDINIUM_CARBIDE = registerItem("endinium_carbide", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDINIUM_SCRAP);
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
