package net.kalbskinder.crumbEssentials.commands;

import lombok.RequiredArgsConstructor;
import net.kalbskinder.crumbEssentials.utils.ChatUtils;
import net.kalbskinder.helpers.commands.CommandHelper;
import org.bukkit.configuration.file.FileConfiguration;

@RequiredArgsConstructor
public class GithubCommand {
    private final FileConfiguration config;

    public CommandHelper build() {
        return CommandHelper.create("github").executes(ctx -> {
            ChatUtils.sendMessageList(ctx.getSender(), config.getStringList("commands.github"));
        });
    }
}
