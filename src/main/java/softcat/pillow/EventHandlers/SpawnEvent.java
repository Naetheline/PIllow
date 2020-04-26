package softcat.pillow.EventHandlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import softcat.pillow.Blocks.PillowBlock;

@Mod.EventBusSubscriber
public class SpawnEvent {


    @SubscribeEvent
    public static void onPlayerSetSpawn(PlayerSetSpawnEvent evt) {


        PlayerEntity player = evt.getPlayer();
        World world = player.getEntityWorld();
        BlockPos pos = evt.getNewSpawn();

        if (pos != null && !world.isRemote) {
            Block block = world.getBlockState(pos).getBlock();
            if (block instanceof PillowBlock || block.isAir(world.getBlockState(pos))) {

                    evt.setCanceled(true);
                }
            }
        }

}
