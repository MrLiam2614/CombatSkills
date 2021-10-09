package me.mrliam2614.combatskills.items;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    private final CombatSkills plugin;

    public GenericList(CombatSkills plugin){
        this.plugin = plugin;
    }

    public List<Material> swords(){
        List <Material> list = new ArrayList<>();
        list.add(Material.WOODEN_SWORD);
        list.add(Material.STONE_SWORD);
        list.add(Material.IRON_SWORD);
        list.add(Material.GOLDEN_SWORD);
        list.add(Material.DIAMOND_SWORD);
        list.add(Material.NETHERITE_SWORD);

        return list;
    }
}
