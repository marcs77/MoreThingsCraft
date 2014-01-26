package com.marcs.mtc.block;

import com.marcs.mtc.lib.BlockIds;
import com.marcs.mtc.lib.Reference;
import com.marcs.mtc.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block cobaltOre;
	public static Block titaniumOre;
	public static Block magnetiteOre;
	public static Block copperOre;
	public static Block tinOre;
	
	public static Block cobaltBlock;
	public static Block titaniumBlock;
	public static Block magnetiteBlock;
	public static Block copperBlock;
	public static Block tinBlock;
	
	public static void initBlocks(){
		cobaltOre = registerStandardBlock(BlockIds.COBALT_ORE, Material.rock, Strings.COBALT_ORE_NAME, false);
		titaniumOre = registerStandardBlock(BlockIds.TITANIUM_ORE, Material.rock, Strings.TITANIUM_ORE_NAME, false);
		magnetiteOre = registerStandardBlock(BlockIds.MAGNETITE_ORE, Material.rock, Strings.MAGNETITE_ORE_NAME, false);
		copperOre = registerStandardBlock(BlockIds.COPPER_ORE, Material.rock, Strings.COPPER_ORE_NAME, false);
		tinOre = registerStandardBlock(BlockIds.TIN_ORE, Material.rock, Strings.TIN_ORE_NAME, false);
		
		cobaltBlock = registerStandardBlock(BlockIds.COBALT_BLOCK, Material.rock, Strings.COBALT_BLOCK_NAME, true);
		titaniumBlock = registerStandardBlock(BlockIds.TITANIUM_BLOCK, Material.rock, Strings.TITANIUM_BLOCK_NAME, true);
		magnetiteBlock = registerStandardBlock(BlockIds.MAGNETITE_BLOCK, Material.rock, Strings.MAGNETITE_BLOCK_NAME, true);
		copperBlock = registerStandardBlock(BlockIds.COPPER_BLOCK, Material.rock, Strings.COPPER_BLOCK_NAME, true);
		tinBlock = registerStandardBlock(BlockIds.TIN_BLOCK, Material.rock, Strings.TIN_BLOCK_NAME, true);
	
		
	}
	
	private static Block registerStandardBlock(int id, Material mat, String unlocalizedName, boolean isOre){
		Block newBlock = new BlockMTC(id, mat).setUnlocalizedName(unlocalizedName).setHardness(isOre ? 5.0F : 3.0F).setResistance(isOre ? 8.5F : 5.0F);
		GameRegistry.registerBlock(newBlock, Reference.MOD_ID+unlocalizedName);
		return newBlock;
	}
	
}
