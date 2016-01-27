package mod.yos.simpleobsidiplates.proxy;

import mod.yos.simpleobsidiplates.init.ModBlocks;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
    }

    @Override
    public void init(){
        ModBlocks.registerItemRenderer();
    }

    @Override
    public void postInit(){

    }
}
