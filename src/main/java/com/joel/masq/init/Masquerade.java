package com.joel.masq.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Masquerade.MODID, version = Masquerade.VERSION, acceptedMinecraftVersions = Masquerade.MCVERSION)
public class Masquerade {
    public static final String MODID = "masq";
    public static final String VERSION = "1.0";
    public static final String MCVERSION = "1.12.2";

    @Mod.Instance
    public static Masquerade instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
