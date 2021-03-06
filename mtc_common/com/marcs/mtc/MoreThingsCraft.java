package com.marcs.mtc;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

import com.marcs.mtc.block.ModBlocks;
import com.marcs.mtc.core.handler.ConfigurationHandler;
import com.marcs.mtc.core.handler.LocalizationHandler;
import com.marcs.mtc.core.helper.PacketHandler;
import com.marcs.mtc.core.proxy.CommonProxy;
import com.marcs.mtc.crafting.ModCrafting;
import com.marcs.mtc.item.ModItems;
import com.marcs.mtc.lib.Reference;
import com.marcs.mtc.worldgen.WorldGeneratorMTC;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, dependencies = Reference.DEPENDENCIES)
@NetworkMod(channels={Reference.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired=false, packetHandler = PacketHandler.class)
public class MoreThingsCraft {
	
	@Instance
	public static MoreThingsCraft instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabMTC = new CreativeTabs(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e){
		
		LocalizationHandler.loadLanguages();
		
		ConfigurationHandler.initConfig(new File(e.getModConfigurationDirectory().getAbsolutePath()
				+File.separator
				+Reference.CHANNEL_NAME
				+File.separator+Reference.MOD_NAME+".cfg"));
		
		ModBlocks.initBlocks();
		ModItems.initItems();
		
		proxy.registerSounds();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e){
		proxy.registerRenders();
		
		ModCrafting.initRecipes();
		
		oreDictRegistry();
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorMTC());
	}
	
	private static void oreDictRegistry() {
		//Ores
		OreDictionary.registerOre("oreCopper", 	ModBlocks.copperOre);
		OreDictionary.registerOre("oreTin", ModBlocks.tinOre);
		//Ingots
		OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
		OreDictionary.registerOre("ingotCopper", ModItems.tinIngot);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent e){
		//Stub method
	}
	
}
