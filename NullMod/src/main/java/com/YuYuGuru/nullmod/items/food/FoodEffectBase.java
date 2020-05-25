package com.YuYuGuru.nullmod.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase {
	PotionEffect effect;
	PotionEffect effect1;
	public FoodEffectBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect, PotionEffect effect1) {
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		this.effect=effect;
		this.effect1=effect1; 
	
		
	} 
	@Override 
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(effect.getPotion(),effect.getDuration(),effect.getAmplifier(),effect.getIsAmbient(),effect.doesShowParticles()));
			player.addPotionEffect(new PotionEffect(effect1.getPotion(),effect1.getDuration(),effect1.getAmplifier(),effect1.getIsAmbient(),effect1.doesShowParticles()));
		}
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}
