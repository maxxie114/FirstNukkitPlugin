package FirstNukkitPlugin;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Player;
import cn.nukkit.plugin.PluginBase;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        this.getLogger().info("Potatoe's First Nukkit Plugin Enabled");
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Potatoe's First Nukkit Plugin Disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName()) {
            case "hey":
                sender.sendMessage("Hello there ;)");
                break;
        }
        return true;
    }
}
