package dm.surrealarts.darkmatter.machines;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dm.surrealarts.DarkMatter;
import dm.surrealarts.darkmatter.items.DarkMatterItems;
// import dm.surrealarts.darkmatter.machines.*;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class MatterManipulator extends SlimefunItem {
	public MatterManipulator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType,
			ItemStack[] recipe) {
		super(itemGroup, item, recipeType, recipe);
	}

	private static final SlimefunAddon plugin = DarkMatter.getInstance();

	public static void setup() {
		new MatterManipulator(
			DarkMatterItems.MACHINES,
			DarkMatterItems.MATTER_MANIPULATOR,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[]{
				SlimefunItems.REDSTONE_ALLOY,				SlimefunItems.ELECTRIC_MOTOR,			SlimefunItems.REDSTONE_ALLOY,
				SlimefunItems.ELECTRIC_PRESS_2, 		SlimefunItems.MEDIUM_CAPACITOR,		SlimefunItems.ELECTRIC_PRESS_2,
				new ItemStack(Material.ANVIL),			SlimefunItems.CARBONADO,					new ItemStack(Material.ANVIL)
			}
		);
	}
}
