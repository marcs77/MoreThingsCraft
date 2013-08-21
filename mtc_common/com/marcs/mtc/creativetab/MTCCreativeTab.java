package com.marcs.mtc.creativetab;

import com.marcs.mtc.lib.ItemIds;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class MTCCreativeTab extends CreativeTabs{

	public MTCCreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	/**
	 * the itemID for the item to be displayed on the tab
	 */
	public int getTabIconItemIndex() {

		return ItemIds.COBALT_INGOT;
	}

}
