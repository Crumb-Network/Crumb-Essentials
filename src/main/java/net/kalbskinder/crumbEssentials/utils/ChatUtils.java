package net.kalbskinder.crumbEssentials.utils;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ChatUtils {
    private static final MiniMessage serializer = MiniMessage.miniMessage();

    public static void sendMessageList(CommandSender sender, List<String> messages) {
       messages.forEach(msg -> {
           sender.sendMessage(serializer.deserialize(msg));
       });
    }
}
