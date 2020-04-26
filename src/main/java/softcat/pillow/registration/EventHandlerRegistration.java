package softcat.pillow.registration;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import softcat.pillow.EventHandlers.SpawnEvent;
import softcat.pillow.EventHandlers.WakeUpEvent;
import softcat.pillow.PillowMod;

@Mod.EventBusSubscriber(modid = PillowMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandlerRegistration {


    @SubscribeEvent
    public static void registerEventHandler(FMLCommonSetupEvent event) {

        MinecraftForge.EVENT_BUS.register( SpawnEvent.class);
        MinecraftForge.EVENT_BUS.register( WakeUpEvent.class);
    }



}
