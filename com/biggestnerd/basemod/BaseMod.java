package com.biggestnerd.basemod;

import com.biggestnerd.basemod.commonproxy.CommonProxy;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="basemod", name="Base Mod", version="v1")
public class BaseMod {
	
	public static Minecraft mc = Minecraft.getMinecraft();

	@Instance(value="BaseMod")
	public static BaseMod instance;
	
	@SidedProxy(clientSide="com.biggestnerd.basemod.commonproxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
	}	
}
