package me.officiallydragon.endified;

import me.officiallydragon.endified.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class EndifiedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.block_name,  RenderLayer.getCutout());
    }
}
