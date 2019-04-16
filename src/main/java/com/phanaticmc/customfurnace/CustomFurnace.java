package com.phanaticmc.customfurnace;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public final class CustomFurnace extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new FurnaceListener(), this);
		setupRecipes();
	}

	@Override
	public void onDisable() {
	}

	private void setupRecipes()
	{
		for(FurnaceItems furnaceitem : FurnaceItems.values()) {
			Bukkit.addRecipe(new FurnaceRecipe(new NamespacedKey(this, furnaceitem.name()), furnaceitem.getResult(), furnaceitem.getInput().getType(), 0.2f, 200));
		}
	}
}
