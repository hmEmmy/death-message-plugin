package me.emmy.deathmessage;

import lombok.Getter;
import me.emmy.deathmessage.listener.DeathListener;
import me.emmy.deathmessage.repository.MessageRepository;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class DeathMessage extends JavaPlugin {

    @Getter
    private static DeathMessage instance;

    private MessageRepository messageRepository;

    @Override
    public void onEnable() {
        instance = this;

        this.messageRepository = new MessageRepository();
        this.getServer().getPluginManager().registerEvents(new DeathListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
