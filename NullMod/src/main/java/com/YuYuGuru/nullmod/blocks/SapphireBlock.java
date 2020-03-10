package com.YuYuGuru.nullmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SapphireBlock extends BlockBase {

	public SapphireBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(5.0F);
		//setLightOpacity(1); // int type 1 lets all light pass through
		//setBlockUnbreakable();
	}

}
