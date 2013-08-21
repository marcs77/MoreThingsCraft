package com.marcs.mtc.config;

import java.io.File;
import java.util.logging.Level;

import com.marcs.mtc.lib.BlockIds;
import com.marcs.mtc.lib.ItemIds;
import com.marcs.mtc.lib.Reference;
import com.marcs.mtc.lib.Strings;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ModConfig {
	
	public static Configuration config;
	
	public static boolean enableCopperTinWorldGen;
	public static final boolean ENABLE_COPPER_TIN_WORLDGEN_DEF = true;
	public static final String ENABLE_COPPER_TIN_WORLDGEN_NAME = "copperTinWorldGen.enabled";
	
	public static void initConfig(File configFile){
		
		config = new Configuration(configFile);
		try{
		config.load();
		//General settings
		enableCopperTinWorldGen = config.get(Configuration.CATEGORY_GENERAL, ENABLE_COPPER_TIN_WORLDGEN_NAME, enableCopperTinWorldGen).getBoolean(enableCopperTinWorldGen);
		
		//BlockIds
		BlockIds.COBALT_ORE = config.getBlock(Strings.COBALT_ORE_NAME, BlockIds.COBALT_ORE_DEF).getInt(BlockIds.COBALT_ORE_DEF);
		BlockIds.TITANIUM_ORE = config.getBlock(Strings.TITANIUM_ORE_NAME, BlockIds.TITANIUM_ORE_DEF).getInt(BlockIds.TITANIUM_ORE_DEF);
		BlockIds.MAGNETITE_ORE = config.getBlock(Strings.MAGNETITE_ORE_NAME, BlockIds.MAGNETITE_ORE_DEF).getInt(BlockIds.MAGNETITE_ORE_DEF);
		BlockIds.COPPER_ORE = config.getBlock(Strings.COPPER_ORE_NAME, BlockIds.COPPER_ORE_DEF).getInt(BlockIds.COPPER_ORE_DEF);
		BlockIds.TIN_ORE = config.getBlock(Strings.TIN_ORE_NAME, BlockIds.TIN_ORE_DEF).getInt(BlockIds.TIN_ORE_DEF);
		BlockIds.COBALT_BLOCK = config.getBlock(Strings.COBALT_BLOCK_NAME, BlockIds.COBALT_BLOCK_DEF).getInt(BlockIds.COBALT_BLOCK_DEF);
		BlockIds.TITANIUM_BLOCK = config.getBlock(Strings.TITANIUM_BLOCK_NAME, BlockIds.TITANIUM_BLOCK_DEF).getInt(BlockIds.TITANIUM_BLOCK_DEF);
		BlockIds.MAGNETITE_BLOCK = config.getBlock(Strings.MAGNETITE_BLOCK_NAME, BlockIds.MAGNETITE_BLOCK_DEF).getInt(BlockIds.MAGNETITE_BLOCK_DEF);
		BlockIds.COPPER_BLOCK = config.getBlock(Strings.COPPER_BLOCK_NAME, BlockIds.COPPER_BLOCK_DEF).getInt(BlockIds.COPPER_BLOCK_DEF);
		BlockIds.TIN_BLOCK = config.getBlock(Strings.TIN_BLOCK_NAME, BlockIds.TIN_BLOCK_DEF).getInt(BlockIds.TIN_BLOCK_DEF);
		
		//ItemIds
		ItemIds.COBALT_INGOT = config.getItem(Strings.COBALT_INGOT_NAME, ItemIds.COBALT_INGOT_DEF).getInt(ItemIds.COBALT_INGOT_DEF);
		ItemIds.TITANIUM_INGOT = config.getItem(Strings.TITANIUM_INGOT_NAME, ItemIds.TITANIUM_INGOT_DEF).getInt(ItemIds.TITANIUM_INGOT_DEF);
		ItemIds.MAGNETITE_INGOT = config.getItem(Strings.MAGNETITE_INGOT_NAME, ItemIds.MAGNETITE_INGOT_DEF).getInt(ItemIds.MAGNETITE_INGOT_DEF);
		ItemIds.COPPER_INGOT = config.getItem(Strings.COPPER_INGOT_NAME, ItemIds.COPPER_INGOT_DEF).getInt(ItemIds.COPPER_INGOT_DEF);
		ItemIds.TIN_INGOT = config.getItem(Strings.TIN_INGOT_NAME, ItemIds.TIN_INGOT_DEF).getInt(ItemIds.TIN_INGOT_DEF);
		
		}catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID+" has had a problem loading its configuration.");
		}finally{
			config.save();
		}
	}
	
}
