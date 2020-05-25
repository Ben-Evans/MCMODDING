package com.YuYuGuru.nullmod.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorEffectBase extends ArmorBase{
	PotionEffect effect;

	public ArmorEffectBase(String name, ArmorMaterial materialIn, int renderIndexIn,EntityEquipmentSlot equipmentSlotIn, PotionEffect effect) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		this.effect=effect;
	}

	protected void onArmorTick(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(effect.getPotion(),effect.getDuration(),effect.getAmplifier(),effect.getIsAmbient(),effect.doesShowParticles()));
			
		}
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
