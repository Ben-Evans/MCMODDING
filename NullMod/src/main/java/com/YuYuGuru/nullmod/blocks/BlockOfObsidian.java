package com.YuYuGuru.nullmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOfObsidian extends BlockBase{

	public BlockOfObsidian(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(50.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);

	}

}
