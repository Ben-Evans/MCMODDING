package com.YuYuGuru.nullmod.init;

import java.util.ArrayList;
import java.util.List;
import com.YuYuGuru.nullmod.items.ItemBase;
import com.YuYuGuru.nullmod.items.tools.ToolAxe;
import com.YuYuGuru.nullmod.items.tools.ToolAxeO;
import com.YuYuGuru.nullmod.items.tools.ToolAxeS;
import com.YuYuGuru.nullmod.items.tools.ToolHoe;
import com.YuYuGuru.nullmod.items.tools.ToolHoeO;
import com.YuYuGuru.nullmod.items.tools.ToolHoeS;
import com.YuYuGuru.nullmod.items.tools.ToolPickaxe;
import com.YuYuGuru.nullmod.items.tools.ToolPickaxeO;
import com.YuYuGuru.nullmod.items.tools.ToolPickaxeS;
import com.YuYuGuru.nullmod.items.tools.ToolSpade;
import com.YuYuGuru.nullmod.items.tools.ToolSpadeO;
import com.YuYuGuru.nullmod.items.tools.ToolSpadeS;
import com.YuYuGuru.nullmod.items.tools.ToolSword;
import com.YuYuGuru.nullmod.items.tools.ToolSwordO;
import com.YuYuGuru.nullmod.items.tools.ToolSwordS;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
    //materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT= EnumHelper.addToolMaterial("material_obsidian_ingot", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHRE =EnumHelper.addToolMaterial("material_sapphire",3, 100, 7.0F, 3.0F, 10 );
	
	
	//items-Matierals
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	
	//tools
		//Ruby
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword",MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
		//Obsidian
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxeO("obsidian_axe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpadeO("obsidian_shovel", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoeO("obsidian_hoe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemSword OBSIDIAN_SWORD = new ToolSwordO("obsidian_sword", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxeO("obsidian_pickaxe", MATERIAL_OBSIDIAN_INGOT);
		//Sapphire
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxeS("sapphire_axe", MATERIAL_SAPPHRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpadeS("sapphire_shovel", MATERIAL_SAPPHRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoeS("sapphire_hoe", MATERIAL_SAPPHRE);
	public static final ItemSword SAPPHIRE_SWORD = new ToolSwordS("sapphire_sword", MATERIAL_SAPPHRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxeS("sapphire_pickaxe", MATERIAL_SAPPHRE);
	
}
