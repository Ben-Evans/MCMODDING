package com.YuYuGuru.nullmod.items.tools;

import com.YuYuGuru.nullmod.Main;
import com.YuYuGuru.nullmod.init.ModItems;
import com.YuYuGuru.nullmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolHoeO extends ItemHoe implements IHasModel {
	public ToolHoeO(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
