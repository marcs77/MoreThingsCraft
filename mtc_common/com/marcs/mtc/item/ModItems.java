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
	
	public static final EnumToolMaterial COBALT = EnumHelper.addToolMaterial(Reference.MOD_ID+"_COBALT", 2, 1000, 8.0F, 3.0F, 11);
	
	public static void initItems(){
		cobaltIngot = new ItemMTC(ItemIds.COBALT_INGOT).setUnlocalizedName(Strings.COBALT_INGOT_NAME);
		titaniumIngot = new ItemMTC(ItemIds.TITANIUM_INGOT).setUnlocalizedName(Strings.TITANIUM_INGOT_NAME);
		magnetiteIngot = new ItemMTC(ItemIds.MAGNETITE_INGOT).setUnlocalizedName(Strings.MAGNETITE_INGOT_NAME);
		copperIngot = new ItemMTC(ItemIds.COPPER_INGOT).setUnlocalizedName(Strings.COPPER_INGOT_NAME);
		tinIngot = new ItemMTC(ItemIds.TIN_INGOT).setUnlocalizedName(Strings.TIN_INGOT_NAME);
		
	}
}
