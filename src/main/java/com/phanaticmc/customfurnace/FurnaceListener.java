package com.phanaticmc.customfurnace;

import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class FurnaceListener implements Listener {
	@EventHandler
	private void furnaceCanceller(FurnaceSmeltEvent event) {
		for(FurnaceItems furnaceitem : FurnaceItems.values()) {
			if (event.getSource().getType() == furnaceitem.getInput().getType()) {
				if (!event.getSource().isSimilar(furnaceitem.getInput())) {
					event.setCancelled(true);
					return;
				}
			}
		}
	}

	@EventHandler
	private void furnaceCanceller(FurnaceBurnEvent event) {
		for(FurnaceItems furnaceitem : FurnaceItems.values()) {
			Furnace furnace = (Furnace) event.getBlock().getState();
			if (furnace.getInventory().getSmelting() != null) {
				if (furnace.getInventory().getSmelting().getType() == furnaceitem.getInput().getType()) {
					if (!furnace.getInventory().getSmelting().isSimilar(furnaceitem.getInput())) {
						event.setCancelled(true);
						return;
					}
				}
			}
		}
	}
	@EventHandler
	private void PrepareItemCraftEvent(PrepareItemCraftEvent event) {
		if(event.isRepair() || !(event.getRecipe() instanceof Keyed)){
			return;
		}
		if(isBlocked(((Keyed)event.getRecipe()).getKey().toString())){
			event.getInventory().setResult(new ItemStack(Material.AIR));
		}
	}
	private boolean isBlocked(String key){
		switch(key){
			case "minecraft:hopper":
			case "minecraft:piston":
			case "minecraft:sticky_piston":
			case "minecraft:enchanting_table":
				return true;
		}
		return false;
	}
}
