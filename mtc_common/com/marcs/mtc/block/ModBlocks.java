package com.marcs.mtc.block;

import com.marcs.mtc.lib.BlockIds;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block cobaltOre;
	
	public static void initBlocks(){
		cobaltOre = registerStandardBlock(BlockIds.COBALT_ORE, Material.rock, "cobaltOre", false);
	}
	
	private static Block registerStandardBlock(int id, Material mat, String unlocalizedName, boolean isOre){
		Block newBlock = new BlockMTC(id, mat).setUnlocalizedName(unlocalizedName).setHardness(isOre ? 3.0F : 5.0F).setResistance(isOre ? 5.0F : 8.5F);
		GameRegistry.registerBlock(newBlock, unlocalizedName);
		return newBlock;
	}
	
}
