package softcat.pillow.registration;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import softcat.pillow.Blocks.PillowBlock;
import softcat.pillow.Items.PillowItem;
import softcat.pillow.PillowMod;

@Mod.EventBusSubscriber(modid = PillowMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(PillowMod.MOD_ID)
public class BlocksRegistration {

    public static final Block pillow = null;

    public static final Item pillowitem = null;


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        event.getRegistry().registerAll(

                new PillowBlock(Block.Properties.create(Material.WOOL).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.CLOTH)).setRegistryName(PillowMod.MOD_ID, "pillow")

        );
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(

                new PillowItem(pillow, new Item.Properties()).setRegistryName(PillowMod.MOD_ID, "pillowitem")

        );
}
    }


