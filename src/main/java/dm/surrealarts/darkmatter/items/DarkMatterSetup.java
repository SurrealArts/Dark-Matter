package dm.surrealarts.darkmatter.items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import dm.surrealarts.DarkMatter;
import dm.surrealarts.darkmatter.machines.*;

public final class DarkMatterSetup {
	public static final DarkMatterSetup INSTANCE = new DarkMatterSetup();
	private final SlimefunAddon plugin = DarkMatter.getInstance();
  private boolean initialised;

	public void init() {
		if (initialised) {
			return;
		}

		initialised = true;

		registerMachines();
	}

	private void registerMachines() {
		MatterManipulator.setup();
	}
}