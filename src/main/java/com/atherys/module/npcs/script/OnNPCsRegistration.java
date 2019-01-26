package com.atherys.module.npcs.script;

import com.atherys.module.npcs.event.RegisterNPCsEvent;
import com.atherys.script.js.library.event.EventHandlerFunction;

public class OnNPCsRegistration extends EventHandlerFunction<RegisterNPCsEvent> {
    public OnNPCsRegistration() {
        super(RegisterNPCsEvent.class);
    }
}
