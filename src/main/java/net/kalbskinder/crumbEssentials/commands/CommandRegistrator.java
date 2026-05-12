package net.kalbskinder.crumbEssentials.commands;

import lombok.RequiredArgsConstructor;
import net.kalbskinder.helpers.commands.CommandHelper;
import net.kalbskinder.helpers.commands.CommandManager;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CommandRegistrator {
    private final List<CommandHelper> commands = new ArrayList<>();

    public void register(
            FileConfiguration config,
            CommandManager commandManager
    ) {
        commands.add(new GithubCommand(config).build());
        commands.add(new DiscordCommand(config).build());

        commandManager.registerCommands(commands);
    }
}
