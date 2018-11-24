package com.atherys.module.npcs;

import com.atherys.module.npcs.script.NPCsExtension;
import com.atherys.script.js.JavaScriptLibrary;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;

import javax.inject.Inject;
import java.util.logging.Logger;

@Plugin(
        id = NPCModule.ID,
        name = NPCModule.NAME,
        description = NPCModule.DESCRIPTION,
        version = NPCModule.VERSION,
        dependencies = {
                @Dependency(id = "atheryscore"),
                @Dependency(id = "atherysscript")
        }
)
public class NPCModule {
    public static final String ID = "atherysnpcsmodule";
    public static final String NAME = "A'therys NPCs Module";
    public static final String DESCRIPTION = "A plugin written for the A'therys Horizons server.";
    public static final String VERSION = "1.0.0";

    @Inject
    private Logger logger;

    private void init() {
        JavaScriptLibrary.getInstance().extendWith(NPCsExtension.getInstance());
        logger.info("NPC Scripting module loaded!");
    }

    @Listener
    public void onInit(GameInitializationEvent event) {
        init();
    }
}
