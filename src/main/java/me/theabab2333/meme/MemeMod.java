package me.theabab2333.meme;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(MemeMod.MODID)
public class MemeMod {
    public static final String MODID = "meme";
    
    public MemeMod(IEventBus modEventBus, ModContainer modContainer) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}