package com.atherys.module.npcs.script;

import me.mrdaniel.npcs.io.NPCFile;
import org.spongepowered.api.entity.Entity;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetNPCEntity implements Function<NPCFile, Entity> {

    /**
     * Gets the `Entity` object from the NPC, or null. This is for functions that might require
     * an `Entity` object instead of an npc.
     */
    @Override
    public Entity apply(NPCFile npcFile) {
        return npcFile.getEntity().orElse(null);
    }
}
