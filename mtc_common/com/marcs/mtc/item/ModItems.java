package com.marcs.mtc.item;

import com.marcs.mtc.lib.ItemIds;
import com.marcs.mtc.lib.Reference;
import com.marcs.mtc.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class ModItems {
	public static Item cobaltIngot;
	public static Item titaniumIngot;
	public static Item magnetiteIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	
	public static Item cobaltAxe;
	public static Item cobaltPickaxe;
	public static Item cobaltShovel;
	public static Item cobaltSword;
	public static Item cobaltHoe;
	
	public static Item titaniumAxe;
	public static Item titaniumPickaxe;
	public static Item titaniumShovel;
	public static Item titaniumSword;
	public static Item titaniumHoe;
	
	public static Item magnetiteAxe;
	public static Item magnetitePickaxe;
	public static Item magnetiteShovel;
	public static Item magnetiteSword;
	public static Item magnetiteHoe;
	
	public static final EnumToolMaterial COBALT = EnumHelper.addToolMaterial(Reference.MOD_ID+"_COBALT", 2, 1000, 8.0F, 3.0F, 11);
	public static final EnumToolMaterial MAGNETITE = EnumHelper.addToolMaterial(Reference.MOD_ID+"_MAGNETITE", 2, 1000, 8.0F, 3.0F, 11);
	public static final EnumToolMaterial TITANIUM = EnumHelper.addToolMaterial(Reference.MOD_ID+"_TITANIUM", 3, 800, 11.0F, 4.0F, 11);
	
	public static void initItems(){
		cobaltIngot = new ItemMTC(ItemIds.COBALT_INGOT).setUnlocalizedName(Strings.COBALT_INGOT_NAME);
		titaniumIngot = new ItemMTC(ItemIds.TITANIUM_INGOT).setUnlocalizedName(Strings.TITANIUM_INGOT_NAME);
		magnetiteIngot = new ItemMTC(ItemIds.MAGNETITE_INGOT).setUnlocalizedName(Strings.MAGNETITE_INGOT_NAME);
		copperIngot = new ItemMTC(ItemIds.COPPER_INGOT).setUnlocalizedName(Strings.COPPER_INGOT_NAME);
		tinIngot = new ItemMTC(ItemIds.TIN_INGOT).setUnlocalizedName(Strings.TIN_INGOT_NAME);
		
		/** Tools **/
		//Cobalt
		cobaltAxe = new ItemMTCAxe(ItemIds.COBALT_AXE, COBALT).setUnlocalizedName(Strings.COBALT_AXE_NAME);
		cobaltPickaxe = new ItemMTCAxe(ItemIds.COBALT_PICKAXE, COBALT).setUnlocalizedName(Strings.COBALT_PICKAXE_NAME);
		cobaltShovel = new ItemMTCShovel(ItemIds.COBALT_SHOVEL, COBALT).setUnlocalizedName(Strings.COBALT_SHOVEL_NAME);
		cobaltSword = new ItemMTCSword(ItemIds.COBALT_SWORD, COBALT).setUnlocalizedName(Strings.COBALT_SWORD_NAME);
		cobaltHoe = new ItemMTCHoe(ItemIds.COBALT_HOE, COBALT).setUnlocalizedName(Strings.COBALT_HOE_NAME);
		
		//Titanium
		titaniumAxe = new ItemMTCAxe(ItemIds.TITANIUM_AXE, TITANIUM).setUnlocalizedName(Strings.TITANIUM_AXE_NAME);
		titaniumPickaxe = new ItemMTCAxe(ItemIds.TITANIUM_PICKAXE, TITANIUM).setUnlocalizedName(Strings.TITANIUM_PICKAXE_NAME);
		titaniumShovel = new ItemMTCShovel(ItemIds.TITANIUM_SHOVEL, TITANIUM).setUnlocalizedName(Strings.TITANIUM_SHOVEL_NAME);
		titaniumSword = new ItemMTCSword(ItemIds.TITANIUM_SWORD, TITANIUM).setUnlocalizedName(Strings.TITANIUM_SWORD_NAME);
		titaniumHoe = new ItemMTCHoe(ItemIds.TITANIUM_HOE, TITANIUM).setUnlocalizedName(Strings.TITANIUM_HOE_NAME);
		
		//Magnetite
		magnetiteAxe = new ItemMTCAxe(ItemIds.MAGNETITE_AXE, MAGNETITE).setUnlocalizedName(Strings.MAGNETITE_AXE_NAME);
		magnetitePickaxe = new ItemMTCAxe(ItemIds.MAGNETITE_PICKAXE, MAGNETITE).setUnlocalizedName(Strings.MAGNETITE_PICKAXE_NAME);
		magnetiteShovel = new ItemMTCShovel(ItemIds.MAGNETITE_SHOVEL, MAGNETITE).setUnlocalizedName(Strings.MAGNETITE_SHOVEL_NAME);
		magnetiteSword = new ItemMTCSword(ItemIds.MAGNETITE_SWORD, MAGNETITE).setUnlocalizedName(Strings.MAGNETITE_SWORD_NAME);
		magnetiteHoe = new ItemMTCHoe(ItemIds.MAGNETITE_HOE, MAGNETITE).setUnlocalizedName(Strings.MAGNETITE_HOE_NAME);
	}
}
