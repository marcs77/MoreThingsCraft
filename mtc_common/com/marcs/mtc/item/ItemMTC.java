package com.marcs.mtc.item;

import com.marcs.mtc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMTC extends Item{

	public ItemMTC(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName()));
	}
	
	public String getUnwrappedUnlocalizedName(){
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.')+1);
	}
	
}
