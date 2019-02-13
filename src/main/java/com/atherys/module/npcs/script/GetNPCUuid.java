package com.atherys.module.npcs.script;

import me.mrdaniel.npcs.io.NpcFile;

import java.util.UUID;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetNPCUuid implements Function<NpcFile, UUID> {

    /**
     * Gets the UUID from an NPC. This will be invalidated after a world restart.
     * @param npc The NPC.
     * @return The NPC's UUID.
     */
    @Override
    public UUID apply(NpcFile npc) {
        return npc.getCache().orElse(null);
    }
}
