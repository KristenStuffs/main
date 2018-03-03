package kristenores.mod;

import kristenores.mod.handlers.RegistryHandler;
import kristenores.mod.init.BlockInit;
import kristenores.mod.init.ItemInit;
import kristenores.mod.objects.recipes.SmeltingRecipes;
import kristenores.mod.proxy.CommonProxy;
import kristenores.mod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs USELESSORESTAB = new UselessOresTab("uselessorestab");

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{		
        RegistryHandler.otherRegistries();
	}
	
	public static void init(FMLInitializationEvent event) 
	{	
		SmeltingRecipes.addRecipes();
	}
	
	public static void postInit(FMLPostInitializationEvent event) {
			
	}

}
