package dm.surrealarts;

import org.bukkit.plugin.java.JavaPlugin;

import dm.surrealarts.darkmatter.items.DarkMatterSetup;

import org.bstats.bukkit.Metrics;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;

public final class DarkMatter extends JavaPlugin implements SlimefunAddon {
	private static DarkMatter instance;

	@Override
	public void onEnable() {
		setInstance(this);
		new Metrics(this, 13830);

		getLogger().info("** DarkMatter ** by SurrealArts");

		DarkMatterSetup.INSTANCE.init();

		getConfig().options().copyDefaults();
    saveDefaultConfig();

		if (getConfig().getBoolean("auto-update", true) && getDescription().getVersion().startsWith("DEV - ")) {
      new GitHubBuildsUpdater(this, getFile(), "SurrealArts/Dark-Matter/main").start();
    }
	}

	@Override
	public JavaPlugin getJavaPlugin() {
		return this;
	}

	@Override
  public String getBugTrackerURL() {
    return "https://github.com/SurrealArts/Dark-Matter/issues";
  }

  private static void setInstance(DarkMatter ins) {
    instance = ins;
  }

  public static DarkMatter getInstance() {
    return instance;
  }




  // @Override
  // public void onEnable() {
  //       /*
  //        * 1. Creating a new Category
  //        * This Category will use the following ItemStack
  //        */
  //       CustomItemStack categoryItem = new CustomItemStack(Material.LODESTONE, "&8&lDark Matter", "", "&a> Click to open");

  //       // Give your Category a unique id.
  //       NamespacedKey categoryId = new NamespacedKey(this, "Dark Matter");
  //       ItemGroup itemGroup = new ItemGroup(categoryId, categoryItem);

  //       /*
  //        * 2. Create a new SlimefunItemStack
  //        * This class has many constructors, it is very important
  //        * that you give each item a unique id.
  //        */
  //       SlimefunItemStack itemStack = new SlimefunItemStack("DARK_MATTER_MACHINES", Material.SMITHING_TABLE, "&b&lMatter Manipulator", "", "&8Used to create Dark Matter related items.");

  //       /*
  //        * 3. Creating a Recipe
  //        * The Recipe is an ItemStack Array with a length of 9.
  //        * It represents a Shaped Recipe in a 3x3 crafting grid.
  //        * The machine in which this recipe is crafted in is specified
  //        * further down as the RecipeType.
  //        */
  //       ItemStack[] recipe = {
	// 				SlimefunItems.REDSTONE_ALLOY,				SlimefunItems.ELECTRIC_MOTOR,			SlimefunItems.REDSTONE_ALLOY,
	// 				SlimefunItems.ELECTRIC_PRESS_2, 		SlimefunItems.MEDIUM_CAPACITOR,		SlimefunItems.ELECTRIC_PRESS_2,
	// 				new ItemStack(Material.ANVIL),						SlimefunItems.CARBONADO,		new ItemStack(Material.ANVIL)
	// 			};

  //       /*
  //        * 4. Registering the Item
  //        * Now you just have to register the item.
  //        * RecipeType.ENHANCED_CRAFTING_TABLE refers to the machine in
  //        * which this item is crafted in.
  //        * Recipe Types from Slimefun itself will automatically add the recipe to that machine.
  //        */
  //       SlimefunItem MatterManipulator = new SlimefunItem(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  //       MatterManipulator.register(this);
  //   }

  //   @Override
  //   public void onDisable() {
  //       // Logic for disabling the plugin...
  //   }

  //   @Override
  //   public String getBugTrackerURL() {
  //       // You can return a link to your Bug Tracker instead of null here
  //       return null;
  //   }

  //   @Override
  //   public JavaPlugin getJavaPlugin() {
  //       /*
  //        * You will need to return a reference to your Plugin here.
  //        * If you are using your main class for this, simply return "this".
  //        */
  //       return this;
  //   }

}
