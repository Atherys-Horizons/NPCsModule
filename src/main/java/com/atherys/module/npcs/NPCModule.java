package com.atherys.module.npcs;

import com.atherys.module.npcs.event.RegisterNPCsEvent;
import com.atherys.module.npcs.script.NPCsExtension;
import com.atherys.script.js.JavaScriptLibrary;
import me.mrdaniel.npcs.NPCs;
import me.mrdaniel.npcs.io.NPCFile;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.Order;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

import javax.inject.Inject;
import java.util.Map;
import java.util.logging.Logger;

@Plugin(
        id = NPCModule.ID,
        name = NPCModule.NAME,
        description = NPCModule.DESCRIPTION,
        version = NPCModule.VERSION,
        dependencies = {
                @Dependency(id = "atheryscore"),
                @Dependency(id = "atherysscript"),
                @Dependency(id = "npcs")
        }
)
public class NPCModule {
    public static final String ID = "atherysnpcsmodule";
    public static final String NAME = "A'therys NPCs Module";
    public static final String DESCRIPTION = "A plugin written for the A'therys Horizons server.";
    public static final String VERSION = "1.0.0";

    private static boolean init;
    private static Map<String, NPCFile> registry;

    @Inject
    private Logger logger;

    @Inject
    private PluginContainer container;

    private void init() {
        JavaScriptLibrary.getInstance().extendWith(NPCsExtension.getInstance());
        logger.info("NPC Scripting module loaded!");

        init = true;
    }

    private void start() {
        Sponge.getEventManager().post(new RegisterNPCsEvent(NPCs.getNPCManager()));
        NPCs.reload(container);
    }

    @Listener
    public void onInit(GameInitializationEvent event) {
        init();
    }

    @Listener(order = Order.LATE)
    public void onStart(GameStartedServerEvent event) {
        if (init) start();
    }

    public static void registerNpc(String id, NPCFile npc) {
        registry.put(id, npc);
    }

    public static NPCFile getNpc(String id) {
        return registry.get(id);
    }

}
