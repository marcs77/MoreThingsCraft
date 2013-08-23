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
		//Storage blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cobaltBlock), new Object[] { "sss", "sss", "sss",
            Character.valueOf('s'), ModItems.cobaltIngot});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.magnetiteBlock), new Object[] { "sss", "sss", "sss",
            Character.valueOf('s'), ModItems.magnetiteIngot});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumBlock), new Object[] { "sss", "sss", "sss",
            Character.valueOf('s'), ModItems.titaniumIngot});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), new Object[] { "sss", "sss", "sss",
            Character.valueOf('s'), ModItems.copperIngot});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tinBlock), new Object[] { "sss", "sss", "sss",
            Character.valueOf('s'), ModItems.tinIngot});
		
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
	
		/**
		 * Ore dictionary recipes
		 */
		
	}
	
}
