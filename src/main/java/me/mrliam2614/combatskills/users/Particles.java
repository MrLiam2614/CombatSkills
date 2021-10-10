package me.mrliam2614.combatskills.users;

import me.mrliam2614.combatskills.CombatSkills;
import org.bukkit.DyeColor;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class Particles {
    private final CombatSkills plugin;

    public Particles(CombatSkills plugin) {
        this.plugin = plugin;
    }

    public void particle(Player p, double x, double y, double z, String c) {
        double red, green, blue;
        red = DyeColor.valueOf(c).getColor().getRed();
        green = DyeColor.valueOf(c).getColor().getGreen();
        blue = DyeColor.valueOf(c).getColor().getBlue();

        p.spawnParticle(Particle.REDSTONE, x, y, z, 0, 0.001, red, green, blue);
    }
}
