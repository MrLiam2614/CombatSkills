package me.mrliam2614.combatskills.users;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.Set;

public class GetClass {
    private final CombatSkills plugin;

    public GetClass(CombatSkills plugin){
        this.plugin = plugin;
    }
    public String getClass(Player player){
        return plugin.users.getConfig().getString("users."+player.getName()+".class");
    }

    public String getClass(String player){
        return getClass(Bukkit.getPlayer(player));
    }

    public Set<String> getClassInfo(String Class){
        return plugin.classList.get(Class).getConfig().getConfigurationSection("").getKeys(true);
    }

    public ConfigurationSection getSkillInfo(String Class, String skill){
        return plugin.classList.get(Class).getConfig().getConfigurationSection(skill);
    }
}
