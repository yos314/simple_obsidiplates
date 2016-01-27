package mod.yos.simpleobsidiplates;


import mod.yos.simpleobsidiplates.constants.Reference;
import mod.yos.simpleobsidiplates.init.ModBlocks;
import mod.yos.simpleobsidiplates.init.ModRecipes;
import mod.yos.simpleobsidiplates.proxy.IProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class SimpleObsidiplates {
    @Mod.Instance(Reference.MOD_ID)
    public static SimpleObsidiplates instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(this);
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        this.proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
