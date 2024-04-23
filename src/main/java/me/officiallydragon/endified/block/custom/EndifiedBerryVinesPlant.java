package me.officiallydragon.endified.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class EndifiedBerryVinesPlant extends CaveVinesHeadBlock {
    public EndifiedBerryVinesPlant(BlockState defaultState, Settings settings, BooleanProperty berries) {
        super(settings);
    }

    public EndifiedBerryVinesPlant(BlockState defaultState, FabricBlockSettings settings) {
        super(settings);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder, BooleanProperty berries) {
        builder.add(berries);
    }
}
