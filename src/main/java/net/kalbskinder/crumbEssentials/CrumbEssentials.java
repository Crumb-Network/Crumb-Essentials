package net.kalbskinder.crumbEssentials;

import net.kalbskinder.crumbEssentials.commands.CommandRegistrator;
import net.kalbskinder.helpers.Helpers;
import net.kalbskinder.helpers.commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrumbEssentials extends JavaPlugin {
    private CommandManager commandManager;

    @Override
    public void onLoad() {
        commandManager = new CommandManager(getLifecycleManager());
        new CommandRegistrator().register(getConfig(), commandManager);
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Helpers.initialize(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
