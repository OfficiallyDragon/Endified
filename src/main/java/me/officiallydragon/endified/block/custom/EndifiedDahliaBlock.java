package me.officiallydragon.endified.block.custom;
import me.officiallydragon.endified.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class EndifiedDahliaBlock extends PlantBlock {


    public EndifiedDahliaBlock(Settings settings) {
        super(settings);
    }
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(ModTags.Blocks.DAHLIA_PLACEABLE) || floor.isOf(Blocks.DIRT);
    }
}
