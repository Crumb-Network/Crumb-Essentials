package net.kalbskinder.crumbEssentials.commands;

import lombok.RequiredArgsConstructor;
import net.kalbskinder.crumbEssentials.utils.ChatUtils;
import net.kalbskinder.helpers.commands.CommandHelper;
import org.bukkit.configuration.file.FileConfiguration;

@RequiredArgsConstructor
public class DiscordCommand {
    private final FileConfiguration config;

    public CommandHelper build() {
        return CommandHelper.create("discord").executes(ctx -> {
            ChatUtils.sendMessageList(ctx.getSender(), config.getStringList("commands.discord"));
        });
    }
}
