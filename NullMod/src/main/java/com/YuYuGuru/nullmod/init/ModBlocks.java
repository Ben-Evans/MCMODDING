package com.YuYuGuru.nullmod.init;

import java.util.ArrayList;
import java.util.List;

import com.YuYuGuru.nullmod.blocks.BlockBase;
import com.YuYuGuru.nullmod.blocks.BlockOfObsidian;
import com.YuYuGuru.nullmod.blocks.RubyBlock;
import com.YuYuGuru.nullmod.blocks.RubyOre;
import com.YuYuGuru.nullmod.blocks.SapphireBlock;
import com.YuYuGuru.nullmod.blocks.SapphireOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block BLOCK_OF_OBSIDIAN = new BlockOfObsidian("block_of_obsidian", Material.IRON);
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.PACKED_ICE);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	
}
