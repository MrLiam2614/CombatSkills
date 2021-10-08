package me.mrliam2614.combatskills.users;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class verifications {
    private final CombatSkills plugin;

    public verifications(CombatSkills plugin){
        this.plugin = plugin;
    }

    public ItemStack itemOnHand(Player player){
        return player.getInventory().getItemInMainHand();
    }
    public ItemStack itemOnSecondHand(Player player){
        return player.getInventory().getItemInOffHand();
    }

    public boolean isSneaking(Player player){
        return player.isSneaking();
    }
}
