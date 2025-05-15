package net.xkcinnay.createmonballsoverhaul.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xkcinnay.createmonballsoverhaul.CreateCobblemonBallsOverhaul;
import net.xkcinnay.createmonballsoverhaul.fluid.ModFluids;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCobblemonBallsOverhaul.MOD_ID);

    public static final Supplier<CreativeModeTab> CREATE_COBBLEMON_BALLS_OVERHAUL_ITEMS = CREATIVE_MODE_TAB.register( "create_cobblemon_balls_overhaul_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STURDY_BALL_MECHANISM.get()))
                    .title(Component.translatable("creativetab.createmonballsoverhaul.create_cobblemon_balls_overhaul_items"))
                    .displayItems((parameters, output) -> {
                        output.accept((ModItems.HALF_RED_APRICORN));
                        output.accept((ModItems.HALF_YELLOW_APRICORN));
                        output.accept((ModItems.HALF_GREEN_APRICORN));
                        output.accept((ModItems.HALF_BLUE_APRICORN));
                        output.accept((ModItems.HALF_PINK_APRICORN));
                        output.accept((ModItems.HALF_BLACK_APRICORN));
                        output.accept((ModItems.HALF_WHITE_APRICORN));
                        output.accept((ModItems.RED_APRICORN_BITS));
                        output.accept((ModItems.YELLOW_APRICORN_BITS));
                        output.accept((ModItems.GREEN_APRICORN_BITS));
                        output.accept((ModItems.BLUE_APRICORN_BITS));
                        output.accept((ModItems.PINK_APRICORN_BITS));
                        output.accept((ModItems.BLACK_APRICORN_BITS));
                        output.accept((ModItems.WHITE_APRICORN_BITS));
                        output.accept(ModItems.APRICORN_PUNCH);
                        output.accept((ModItems.RUBBER_STAMP_LID));
                        output.accept((ModItems.STAMPED_COPPER_NUGGET_LID));
                        output.accept((ModItems.STAMPED_IRON_NUGGET_LID));
                        output.accept((ModItems.STAMPED_ZINC_NUGGET_LID));
                        output.accept((ModItems.STAMPED_BRASS_NUGGET_LID));
                        output.accept((ModItems.STAMPED_STURDY_SHEET_LID));
                        output.accept((ModItems.STAMPED_STRIPPED_APRICORN_LOG_LID));
                        output.accept(ModItems.COPPER_BALL_BASE);
                        output.accept((ModItems.COPPER_BALL_MECHANISM));
                        output.accept((ModItems.COPPER_ANCIENT_BALL_MECHANISM));
                        output.accept(ModItems.IRON_BALL_BASE);
                        output.accept((ModItems.IRON_BALL_MECHANISM));
                        output.accept((ModItems.IRON_ANCIENT_BALL_MECHANISM));
                        output.accept(ModItems.BRASS_BALL_BASE);
                        output.accept((ModItems.BRASS_BALL_MECHANISM));
                        output.accept((ModItems.BRASS_ANCIENT_BALL_MECHANISM));
                        output.accept(ModItems.STURDY_BALL_BASE);
                        output.accept((ModItems.STURDY_BALL_MECHANISM));
                        output.accept((ModItems.STURDY_ANCIENT_BALL_MECHANISM));
                        output.accept((ModItems.TUMBLESTONE_DUST));
                        output.accept((ModItems.SKY_TUMBLESTONE_DUST));
                        output.accept((ModItems.BLACK_TUMBLESTONE_DUST));
                        output.accept((ModFluids.STANDARD_TUMBLESTONE_COATING_BUCKET));
                        output.accept((ModFluids.LIGHT_TUMBLESTONE_COATING_BUCKET));
                        output.accept((ModFluids.DENSE_TUMBLESTONE_COATING_BUCKET));
                    }).build());

    public static final Supplier<CreativeModeTab> CREATE_COBBLEMON_BALLS_OVERHAUL_LIDS = CREATIVE_MODE_TAB.register( "create_cobblemon_balls_overhaul_lids_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UNFINISHED_BEAST_BALL_LID.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CreateCobblemonBallsOverhaul.MOD_ID, "create_cobblemon_balls_overhaul_items_tab" ))
                    .title(Component.translatable("creativetab.createmonballsoverhaul.create_cobblemon_balls_overhaul_lids"))
                    .displayItems((parameters, output) -> {
                        output.accept((ModItems.RED_BALL_LID));
                        output.accept((ModItems.YELLOW_BALL_LID));
                        output.accept((ModItems.GREEN_BALL_LID));
                        output.accept((ModItems.BLUE_BALL_LID));
                        output.accept((ModItems.PINK_BALL_LID));
                        output.accept((ModItems.BLACK_BALL_LID));
                        output.accept((ModItems.WHITE_BALL_LID));
                        output.accept((ModItems.GREAT_BALL_LID));
                        output.accept((ModItems.ULTRA_BALL_LID));
                        output.accept((ModItems.SAFARI_BALL_LID));
                        output.accept((ModItems.FAST_BALL_LID));
                        output.accept((ModItems.LEVEL_BALL_LID));
                        output.accept((ModItems.LURE_BALL_LID));
                        output.accept((ModItems.HEAVY_BALL_LID));
                        output.accept((ModItems.LOVE_BALL_LID));
                        output.accept((ModItems.FRIEND_BALL_LID));
                        output.accept((ModItems.MOON_BALL_LID));
                        output.accept((ModItems.SPORT_BALL_LID));
                        output.accept((ModItems.PARK_BALL_LID));
                        output.accept((ModItems.NET_BALL_LID));
                        output.accept((ModItems.DIVE_BALL_LID));
                        output.accept((ModItems.NEST_BALL_LID));
                        output.accept((ModItems.REPEAT_BALL_LID));
                        output.accept((ModItems.TIMER_BALL_LID));
                        output.accept((ModItems.LUXURY_BALL_LID));
                        output.accept((ModItems.DUSK_BALL_LID));
                        output.accept((ModItems.HEAL_BALL_LID));
                        output.accept((ModItems.QUICK_BALL_LID));
                        output.accept((ModItems.DREAM_BALL_LID));
                        output.accept((ModItems.BEAST_BALL_LID));
                        output.accept((ModItems.MASTER_BALL_LID));
                        output.accept((ModItems.CHERISH_BALL_LID));

                        output.accept((ModItems.COATED_RED_BALL_LID));
                        output.accept((ModItems.COATED_YELLOW_BALL_LID));
                        output.accept((ModItems.COATED_GREEN_BALL_LID));
                        output.accept((ModItems.COATED_BLUE_BALL_LID));
                        output.accept((ModItems.COATED_PINK_BALL_LID));
                        output.accept((ModItems.COATED_BLACK_BALL_LID));
                        output.accept((ModItems.COATED_WHITE_BALL_LID));
                        output.accept((ModItems.LIGHT_COATED_BLUE_BALL_LID));
                        output.accept((ModItems.DENSE_COATED_BLACK_BALL_LID));
                        output.accept((ModItems.ANCIENT_GREAT_BALL_LID));
                        output.accept((ModItems.ANCIENT_ULTRA_BALL_LID));
                        output.accept((ModItems.ANCIENT_FEATHER_BALL_LID));
                        output.accept((ModItems.ANCIENT_WING_BALL_LID));
                        output.accept((ModItems.ANCIENT_JET_BALL_LID));
                        output.accept((ModItems.ANCIENT_HEAVY_BALL_LID));
                        output.accept((ModItems.ANCIENT_LEADEN_BALL_LID));
                        output.accept((ModItems.ANCIENT_GIGATON_BALL_LID));
                        output.accept((ModItems.ANCIENT_ORIGIN_BALL_LID));

                        output.accept((ModItems.APRICORN_BALL_LID));
                        output.accept((ModItems.BLANK_BALL_LID));
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
