package com.marcs.mtc.item;

import java.util.List;

import com.marcs.mtc.MoreThingsCraft;
import com.marcs.mtc.core.helper.LocalizationHelper;
import com.marcs.mtc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemMTCHoe extends ItemHoe{

	public ItemMTCHoe(int id, EnumToolMaterial toolMaterial) {
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
	
	@SuppressWarnings({"unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, @SuppressWarnings("rawtypes") List info, boolean extraInfo){
		info.add(String.format(LocalizationHelper.getLocalizationString("info.damagetool"), this.getMaxDamage() - stack.getItemDamage()));
	}


}
