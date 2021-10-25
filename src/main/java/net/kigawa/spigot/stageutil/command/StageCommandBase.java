package net.kigawa.spigot.stageutil.command;

import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.pluginutil.command.Subcommand;
import net.kigawa.spigot.stageutil.StageManager;

public abstract class StageCommandBase extends Subcommand {
    private final StageManager manager;

    public StageCommandBase(PluginBase kigawaPlugin, StageManager manager) {
        super(kigawaPlugin);
        this.manager = manager;
    }

    public StageManager getManager() {
        return manager;
    }
}

