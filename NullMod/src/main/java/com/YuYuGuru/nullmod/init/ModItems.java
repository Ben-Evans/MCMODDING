package com.YuYuGuru.nullmod.init;

import java.util.ArrayList;
import java.util.List;
import com.YuYuGuru.nullmod.items.ItemBase;
import com.YuYuGuru.nullmod.items.armor.ArmorBase;
import com.YuYuGuru.nullmod.items.armor.ArmorEffectBase;
import com.YuYuGuru.nullmod.items.food.FoodBase;
import com.YuYuGuru.nullmod.items.food.FoodEffectBase;
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
import com.YuYuGuru.nullmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
    //materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT= EnumHelper.addToolMaterial("material_obsidian_ingot", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHRE =EnumHelper.addToolMaterial("material_sapphire",3, 100, 7.0F, 3.0F, 10 );
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, new int [] {2,7,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 12, new int [] {2,7,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	//items-Matierals
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	
	// armor 
		//Ruby
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY,1,EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY,1,EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY,2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorEffectBase("ruby_boots", ARMOR_MATERIAL_RUBY,1, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.JUMP_BOOST, (60*20), 2, true, false));
		//Sapphire
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);
	
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
	
		//Food
			//Diamond Food
	//public static final Item DIAMOND_CARROT = new FoodBase("diamond_carrot", 16, 6.2f, false );
	public static final Item DIAMOND_CARROT = new FoodEffectBase("diamond_carrot", 16, 6.2f, false, new PotionEffect(MobEffects.SPEED, 5*(60*20), 100, false, true), new PotionEffect(MobEffects.JUMP_BOOST, 5*(60*20), 300, false, true));
	public static final Item DIAMOND_APPLE = new FoodEffectBase("diamond_apple", 16, 6.2f, false, new PotionEffect(MobEffects.REGENERATION, 20*(60*20), 20, false, true), new PotionEffect(MobEffects.HEALTH_BOOST, 5*(60*20), 300, false, true));
	public static final Item DIAMOND_MELON = new FoodEffectBase("diamond_melon", 16, 6.2f, false, new PotionEffect(MobEffects.WATER_BREATHING, 5*(60*20), 20, false, true), new PotionEffect(MobEffects.HEALTH_BOOST, 5*(60*20), 300, false, true));

		//Golden Food
	public static final Item GOLDEN_MELON = new FoodEffectBase("golden_melon", 8, 4.2f, false, new PotionEffect(MobEffects.REGENERATION, 2*(60*20), 5, false, true), new PotionEffect(MobEffects.REGENERATION,0, 0, false, true));
	public static final Item GOLDEN_POTATO= new FoodEffectBase("golden_potato", 8, 4.2f, false, new PotionEffect(MobEffects.SATURATION, 2*(60*20), 5, false, true), new PotionEffect(MobEffects.SATURATION,0, 0, false, true));
			//Sapphire Food
			//Ruby Food 
			
}
