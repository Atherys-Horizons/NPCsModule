package com.atherys.module.npcs.script;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public class NPCsExtension implements LibraryExtension {

    private static NPCsExtension instance = new NPCsExtension();

    private NPCsExtension() {
    }

    public static NPCsExtension getInstance() {
        return instance;
    }

    @Override
    public void extend(ScriptLibrary scriptLibrary) {
        scriptLibrary.put("createNPC", new CreateNPC());
        scriptLibrary.put("getNPCUUID", new GetNPCUuid());
        scriptLibrary.put("setNPCSkin", new SetNPCSkin());
        scriptLibrary.put("setNPCName", new SetNPCName());
        scriptLibrary.put("getNPCEntity", new GetNPCEntity());
        scriptLibrary.put("getNPCType", new GetNPCType());
    }
}
