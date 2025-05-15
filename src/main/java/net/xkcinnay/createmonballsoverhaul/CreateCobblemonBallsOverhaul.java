package net.xkcinnay.createmonballsoverhaul;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.xkcinnay.createmonballsoverhaul.block.ModBlocks;
import net.xkcinnay.createmonballsoverhaul.fluid.BaseFluidType;
import net.xkcinnay.createmonballsoverhaul.fluid.ModFluids;
import net.xkcinnay.createmonballsoverhaul.fluid.ModFluidTypes;
import net.xkcinnay.createmonballsoverhaul.item.ModCreativeModeTabs;
import net.xkcinnay.createmonballsoverhaul.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateCobblemonBallsOverhaul.MOD_ID)
public class CreateCobblemonBallsOverhaul {
    public static final String MOD_ID = "createmonballsoverhaul";
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateCobblemonBallsOverhaul(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_STANDARD_TUMBLESTONE_COATING.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_STANDARD_TUMBLESTONE_COATING.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_LIGHT_TUMBLESTONE_COATING.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_LIGHT_TUMBLESTONE_COATING.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_DENSE_TUMBLESTONE_COATING.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_DENSE_TUMBLESTONE_COATING.get(), RenderType.translucent());
            });
        }

        @SubscribeEvent
        public static void onClientExtensions(RegisterClientExtensionsEvent event) {
            event.registerFluidType(((BaseFluidType) ModFluidTypes.STANDARD_TUMBLESTONE_COATING_FLUID_TYPE.get()).getClientFluidTypeExtensions(),
                    ModFluidTypes.STANDARD_TUMBLESTONE_COATING_FLUID_TYPE.get());
            event.registerFluidType(((BaseFluidType) ModFluidTypes.LIGHT_TUMBLESTONE_COATING_FLUID_TYPE.get()).getClientFluidTypeExtensions(),
                    ModFluidTypes.LIGHT_TUMBLESTONE_COATING_FLUID_TYPE.get());
            event.registerFluidType(((BaseFluidType) ModFluidTypes.DENSE_TUMBLESTONE_COATING_FLUID_TYPE.get()).getClientFluidTypeExtensions(),
                    ModFluidTypes.DENSE_TUMBLESTONE_COATING_FLUID_TYPE.get());
        }
    }
}
