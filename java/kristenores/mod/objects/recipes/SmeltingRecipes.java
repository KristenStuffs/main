package kristenores.mod.objects.recipes;

import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	
	public SmeltingRecipes()
	{
		
	}
		public static void addRecipes() 
		{
			GameRegistry.addSmelting(BlockInit.ORE_COPPER1, new ItemStack(ItemInit.INGOT_COPPER1), 0.2f);
		}
	}
