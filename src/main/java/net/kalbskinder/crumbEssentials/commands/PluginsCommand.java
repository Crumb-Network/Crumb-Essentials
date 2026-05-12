package net.kalbskinder.crumbEssentials.commands;

import lombok.RequiredArgsConstructor;
import net.kalbskinder.helpers.commands.CommandHelper;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

@RequiredArgsConstructor
public class PluginsCommand {
    private final MiniMessage serializer = MiniMessage.miniMessage();
    private final FileConfiguration config;

    public CommandHelper build() {
        return CommandHelper.create("plugins").executes(ctx -> {
            List<String> selfMadePlugins = config.getStringList("plugins.self-made");
            List<String> otherPlugins = config.getStringList("plugins.other");
            int pluginCount = selfMadePlugins.size() + otherPlugins.size();
            CommandSender sender = ctx.getSender();

            sender.sendMessage(serializer.deserialize("<color:#3471e3>ⓘ <white>Server Plugins (" + pluginCount + "):"));
            sender.sendMessage(serializer.deserialize("<color:#db7618>Self-Made Plugins:"));
            sender.sendMessage(serializer.deserialize("<dark_gray> - <green>" + String.join("<gray>, <green>", selfMadePlugins)));
            sender.sendMessage(serializer.deserialize("<color:#db7618>Other Plugins:"));
            sender.sendMessage(serializer.deserialize("<dark_gray> - <green>" + String.join("<gray>, <green>", otherPlugins)));
        });
    }
}
