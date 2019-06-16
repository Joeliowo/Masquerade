package com.joel.masq.items;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPhilosophersStone extends Item {
    public int souls;

    public ItemPhilosophersStone(int type){
        super();
        this.setUnlocalizedName("philosophers_stone_" + type);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setMaxStackSize(1);
    }
}
