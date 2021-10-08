package me.mrliam2614.combatskills;

import me.mrliam2614.FacilitisAPI.FacilitisAPI;
import me.mrliam2614.FacilitisAPI.config.FConfig;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class CombatSkills extends JavaPlugin {
    private FacilitisAPI facilitisAPI;
    public FConfig users;
    public FConfig classes;
    public HashMap<String, FConfig> classList;

    public void onEnable() {
        facilitisAPI = FacilitisAPI.getInstance();
        facilitisAPI.messages.EnableMessage(this);
        classList = new HashMap<>();

        saveDefaultConfig();
        //Load Default Configs
        new FConfig(this, "example.yml");
        users = new FConfig(this, "users.yml");
        classes = new FConfig(this, "classes.yml");
        generateClassesFiles();
    }

    public void onDisable() {
        facilitisAPI.messages.DisableMessage(this);
    }

    public FacilitisAPI getFacilitisAPI() {
        return facilitisAPI;
    }

    private void generateClassesFiles() {
        ConfigurationSection cs = classes.getConfig().getConfigurationSection("classes");
        assert cs != null;
        for (String skillClass : cs.getKeys(false)) {
            classList.put(skillClass, new FConfig(this, "class_" + skillClass + ".yml"));
        }
    }

    public String serverVersion(){
        return Bukkit.getServer().getVersion();
    }
}
