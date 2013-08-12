package com.marcs.mtc;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import com.marcs.mtc.block.ModBlocks;
import com.marcs.mtc.config.ModConfig;
import com.marcs.mtc.core.handler.LocalizationHandler;
import com.marcs.mtc.core.proxy.CommonProxy;
import com.marcs.mtc.crafting.ModCrafting;
import com.marcs.mtc.item.ModItems;
import com.marcs.mtc.lib.Reference;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired=false)
public class MoreThingsCraft {
	
	@Instance
	public static MoreThingsCraft instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e){
		
		LocalizationHandler.loadLanguages();
		
		ModConfig.initConfig(new File(e.getModConfigurationDirectory().getAbsolutePath()
				+File.separator
				+Reference.CHANNEL_NAME
				+File.separator+Reference.MOD_NAME+".cfg"));
		
		ModBlocks.initBlocks();
		ModItems.initItems();
		
		ModCrafting.initRecipes();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e){
		proxy.registerRenders();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e){
		//Stub method
	}
	
}
