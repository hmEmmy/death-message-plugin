package me.emmy.deathmessage.repository;

import lombok.Getter;
import me.emmy.deathmessage.enums.EnumMessageType;
import me.emmy.deathmessage.record.MessageRecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Emmy
 * @project DeathMessage
 * @since 11/05/2025
 */
@Getter
public class MessageRepository {
    private final List<MessageRecord> messages;

    public MessageRepository() {
        this.messages = new ArrayList<>();
        this.initializeMessages();
    }

    private void initializeMessages() {
        this.messages.addAll(Arrays.asList(
                new MessageRecord("was memed by", EnumMessageType.MEME),
                new MessageRecord("took the L by", EnumMessageType.MEME),

                new MessageRecord("was sent to moon by", EnumMessageType.TROLL),
                new MessageRecord("skulled", EnumMessageType.TROLL)
        ));
    }

    /**
     * Allows accessing a MessageRecord object.
     *
     * @param messageClass the class reference.
     * @return the message object.
     */
    public MessageRecord getMessage(Class<? extends MessageRecord> messageClass) {
        return messages.stream()
                .filter(messageClass::isInstance)
                .findFirst()
                .orElse(null);
    }

    /**
     * Gets a random message.
     *
     * @return a random message.
     */
    public MessageRecord getRandomMessage() {
        return this.messages.get(ThreadLocalRandom.current().nextInt(this.messages.size()));
    }
}