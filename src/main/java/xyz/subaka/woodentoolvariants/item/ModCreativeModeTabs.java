package xyz.subaka.woodentoolvariants.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xyz.subaka.woodentoolvariants.WoodenToolVariants;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoodenToolVariants.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WOODEN_TOOL_VARIANTS_TAB = CREATIVE_MODE_TABS.register("wooden_tool_variants",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.WOODEN_PICKAXE))
                    .title(Component.translatable("creativetab.wooden_tool_variants_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BIRCH_PICKAXE.get());

                        pOutput.accept(Items.WOODEN_PICKAXE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
    }
}
