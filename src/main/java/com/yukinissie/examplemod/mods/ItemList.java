package com.yukinissie.examplemod.mods;

import com.yukinissie.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemList {
    public static Item ExampleIngot = new Item(new Item.Properties().group(ItemGroup.MISC))
            .setRegistryName(new ResourceLocation(ExampleMod.MOD_ID, "example_ingot"));

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ExampleIngot
        );
    }
}
