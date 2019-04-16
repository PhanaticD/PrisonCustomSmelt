package com.phanaticmc.customfurnace;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public enum FurnaceItems {

	REFINED_IRON_INGOT(
			new ItemStack(Material.IRON_INGOT), null, null,
			new ItemStack(Material.IRON_INGOT), ChatColor.GREEN + "Refined Iron Ingot" + ChatColor.RESET, null
	),
	REFINED_GOLD_INGOT(
			new ItemStack(Material.GOLD_INGOT), null, null,
			new ItemStack(Material.GOLD_INGOT), ChatColor.GREEN + "Refined Gold Ingot" + ChatColor.RESET, null
	),
	REFINED_DIAMOND_BLOCK(
			new ItemStack(Material.DIAMOND_BLOCK), null, null,
			new ItemStack(Material.DIAMOND_BLOCK), ChatColor.GREEN + "Refined Diamond Block" + ChatColor.RESET, null
	),
	REFINED_DIAMOND(
			new ItemStack(Material.DIAMOND), null, null,
			new ItemStack(Material.DIAMOND), ChatColor.GREEN + "Refined Diamond" + ChatColor.RESET, null
	),
	REFINED_EMERALD_BLOCK(
			new ItemStack(Material.EMERALD_BLOCK), null, null,
			new ItemStack(Material.EMERALD_BLOCK), ChatColor.GREEN + "Refined Emerald Block" + ChatColor.RESET, null
	),
	REFINED_GLOWSTONE_DUST(
			new ItemStack(Material.GLOWSTONE_DUST), null, null,
			new ItemStack(Material.GLOWSTONE_DUST), ChatColor.GREEN + "Refined Glowstone Dust" + ChatColor.RESET, null
	),
	REFINED_LAPIS_LAZULI(
			new ItemStack(Material.LAPIS_LAZULI), null, null,
			new ItemStack(Material.LAPIS_LAZULI), ChatColor.GREEN + "Refined Lapis Lazuli" + ChatColor.RESET, null
	),
	REFINED_OBSIDIAN(
			new ItemStack(Material.OBSIDIAN), null, null,
			new ItemStack(Material.OBSIDIAN), ChatColor.GREEN + "Refined Obsidian" + ChatColor.RESET, null
	),
	REFINED_PURPUR_BLOCK(
			new ItemStack(Material.PURPUR_BLOCK), null, null,
			new ItemStack(Material.PURPUR_BLOCK), ChatColor.GREEN + "Refined Purpur Block" + ChatColor.RESET, null
	),
	REFINED_QUARTZ(
			new ItemStack(Material.QUARTZ), null, null,
			new ItemStack(Material.QUARTZ), ChatColor.GREEN + "Refined Quartz" + ChatColor.RESET, null
	),
	REFINED_REDSTONE_DUST(
			new ItemStack(Material.REDSTONE), null, null,
			new ItemStack(Material.REDSTONE), ChatColor.GREEN + "Refined Redstone Dust" + ChatColor.RESET, null
	),
	REFINED_SOULD_SAND(
			new ItemStack(Material.SOUL_SAND), null, null,
			new ItemStack(Material.SOUL_SAND), ChatColor.GREEN + "Refined Soul Sand" + ChatColor.RESET, null
	),
	REFINED_CHISELED_QUARTZ_BLOCK(
			new ItemStack(Material.CHISELED_QUARTZ_BLOCK), null, null,
			new ItemStack(Material.CHISELED_QUARTZ_BLOCK), ChatColor.GREEN + "Refined Chiseled Quartz Block" + ChatColor.RESET, null
	);

	ItemStack input;
	ItemStack result;

	FurnaceItems(ItemStack input, String input_display, List<String> input_lore, ItemStack result, String result_display, List<String> result_lore)
	{
		ItemMeta inputmeta = input.getItemMeta();
		if(input_display != null) {
			inputmeta.setDisplayName(input_display);
		}
		if(input_lore != null) {
			inputmeta.setLore(result_lore);
		}
		this.input = input;
		this.input.setItemMeta(inputmeta);

		ItemMeta resultmeta = result.getItemMeta();
		if(result_display != null) {
			resultmeta.setDisplayName(result_display);
		}
		if(result_lore != null) {
			resultmeta.setLore(result_lore);
		}
		this.result = result;
		this.result.setItemMeta(resultmeta);
	}

	public ItemStack getInput()
	{
		return input;
	}
	public ItemStack getResult()
	{
		return result;
	}
}
