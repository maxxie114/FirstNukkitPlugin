package FirstNukkitPlugin;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;

import cn.nukkit.Player;

class EventListener implements Listener {

    Main plugin;

    public EventListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(player.getName() + " joined the server");
        player.sendMessage("Welcome!");
    }
}
