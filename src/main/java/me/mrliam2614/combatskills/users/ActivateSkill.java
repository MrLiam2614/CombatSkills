package me.mrliam2614.combatskills.users;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ActivateSkill {
    private final CombatSkills plugin;

    public ActivateSkill(CombatSkills plugin){
        this.plugin = plugin;
        check();
    }

    public void check(){
        //Get all players
        for(Player player : Bukkit.getServer().getOnlinePlayers()){
            String playerClass = plugin.getClass.getClass(player);
            assert playerClass != null;

            //Get class Information
            for(String skill : plugin.getClass.getClassInfo(playerClass)){

            }
        }
    }
}
