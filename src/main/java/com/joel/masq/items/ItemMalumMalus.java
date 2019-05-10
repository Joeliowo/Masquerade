package com.joel.masq.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMalumMalus extends ItemFood {

    public ItemMalumMalus(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName("malum_malus");
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setMaxStackSize(1);
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {

        }
    }
}
