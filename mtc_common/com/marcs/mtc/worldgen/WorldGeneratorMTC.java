package com.marcs.mtc.worldgen;

import java.util.Random;

import com.marcs.mtc.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMTC implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case 1:{//End
			
		}
		case 0:{//Overworld
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		case -1:{//Nether
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		default: {//Other dimensions: Mystcraft ages, twilighgt ...
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		}
		
	}

	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		generateMinable(ModBlocks.cobaltOre, 3, 6, 28, 0, world, random, i, j);
	}
	
	private void generateMinable(Block b,int veinPerChunk, int veinSize, int maxAlt, int minAlt, World world, Random random, int i, int j){
		for(int h=0; h<veinPerChunk; h++){
			int xCoord = i+random.nextInt(16);
			int yCoord = minAlt+random.nextInt(maxAlt-minAlt);
			int zCoord = j+random.nextInt(16);
			
			(new WorldGenMinable(b.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

}
