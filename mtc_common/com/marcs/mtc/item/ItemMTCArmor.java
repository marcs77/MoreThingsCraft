package com.marcs.mtc.item;

import java.util.List;

import com.marcs.mtc.MoreThingsCraft;
import com.marcs.mtc.core.helper.LocalizationHelper;
import com.marcs.mtc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMTCArmor extends ItemArmor{

	public ItemMTCArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			 String unlocalizedName, int type) {
		super(par1, par2EnumArmorMaterial, MoreThingsCraft.proxy.addArmor(unlocalizedName), type);
		this.setUnlocalizedName(unlocalizedName);
		setCreativeTab(MoreThingsCraft.tabMTC);
		// TODO Auto-generated constructor stub
	}
	
	public String getUnwrappedUnlocalizedName(){
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.')+1);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), "armor/"+getUnwrappedUnlocalizedName()));
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){

        if (this.armorType == 2){
            return "mtc:/models/textures/armor/"+this.getArmorMaterial().name().substring(this.getArmorMaterial().name().indexOf('_')+1).toLowerCase()+"Armor_2.png";
        }
        else return "mtc:/models/textures/armor/"+this.getArmorMaterial().name().substring(this.getArmorMaterial().name().indexOf('_')+1).toLowerCase()+"Armor_1.png";
    }
	
	@SuppressWarnings({"unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, @SuppressWarnings("rawtypes") List info, boolean extraInfo){
		info.add(String.format(LocalizationHelper.getLocalizationString("info.damagetool"), this.getMaxDamage() - stack.getItemDamage()));
	}

}
