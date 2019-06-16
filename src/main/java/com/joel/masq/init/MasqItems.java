package com.joel.masq.init;

import com.joel.masq.items.ItemMalumMalus;
import com.joel.masq.items.ItemPhilosophersStone;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;

public class MasqItems {
    public static final ItemMalumMalus MALUM_MALUS = new ItemMalumMalus( 0, 0, false);
    public static final ItemPhilosophersStone PHILOSOPHERS_STONE_PURE = new ItemPhilosophersStone( 0);
    public static final ItemPhilosophersStone PHILOSOPHERS_STONE_IMPURE = new ItemPhilosophersStone( 1);

    public static void registerItems(RegistryEvent.Register<Item> event){
        registerItem(MALUM_MALUS, event, "malum_malus");
        registerItem(PHILOSOPHERS_STONE_PURE, event, "philosophers_stone_0");
        registerItem(PHILOSOPHERS_STONE_IMPURE, event, "philosophers_stone_1");
    }

    public static void registerItem(Item item, RegistryEvent.Register<Item> event, String oredictName) {
        item.setRegistryName( new ResourceLocation("masq:" + item.getUnlocalizedName().replaceFirst("item\\.|tile\\.", "")));
        System.out.println(item.getUnlocalizedName());
        event.getRegistry().register(item);

        if (!oredictName.isEmpty()) {
            OreDictionary.registerOre(oredictName, item);
        }

        if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
