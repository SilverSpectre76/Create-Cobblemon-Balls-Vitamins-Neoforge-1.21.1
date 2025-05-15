package net.xkcinnay.createmonballsoverhaul.item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xkcinnay.createmonballsoverhaul.CreateCobblemonBallsOverhaul;
import net.xkcinnay.createmonballsoverhaul.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateCobblemonBallsOverhaul.MOD_ID);

    public static final DeferredItem<Item> HALF_RED_APRICORN = ITEMS.register("half_red_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_YELLOW_APRICORN = ITEMS.register("half_yellow_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_GREEN_APRICORN = ITEMS.register("half_green_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_BLUE_APRICORN = ITEMS.register("half_blue_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_PINK_APRICORN = ITEMS.register("half_pink_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_BLACK_APRICORN = ITEMS.register("half_black_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HALF_WHITE_APRICORN = ITEMS.register("half_white_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_APRICORN_BITS = ITEMS.register("red_apricorn_bits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_APRICORN_BITS = ITEMS.register("yellow_apricorn_bits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_APRICORN_BITS = ITEMS.register("green_apricorn_bits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_APRICORN_BITS = ITEMS.register("blue_apricorn_bits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINK_APRICORN_BITS = ITEMS.register("pink_apricorn_bits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_APRICORN_BITS = ITEMS.register("black_apricorn_bits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_APRICORN_BITS = ITEMS.register("white_apricorn_bits",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RED_BALL_LID = ITEMS.register("red_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_BALL_LID = ITEMS.register("yellow_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_BALL_LID = ITEMS.register("green_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_BALL_LID = ITEMS.register("blue_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINK_BALL_LID = ITEMS.register("pink_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_BALL_LID = ITEMS.register("black_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_BALL_LID = ITEMS.register("white_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_GREAT_BALL_LID = ITEMS.register("unfinished_great_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> GREAT_BALL_LID = ITEMS.register("great_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ULTRA_BALL_LID = ITEMS.register("unfinished_ultra_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ULTRA_BALL_LID = ITEMS.register("ultra_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_SAFARI_BALL_LID = ITEMS.register("unfinished_safari_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> SAFARI_BALL_LID = ITEMS.register("safari_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_FAST_BALL_LID = ITEMS.register("unfinished_fast_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> FAST_BALL_LID = ITEMS.register("fast_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LEVEL_BALL_LID = ITEMS.register("unfinished_level_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> LEVEL_BALL_LID = ITEMS.register("level_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LURE_BALL_LID = ITEMS.register("unfinished_lure_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> LURE_BALL_LID = ITEMS.register("lure_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_HEAVY_BALL_LID = ITEMS.register("unfinished_heavy_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> HEAVY_BALL_LID = ITEMS.register("heavy_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LOVE_BALL_LID = ITEMS.register("unfinished_love_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> LOVE_BALL_LID = ITEMS.register("love_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_FRIEND_BALL_LID = ITEMS.register("unfinished_friend_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> FRIEND_BALL_LID = ITEMS.register("friend_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_MOON_BALL_LID = ITEMS.register("unfinished_moon_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> MOON_BALL_LID = ITEMS.register("moon_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_SPORT_BALL_LID = ITEMS.register("unfinished_sport_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> SPORT_BALL_LID = ITEMS.register("sport_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_PARK_BALL_LID = ITEMS.register("unfinished_park_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> PARK_BALL_LID = ITEMS.register("park_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_NET_BALL_LID = ITEMS.register("unfinished_net_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> NET_BALL_LID = ITEMS.register("net_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_DIVE_BALL_LID = ITEMS.register("unfinished_dive_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> DIVE_BALL_LID = ITEMS.register("dive_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_NEST_BALL_LID = ITEMS.register("unfinished_nest_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> NEST_BALL_LID = ITEMS.register("nest_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_REPEAT_BALL_LID = ITEMS.register("unfinished_repeat_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> REPEAT_BALL_LID = ITEMS.register("repeat_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_TIMER_BALL_LID = ITEMS.register("unfinished_timer_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> TIMER_BALL_LID = ITEMS.register("timer_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LUXURY_BALL_LID = ITEMS.register("unfinished_luxury_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> LUXURY_BALL_LID = ITEMS.register("luxury_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_DUSK_BALL_LID = ITEMS.register("unfinished_dusk_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> DUSK_BALL_LID = ITEMS.register("dusk_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_HEAL_BALL_LID = ITEMS.register("unfinished_heal_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> HEAL_BALL_LID = ITEMS.register("heal_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_QUICK_BALL_LID = ITEMS.register("unfinished_quick_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> QUICK_BALL_LID = ITEMS.register("quick_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_DREAM_BALL_LID = ITEMS.register("unfinished_dream_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> DREAM_BALL_LID = ITEMS.register("dream_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_BEAST_BALL_LID = ITEMS.register("unfinished_beast_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> BEAST_BALL_LID = ITEMS.register("beast_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_MASTER_BALL_LID = ITEMS.register("unfinished_master_ball_lid",
            () -> new SequencedAssemblyItem(new SequencedAssemblyItem.Properties()));
    public static final DeferredItem<Item> MASTER_BALL_LID = ITEMS.register("master_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_CHERISH_BALL_LID = ITEMS.register("unfinished_cherish_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> CHERISH_BALL_LID = ITEMS.register("cherish_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COATED_RED_BALL_LID = ITEMS.register("coated_red_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COATED_YELLOW_BALL_LID = ITEMS.register("coated_yellow_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COATED_GREEN_BALL_LID = ITEMS.register("coated_green_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COATED_BLUE_BALL_LID = ITEMS.register("coated_blue_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COATED_PINK_BALL_LID = ITEMS.register("coated_pink_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COATED_BLACK_BALL_LID = ITEMS.register("coated_black_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COATED_WHITE_BALL_LID = ITEMS.register("coated_white_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIGHT_COATED_BLUE_BALL_LID = ITEMS.register("light_coated_blue_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DENSE_COATED_BLACK_BALL_LID = ITEMS.register("dense_coated_black_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_GREAT_BALL_LID = ITEMS.register("ancient_great_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_GREAT_BALL_LID = ITEMS.register("unfinished_ancient_great_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_ULTRA_BALL_LID = ITEMS.register("ancient_ultra_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_ULTRA_BALL_LID = ITEMS.register("unfinished_ancient_ultra_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_FEATHER_BALL_LID = ITEMS.register("ancient_feather_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_FEATHER_BALL_LID = ITEMS.register("unfinished_ancient_feather_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_WING_BALL_LID = ITEMS.register("ancient_wing_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_WING_BALL_LID = ITEMS.register("unfinished_ancient_wing_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_JET_BALL_LID = ITEMS.register("ancient_jet_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_JET_BALL_LID = ITEMS.register("unfinished_ancient_jet_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_HEAVY_BALL_LID = ITEMS.register("ancient_heavy_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_HEAVY_BALL_LID = ITEMS.register("unfinished_ancient_heavy_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_LEADEN_BALL_LID = ITEMS.register("ancient_leaden_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_LEADEN_BALL_LID = ITEMS.register("unfinished_ancient_leaden_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_GIGATON_BALL_LID = ITEMS.register("ancient_gigaton_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_GIGATON_BALL_LID = ITEMS.register("unfinished_ancient_gigaton_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_ORIGIN_BALL_LID = ITEMS.register("ancient_origin_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_ORIGIN_BALL_LID = ITEMS.register("unfinished_ancient_origin_ball_lid",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<Item> BLANK_BALL_LID = ITEMS.register("blank_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APRICORN_BALL_LID = ITEMS.register("apricorn_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APRICORN_PUNCH = ITEMS.register( "apricorn_punch",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBBER_STAMP_LID = ITEMS.register("rubber_stamp_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAMPED_COPPER_NUGGET_LID = ITEMS.register("stamped_copper_nugget_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAMPED_IRON_NUGGET_LID = ITEMS.register("stamped_iron_nugget_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAMPED_ZINC_NUGGET_LID = ITEMS.register("stamped_zinc_nugget_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAMPED_BRASS_NUGGET_LID = ITEMS.register("stamped_brass_nugget_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAMPED_STURDY_SHEET_LID = ITEMS.register("stamped_sturdy_sheet_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAMPED_STRIPPED_APRICORN_LOG_LID = ITEMS.register("stamped_stripped_apricorn_log_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUMBLESTONE_DUST = ITEMS.register("tumblestone_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SKY_TUMBLESTONE_DUST = ITEMS.register("sky_tumblestone_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_TUMBLESTONE_DUST = ITEMS.register("black_tumblestone_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_BALL_BASE = ITEMS.register( "copper_ball_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_BALL_MECHANISM = ITEMS.register("copper_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_COPPER_BALL_MECHANISM = ITEMS.register("unfinished_copper_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ANCIENT_BALL_MECHANISM = ITEMS.register("copper_ancient_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_COPPER_ANCIENT_BALL_MECHANISM = ITEMS.register("unfinished_copper_ancient_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> IRON_BALL_BASE = ITEMS.register( "iron_ball_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_BALL_MECHANISM = ITEMS.register("iron_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_IRON_BALL_MECHANISM = ITEMS.register("unfinished_iron_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ANCIENT_BALL_MECHANISM = ITEMS.register("iron_ancient_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_IRON_ANCIENT_BALL_MECHANISM = ITEMS.register("unfinished_iron_ancient_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_BALL_BASE = ITEMS.register( "brass_ball_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_BALL_MECHANISM = ITEMS.register("brass_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_BRASS_BALL_MECHANISM = ITEMS.register("unfinished_brass_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_ANCIENT_BALL_MECHANISM = ITEMS.register("brass_ancient_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_BRASS_ANCIENT_BALL_MECHANISM = ITEMS.register("unfinished_brass_ancient_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> STURDY_BALL_BASE = ITEMS.register( "sturdy_ball_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STURDY_BALL_MECHANISM = ITEMS.register("sturdy_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_STURDY_BALL_MECHANISM = ITEMS.register("unfinished_sturdy_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<Item> STURDY_ANCIENT_BALL_MECHANISM = ITEMS.register("sturdy_ancient_ball_mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_STURDY_ANCIENT_BALL_MECHANISM = ITEMS.register("unfinished_sturdy_ancient_ball_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_POKE_BALL= ITEMS.register("unfinished_poke_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_CITRINE_BALL= ITEMS.register("unfinished_citrine_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_VERDANT_BALL= ITEMS.register("unfinished_verdant_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_AZURE_BALL= ITEMS.register("unfinished_azure_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ROSEATE_BALL= ITEMS.register("unfinished_roseate_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_SLATE_BALL= ITEMS.register("unfinished_slate_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_PREMIER_BALL= ITEMS.register("unfinished_premier_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_GREAT_BALL= ITEMS.register("unfinished_great_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ULTRA_BALL= ITEMS.register("unfinished_ultra_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_SAFARI_BALL= ITEMS.register("unfinished_safari_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_FAST_BALL= ITEMS.register("unfinished_fast_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LEVEL_BALL= ITEMS.register("unfinished_level_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LURE_BALL= ITEMS.register("unfinished_lure_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_HEAVY_BALL= ITEMS.register("unfinished_heavy_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LOVE_BALL= ITEMS.register("unfinished_love_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_FRIEND_BALL= ITEMS.register("unfinished_friend_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_MOON_BALL= ITEMS.register("unfinished_moon_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_SPORT_BALL= ITEMS.register("unfinished_sport_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_PARK_BALL= ITEMS.register("unfinished_park_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_NET_BALL= ITEMS.register("unfinished_net_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_DIVE_BALL= ITEMS.register("unfinished_dive_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_NEST_BALL= ITEMS.register("unfinished_nest_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_REPEAT_BALL= ITEMS.register("unfinished_repeat_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_TIMER_BALL= ITEMS.register("unfinished_timer_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_LUXURY_BALL= ITEMS.register("unfinished_luxury_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_DUSK_BALL= ITEMS.register("unfinished_dusk_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_HEAL_BALL= ITEMS.register("unfinished_heal_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_QUICK_BALL= ITEMS.register("unfinished_quick_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_DREAM_BALL= ITEMS.register("unfinished_dream_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_BEAST_BALL= ITEMS.register("unfinished_beast_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_MASTER_BALL= ITEMS.register("unfinished_master_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_CHERISH_BALL= ITEMS.register("unfinished_cherish_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_POKE_BALL= ITEMS.register("unfinished_ancient_poke_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_CITRINE_BALL= ITEMS.register("unfinished_ancient_citrine_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_VERDANT_BALL= ITEMS.register("unfinished_ancient_verdant_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_AZURE_BALL= ITEMS.register("unfinished_ancient_azure_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_ROSEATE_BALL= ITEMS.register("unfinished_ancient_roseate_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_SLATE_BALL= ITEMS.register("unfinished_ancient_slate_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_IVORY_BALL= ITEMS.register("unfinished_ancient_ivory_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_GREAT_BALL= ITEMS.register("unfinished_ancient_great_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_ULTRA_BALL= ITEMS.register("unfinished_ancient_ultra_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_FEATHER_BALL= ITEMS.register("unfinished_ancient_feather_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_WING_BALL= ITEMS.register("unfinished_ancient_wing_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_JET_BALL= ITEMS.register("unfinished_ancient_jet_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_HEAVY_BALL= ITEMS.register("unfinished_ancient_heavy_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_LEADEN_BALL= ITEMS.register("unfinished_ancient_leaden_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_GIGATON_BALL= ITEMS.register("unfinished_ancient_gigaton_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final DeferredItem<SequencedAssemblyItem> UNFINISHED_ANCIENT_ORIGIN_BALL= ITEMS.register("unfinished_ancient_origin_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
