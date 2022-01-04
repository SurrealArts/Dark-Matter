package dm.surrealarts.darkmatter.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import dm.surrealarts.DarkMatter;
// import dm.surrealarts.darkmatter.machines.*;
// import org.bukkit.enchantments.Enchantment;
// import org.bukkit.inventory.ItemFlag;
// import org.bukkit.inventory.ItemStack;
// import org.bukkit.inventory.meta.ItemMeta;

public class DarkMatterItems {
	private DarkMatterItems() {}

	public static final ItemGroup DARK_MATTER = new ItemGroup(
		new NamespacedKey(DarkMatter.getInstance(), "DARK_MATTER"),
		new CustomItemStack(Material.BEACON, "&6&lDark Matter")
	);

	public static final NestedItemGroup DARK_MATTER_ITEMS = new NestedItemGroup(
		new NamespacedKey(DarkMatter.getInstance(), "DARK_MATTER_ITEMS"),
		new CustomItemStack(Material.IRON_INGOT, "&6&lDark Matter")
	);

	public static final SubItemGroup MACHINES = new SubItemGroup(
		new NamespacedKey(DarkMatter.getInstance(), "MACHINES"),
		DARK_MATTER_ITEMS,
		new CustomItemStack(Material.LODESTONE, "&9Dark Matter Machines")
	);

	public static final SlimefunItemStack MATTER_MANIPULATOR = new SlimefunItemStack(
		"MATTER_MANIPULATOR",
		Material.SMITHING_TABLE,
		"&eMatter Manipulator",
		"",
		"&eThe simplest form of manipulating",
		"&ematter to craft various items."
	);
}