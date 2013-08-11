package com.marcs.mtc.item;

import com.marcs.mtc.lib.ItemIds;
import com.marcs.mtc.lib.Strings;

import net.minecraft.item.Item;

public class ModItems {
	public static Item cobaltIngot;
	
	public static void initItems(){
		cobaltIngot = new ItemMTC(ItemIds.COBALT_INGOT).setUnlocalizedName(Strings.COBALT_INGOT_NAME);
	}
}
