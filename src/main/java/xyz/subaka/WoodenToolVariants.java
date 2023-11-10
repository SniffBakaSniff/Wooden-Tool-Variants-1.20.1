package xyz.subaka;

import net.fabricmc.api.ModInitializer;
import xyz.subaka.items.ModItems;


public class WoodenToolVariants implements ModInitializer {
	public static final String MOD_ID = "woodentoolvariants";

	@Override
	public void onInitialize() {
		ModItems.register();
	}
}