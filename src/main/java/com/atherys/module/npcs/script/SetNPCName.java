package com.atherys.module.npcs.script;

import me.mrdaniel.npcs.io.NpcFile;
import org.spongepowered.api.text.Text;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetNPCName implements BiFunction<NpcFile, Text, Boolean> {

    /**
     * Sets the name of the given NPC.
     */
    @Override
    public Boolean apply(NpcFile npcFile, Text name) {
        npcFile.setName(name);
        return true;
    }
}
