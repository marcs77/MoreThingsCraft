package com.marcs.mtc.item;

import com.marcs.mtc.MoreThingsCraft;
import com.marcs.mtc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemMTCPickaxe extends ItemPickaxe{

	public ItemMTCPickaxe(int id, EnumToolMaterial toolMaterial) {
		super(id - Reference.SHIFTED_ID_RANGE_CORRECTION, toolMaterial);
		setCreativeTab(MoreThingsCraft.tabMTC);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "tools/"+getUnwrappedUnlocalizedName()));
	}
	
	public String getUnwrappedUnlocalizedName(){
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.')+1);
	}

}
