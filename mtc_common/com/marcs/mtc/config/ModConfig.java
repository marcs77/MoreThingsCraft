package com.marcs.mtc.config;

import java.io.File;
import java.util.logging.Level;

import com.marcs.mtc.lib.BlockIds;
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
		}catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID+" has had a problem loading its configuration.");
		}finally{
			config.save();
		}
	}
	
}
