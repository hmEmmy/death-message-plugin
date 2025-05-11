package me.emmy.deathmessage.record;

import lombok.Getter;
import lombok.Setter;
import me.emmy.deathmessage.enums.EnumMessageType;
import me.emmy.deathmessage.util.CC;

/**
 * @author Emmy
 * @project DeathMessage
 * @since 11/05/2025
 */
@Getter
@Setter
public class MessageRecord {
    private String message;
    private EnumMessageType type;

    /**
     * Constructor for the AbstractMessage class.
     *
     * @param message the message.
     * @param type    the type.
     */
    public MessageRecord(String message, EnumMessageType type) {
        this.message = message;
        this.type = type;
    }

    /**
     * Constructs a death Message.
     *
     * @param killer the killer player's name.
     * @param victim the victim player's name
     * @return the death message.
     */
    public String constructMessage(String killer, String victim) {
        return CC.translate("&c" + killer + " &f" + this.message + " &c" + victim);
    }
}