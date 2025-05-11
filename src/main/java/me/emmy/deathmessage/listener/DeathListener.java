package me.emmy.deathmessage.listener;

import me.emmy.deathmessage.DeathMessage;
import me.emmy.deathmessage.record.MessageRecord;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 * @author Emmy
 * @project DeathMessage
 * @since 11/05/2025
 */
public class DeathListener implements Listener {

    @EventHandler
    private void onPlayerDeath(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Player killer = victim.getKiller() != null ? victim.getKiller() : null;

        if (killer == null) return;

        //Either use a profile class to allow selection, or just randomize it :v

        MessageRecord message = DeathMessage.getInstance().getMessageRepository().getRandomMessage();
        String constructedMessage = message.constructMessage(killer.getName(), victim.getName());

        event.setDeathMessage(constructedMessage);
    }
}