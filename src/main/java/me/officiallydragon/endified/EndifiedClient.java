package me.officiallydragon.endified;

import me.officiallydragon.endified.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class EndifiedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDIFIED_BERRY_VINES,  RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDIFIED_BERRY_VINES_LIT,  RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDIFIED_BERRY_VINES_PLANT,  RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDIFIED_BERRY_VINES_PLANT_LIT,  RenderLayer.getCutout());
    }
}
