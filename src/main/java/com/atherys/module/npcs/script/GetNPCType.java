package com.atherys.module.npcs.script;

import me.mrdaniel.npcs.io.NPCFile;
import org.spongepowered.api.entity.EntityType;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetNPCType implements Function<NPCFile, EntityType> {
    /**
     * Get the `EntityType` of an entity.
     * @return The type of entity, or null if it doesn't have one.
     */
    @Override
    public EntityType apply(NPCFile npcFile) {
        return npcFile.getType().orElse(null);
    }
}
