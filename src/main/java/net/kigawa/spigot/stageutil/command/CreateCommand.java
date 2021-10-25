package net.kigawa.spigot.stageutil.command;

import net.kigawa.spigot.pluginutil.PluginBase;
import net.kigawa.spigot.stageutil.StageManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CreateCommand extends StageCommandBase {
    PluginBase plugin;

    public CreateCommand(PluginBase kigawaPlugin, StageManager manager) {
        super(kigawaPlugin, manager);
        plugin = kigawaPlugin;
    }

    @Override
    public String getName() {
        return "create";
    }

    @Override
    public String onThisCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        if (strings.length == 2) {
            //set stage
            return getManager().setStage(strings[1]);
        }
        return null;
    }

    @Override
    public int getWordNumber() {
        return 0;
    }

    @Override
    public String errorMessage() {
        return "/stage create <name>";
    }

    @Override
    public boolean isDefault() {
        return false;
    }

    @Override
    public List<String> getTabStrings(CommandSender sender, org.bukkit.command.Command command, String label, String[] strings) {
        return null;
    }
}
