package me.mrliam2614.combatskills.users;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.*;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.List;

public class ActivateSkill {
    private final CombatSkills plugin;
    public List<Color> colorList;

    public ActivateSkill(CombatSkills plugin) {
        this.plugin = plugin;

        //Set color list
        colorList.add(Color.WHITE);
        colorList.add(Color.SILVER);
        colorList.add(Color.GRAY);
        colorList.add(Color.BLACK);
        colorList.add(Color.RED);
        colorList.add(Color.MAROON);
        colorList.add(Color.YELLOW);
        colorList.add(Color.OLIVE);
        colorList.add(Color.LIME);
        colorList.add(Color.GREEN);
        colorList.add(Color.AQUA);
        colorList.add(Color.TEAL);
        colorList.add(Color.BLUE);
        colorList.add(Color.NAVY);
        colorList.add(Color.FUCHSIA);
        colorList.add(Color.PURPLE);
        colorList.add(Color.ORANGE);

        check();
    }

    public void check() {
        //Get all players
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            String playerClass = plugin.getClass.getClass(player);
            assert playerClass != null;

            //Get class Information
            for (String skill : plugin.getClass.getClassInfo(playerClass)) {
                ConfigurationSection cs = plugin.getClass.getSkillInfo(playerClass, skill);

                if (isActive(player, cs)) {
                    runSkill(player, cs);
                }

            }
        }
    }

    private boolean isActive(Player player, ConfigurationSection cs) {

        return false;
    }

    private void runSkill(Player player, ConfigurationSection cs) {

    }

    private void effects(Player player, ConfigurationSection cs) {
        String color, shape;
        if (cs.getBoolean("particles.enabled")) {
            color = cs.getString("particles.color");
            shape = cs.getString("particles.shape");
        }
    }

    private void SphereParticle(Player player, String c) {
        Location loc = player.getLocation();
        plugin.particles.particle(player, );
        player.spawnParticle(Particle.REDSTONE, loc.getX(), loc.getY(), loc.getZ(), 0, 0.001, red, green, blue);
    }
}
