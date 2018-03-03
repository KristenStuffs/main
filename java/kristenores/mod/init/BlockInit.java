package kristenores.mod.init;

import java.util.ArrayList;
import java.util.List;

import kristenores.mod.objects.blocks.BlockBase;
import kristenores.mod.objects.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_COPPER1 = new BlockBase("ore_copper1", Material.ROCK, 1, "pickaxe").setHardness(5).setResistance(15);

}
