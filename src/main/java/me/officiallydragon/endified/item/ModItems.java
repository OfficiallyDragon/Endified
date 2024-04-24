package me.officiallydragon.endified.item;

import me.officiallydragon.endified.Endified;
import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.item.custom.ModArmorItem;
import me.officiallydragon.endified.item.custom.OreDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
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
    public static final Item END_BERRIES = registerItem("end_berries", (Item)new AliasedBlockItem(ModBlocks.ENDIFIED_VINES, new FabricItemSettings().food(ModFoodComponents.END_BERRIES)));
    public static final Item RAW_SULFUR = registerItem("raw_sulfur", new Item(new FabricItemSettings()));
    public static final Item SULFUR_DUST = registerItem("sulfur_dust", new Item(new FabricItemSettings()));

    public static final Item ENDINIUM_PICKAXE = registerItem("endinium_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDINIUM, 1, -2.8f, new  FabricItemSettings()));
    public static final Item ENDINIUM_AXE = registerItem("endinium_axe",
            new AxeItem(ModToolMaterial.ENDINIUM, 6.0f, -3.0f, new  FabricItemSettings()));
    public static final Item ENDINIUM_SHOVEL = registerItem("endinium_shovel",
            new ShovelItem(ModToolMaterial.ENDINIUM, 1.5f, -3.0f, new  FabricItemSettings()));
    public static final Item ENDINIUM_SWORD = registerItem("endinium_sword",
            new SwordItem(ModToolMaterial.ENDINIUM, 3, -2.4f, new  FabricItemSettings()));
    public static final Item ENDINIUM_HOE = registerItem("endinium_hoe",
            new HoeItem(ModToolMaterial.ENDINIUM, -4, 0f, new  FabricItemSettings()));

    public static final Item ENDINIUM_HELMET = registerItem("endinium_helmet",
            new ModArmorItem(ModArmorMaterials.ENDINIUM, ArmorItem.Type.HELMET, new  FabricItemSettings()));
    public static final Item ENDINIUM_CHESTPLATE = registerItem("endinium_chestplate",
            new ModArmorItem(ModArmorMaterials.ENDINIUM, ArmorItem.Type.CHESTPLATE, new  FabricItemSettings()));
    public static final Item ENDINIUM_LEGGINGS = registerItem("endinium_leggings",
            new ModArmorItem(ModArmorMaterials.ENDINIUM, ArmorItem.Type.LEGGINGS, new  FabricItemSettings()));
    public static final Item ENDINIUM_BOOTS = registerItem("endinium_boots",
            new ModArmorItem(ModArmorMaterials.ENDINIUM, ArmorItem.Type.BOOTS, new  FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Endified.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Endified.LOGGER.info("Registering Mod Items for " + Endified.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
