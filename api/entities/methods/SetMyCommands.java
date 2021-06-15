package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.BotCommand;

public class SetMyCommands {
    public BotCommand[] commands;

    public SetMyCommands(BotCommand[] commands) {
        this.commands = commands;
    }

    public SetMyCommands() {
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
