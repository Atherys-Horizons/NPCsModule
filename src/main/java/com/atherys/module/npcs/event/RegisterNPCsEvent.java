package com.atherys.module.npcs.event;

import me.mrdaniel.npcs.managers.NPCManager;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.event.cause.Cause;

public class RegisterNPCsEvent implements Event {

    private Cause cause;

    private NPCManager npcManager;

    public RegisterNPCsEvent(NPCManager npcManager) {
        this.npcManager = npcManager;
        this.cause = Cause.of(Sponge.getCauseStackManager().getCurrentContext(), npcManager);
    }

    public NPCManager getNpcManager() {
        return npcManager;
    }

    @Override
    public Cause getCause() {
        return cause;
    }
}
