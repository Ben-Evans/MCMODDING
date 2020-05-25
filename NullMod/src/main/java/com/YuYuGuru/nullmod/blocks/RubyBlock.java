package com.YuYuGuru.nullmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(2.0F);
		//setLightOpacity(1); // int type 1 lets all light pass through
		//setBlockUnbreakable();
	}

}
