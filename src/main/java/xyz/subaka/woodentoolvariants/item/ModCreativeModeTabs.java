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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WARPED_AXE.get()))
                    .title(Component.translatable("creativetab.wooden_tool_variants_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.WOODEN_SWORD);
                        pOutput.accept(Items.WOODEN_PICKAXE);
                        pOutput.accept(Items.WOODEN_AXE);
                        pOutput.accept(Items.WOODEN_SHOVEL);
                        pOutput.accept(Items.WOODEN_HOE);

                        pOutput.accept(ModItems.BIRCH_SWORD.get());
                        pOutput.accept(ModItems.BIRCH_PICKAXE.get());
                        pOutput.accept(ModItems.BIRCH_AXE.get());
                        pOutput.accept(ModItems.BIRCH_SHOVEL.get());
                        pOutput.accept(ModItems.BIRCH_HOE.get());

                        pOutput.accept(ModItems.WARPED_SWORD.get());
                        pOutput.accept(ModItems.WARPED_PICKAXE.get());
                        pOutput.accept(ModItems.WARPED_AXE.get());
                        pOutput.accept(ModItems.WARPED_SHOVEL.get());
                        pOutput.accept(ModItems.WARPED_HOE.get());

                        pOutput.accept(ModItems.CRIMSON_SWORD.get());
                        pOutput.accept(ModItems.CRIMSON_PICKAXE.get());
                        pOutput.accept(ModItems.CRIMSON_AXE.get());
                        pOutput.accept(ModItems.CRIMSON_SHOVEL.get());
                        pOutput.accept(ModItems.CRIMSON_HOE.get());

                        pOutput.accept(ModItems.MANGROVE_SWORD.get());
                        pOutput.accept(ModItems.MANGROVE_PICKAXE.get());
                        pOutput.accept(ModItems.MANGROVE_AXE.get());
                        pOutput.accept(ModItems.MANGROVE_SHOVEL.get());
                        pOutput.accept(ModItems.MANGROVE_HOE.get());

                        pOutput.accept(ModItems.CHERRY_SWORD.get());
                        pOutput.accept(ModItems.CHERRY_PICKAXE.get());
                        pOutput.accept(ModItems.CHERRY_AXE.get());
                        pOutput.accept(ModItems.CHERRY_SHOVEL.get());
                        pOutput.accept(ModItems.CHERRY_HOE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
    }
}
