package com.marcs.mtc.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block cobaltOre;
	
	public static void initBlocks(){
		cobaltOre = new BlockMTC(600, Material.rock).setUnlocalizedName("cobaltOre");
		
		GameRegistry.registerBlock(cobaltOre, ((BlockMTC) cobaltOre).getUnwrappedUnlocalizedName());
	}
	
}
