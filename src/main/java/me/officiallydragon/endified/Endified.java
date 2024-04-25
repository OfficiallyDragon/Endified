package me.officiallydragon.endified;

import me.officiallydragon.endified.block.ModBlocks;
import me.officiallydragon.endified.datagen.ModModelProvider;
import me.officiallydragon.endified.item.ModItemGroups;
import me.officiallydragon.endified.item.ModItems;
import me.officiallydragon.endified.util.ModCustomTrades;
import me.officiallydragon.endified.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Endified implements ModInitializer {
	public static final String MOD_ID = "endified";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		FuelRegistry.INSTANCE.add(ModItems.SULFUR_DUST, 25000);
	}
}