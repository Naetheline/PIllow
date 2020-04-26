package softcat.pillow.EventHandlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeDimension;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import softcat.pillow.Blocks.PillowBlock;
@Mod.EventBusSubscriber
public class WakeUpEvent {

    @SubscribeEvent
    public static void onPlayerWakeUp(PlayerWakeUpEvent evt) {
        PlayerEntity player = evt.getPlayer();
        World world = player.getEntityWorld();
        BlockPos pos = player.getPosition();//player.getBedLocation(world.dimension.getType());
        BlockState state = world.getBlockState(pos);


        if(state.getBlock() instanceof  PillowBlock)
        {
            // Remove block

            world.removeBlock(pos, false);
            BlockPos blockpos = pos.offset(state.get(PillowBlock.HORIZONTAL_FACING).getOpposite());
            if (world.getBlockState(blockpos).getBlock() == state.getBlock()) {
                world.removeBlock(blockpos, false);
            }
        }

    }

}
