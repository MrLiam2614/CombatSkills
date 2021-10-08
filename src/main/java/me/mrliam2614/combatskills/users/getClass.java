package me.mrliam2614.combatskills.users;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class getClass {
    private final CombatSkills plugin;

    public getClass(CombatSkills plugin){
        this.plugin = plugin;
    }
    public String getClass(Player player){
        return plugin.users.getConfig().getString("users."+player.getName()+".class");
    }

    public String getClass(String player){
        return getClass(Bukkit.getPlayer(player));
    }
}
