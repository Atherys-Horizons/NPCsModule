package com.atherys.module.npcs.script;

import me.mrdaniel.npcs.io.NpcFile;
import org.spongepowered.api.entity.EntityType;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetNPCType implements Function<NpcFile, EntityType> {
    /**
     * Get the `EntityType` of an entity.
     * @return The type of entity, or null if it doesn't have one.
     */
    @Override
    public EntityType apply(NpcFile npcFile) {
        return npcFile.getType().orElse(null);
    }
}
