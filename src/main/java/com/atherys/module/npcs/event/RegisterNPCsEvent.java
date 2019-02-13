package com.atherys.module.npcs.event;

import me.mrdaniel.npcs.managers.NpcManager;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.event.cause.Cause;

/**
 * @jsfunc
 */
public class RegisterNPCsEvent implements Event {

    private Cause cause;

    private NpcManager npcManager;

    public RegisterNPCsEvent(NpcManager npcManager) {
        this.npcManager = npcManager;
        this.cause = Cause.of(Sponge.getCauseStackManager().getCurrentContext(), npcManager);
    }

    public NpcManager getNpcManager() {
        return npcManager;
    }

    @Override
    public Cause getCause() {
        return cause;
    }
}
