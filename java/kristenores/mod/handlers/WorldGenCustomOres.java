package kristenores.mod.handlers;

import java.util.Random;

import kristenores.mod.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator 
{

    private WorldGenerator copper1_ore;
    private WorldGenerator copper1_ore2;
    private WorldGenerator copper1_ore3;
    private WorldGenerator copper1_ore4;
    private WorldGenerator copper1_ore5;
    private WorldGenerator copper1_ore6;
    private WorldGenerator copper1_ore7;
    private WorldGenerator copper1_ore8;
    private WorldGenerator copper1_ore9;
    private WorldGenerator copper1_ore10;
    private WorldGenerator copper1_ore11;
    private WorldGenerator copper1_ore12;
    private WorldGenerator copper1_ore13;
    private WorldGenerator copper1_ore14;
    private WorldGenerator copper1_ore15;
    private WorldGenerator copper1_ore16;
    private WorldGenerator copper1_ore17;
    private WorldGenerator copper1_ore18;
    private WorldGenerator copper1_ore19;
    private WorldGenerator copper1_ore20;

    public WorldGenCustomOres()
    {
        copper1_ore = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore2 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore3 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore4 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore5 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore4 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore5 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore6 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore7 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore8 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore9 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore10 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore11 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore12 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore13 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore14 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore15 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore16 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore17 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore18 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore19 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
        copper1_ore20 = new WorldGenMinable(BlockInit.ORE_COPPER1.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) 
    {
        switch(world.provider.getDimension())
        {
        case 0:

            runGenerator(copper1_ore, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore2, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore3, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore4, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore5, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore6, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore7, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore8, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore9, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore10, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore11, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore12, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore13, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore14, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore15, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore15, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore16, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore17, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore18, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore19, world, random, chunkX, chunkZ, 16, 0, 255);
            runGenerator(copper1_ore20, world, random, chunkX, chunkZ, 16, 0, 255);

            break;

        case 1:

            break;

        case -1:

            break;
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore Generated out of Bounds");
        int heightDiff = maxHeight - minHeight +1;

        for(int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world,  rand,  new BlockPos(x, y, z));
        }
    }

}
