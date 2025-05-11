package me.emmy.deathmessage.enums;

import lombok.Getter;

/**
 * @author Emmy
 * @project DeathMessage
 * @since 11/05/2025
 */
@Getter
public enum EnumMessageType {
    TROLL("Troll", "Troll messages for players"),
    MEME("Meme", "Meme messages for players"),

    ;

    private final String name;
    private final String description;

    /**
     * Constructor for the EnumMessageType enum.
     *
     * @param name        The name of the message type.
     * @param description A brief description of the message type.
     */
    EnumMessageType(String name, String description) {
        this.name = name;
        this.description = description;
    }
}