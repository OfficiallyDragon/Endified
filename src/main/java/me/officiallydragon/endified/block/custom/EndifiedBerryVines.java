package me.officiallydragon.endified.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CaveVinesBodyBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class EndifiedBerryVines extends CaveVinesBodyBlock {
    public EndifiedBerryVines(BlockState defaultState, Settings settings, BooleanProperty berries) {
        super(settings);
    }

    public EndifiedBerryVines(BlockState defaultState, FabricBlockSettings settings) {
        super(settings);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder, BooleanProperty berries) {
        builder.add(berries);
    }
}