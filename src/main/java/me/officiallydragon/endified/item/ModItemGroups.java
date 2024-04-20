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
                        entries.add(ModItems.ENDINIUM_SCRAP);
                        entries.add(ModBlocks.ENDINIUM_BLOCK);
                        entries.add(ModBlocks.ENDINIUM_DEBRIES);
                    }).build());
    public static void registerItemGroups() {
        Endified.LOGGER.info("Register Item Groups for " + Endified.MOD_ID);
    }
}
