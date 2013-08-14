package com.marcs.mtc.block;

import com.marcs.mtc.MoreThingsCraft;
import com.marcs.mtc.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMTC extends Block{

	public BlockMTC(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(MoreThingsCraft.tabMTC);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon(String.format("%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName()));
	}
	
	public String getUnwrappedUnlocalizedName(){
		return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.')+1);
	}
}
