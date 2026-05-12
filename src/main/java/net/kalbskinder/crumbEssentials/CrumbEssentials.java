package net.kalbskinder.crumbEssentials;

import net.kalbskinder.crumbEssentials.commands.CommandRegistrator;
import net.kalbskinder.helpers.Helpers;
import net.kalbskinder.helpers.commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrumbEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandManager commandManager = new CommandManager(getLifecycleManager());

        saveDefaultConfig();
        Helpers.initialize(this);

        CommandRegistrator commandRegistrator = new CommandRegistrator();
        commandRegistrator.register(getConfig(), commandManager);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
