package com.marcs.mtc.crafting;

import net.minecraft.item.ItemStack;

import com.marcs.mtc.block.ModBlocks;
import com.marcs.mtc.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void initRecipes(){
		/**
		 * Shaped crafting
		 */
		
		
		/**
		 * Shapeless crafting
		 */
		
		
		/**
		 * Smelting
		 */
		GameRegistry.addSmelting(ModBlocks.cobaltOre.blockID, new ItemStack(ModItems.cobaltIngot, 1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.titaniumOre.blockID, new ItemStack(ModItems.titaniumIngot, 1), 0.9f);
		GameRegistry.addSmelting(ModBlocks.magnetiteOre.blockID, new ItemStack(ModItems.magnetiteIngot, 1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.copperOre.blockID, new ItemStack(ModItems.copperIngot, 1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.tinOre.blockID, new ItemStack(ModItems.tinIngot, 1), 0.7f);
	}
	
}
