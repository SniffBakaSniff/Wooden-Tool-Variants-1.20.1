package xyz.subaka;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xyz.subaka.items.ModItems;


public class WoodenToolVariants implements ModInitializer {
	public static final String MOD_ID = "woodentoolvariants";
	public static final TagKey<Item> TOOL_IS_FUEL = TagKey.of(RegistryKeys.ITEM, new Identifier(WoodenToolVariants.MOD_ID, "tool_is_fuel"));

	@Override
	public void onInitialize() {
		ModItems.register();


		CommonLifecycleEvents.TAGS_LOADED.register((identifier, tag) -> {
			FuelRegistry.INSTANCE.add(TOOL_IS_FUEL, 200);

		});
	}
}