package com.YuYuGuru.nullmod.items.food;

import com.YuYuGuru.nullmod.Main;
import com.YuYuGuru.nullmod.init.ModItems;
import com.YuYuGuru.nullmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
