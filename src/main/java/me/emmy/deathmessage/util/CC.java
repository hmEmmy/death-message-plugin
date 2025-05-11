package me.emmy.deathmessage.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project DeathMessage
 * @since 11/05/2025
 */
@UtilityClass
public class CC {

    public String translate(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}