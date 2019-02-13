package com.atherys.module.npcs.script;

import me.mrdaniel.npcs.io.NpcFile;
import org.spongepowered.api.entity.ArmorEquipable;

import java.util.UUID;
import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetNPCSkin implements BiFunction<NpcFile, UUID, Boolean> {

    /**
     * Sets the skin of the NPC given a player's UUID.
     * @param npcFile A humanoid NPC.
     * @return False if the NPC was not humanoid.
     */
    @Override
    public Boolean apply(NpcFile npcFile, UUID uuid) {
        if (npcFile.getType().get() instanceof ArmorEquipable) {
            npcFile.setSkinUUID(uuid);
            return true;
        }

        return false;
    }
}
