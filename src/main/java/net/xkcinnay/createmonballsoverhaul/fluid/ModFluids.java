package net.xkcinnay.createmonballsoverhaul.fluid;

import net.minecraft.world.level.material.MapColor;
import net.xkcinnay.createmonballsoverhaul.CreateCobblemonBallsOverhaul;
import net.xkcinnay.createmonballsoverhaul.block.ModBlocks;
import net.xkcinnay.createmonballsoverhaul.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, CreateCobblemonBallsOverhaul.MOD_ID);

    //Standard Tumblestone Coating register

    public static final Supplier<FlowingFluid> SOURCE_STANDARD_TUMBLESTONE_COATING = FLUIDS.register("source_standard_tumblestone_coating",
            () -> new BaseFlowingFluid.Source(ModFluids.STANDARD_TUMBLESTONE_COATING_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_STANDARD_TUMBLESTONE_COATING = FLUIDS.register("flowing_standard_tumblestone_coating",
            () -> new BaseFlowingFluid.Flowing(ModFluids.STANDARD_TUMBLESTONE_COATING_PROPERTIES));

    public static final DeferredBlock<LiquidBlock> STANDARD_TUMBLESTONE_COATING_BLOCK = ModBlocks.BLOCKS.register("standard_tumblestone_coating_block",
            () -> new LiquidBlock(ModFluids.SOURCE_STANDARD_TUMBLESTONE_COATING.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable().mapColor(MapColor.COLOR_ORANGE)));
    public static final DeferredItem<Item> STANDARD_TUMBLESTONE_COATING_BUCKET = ModItems.ITEMS.registerItem("standard_tumblestone_coating_bucket",
            properties -> new BucketItem(ModFluids.SOURCE_STANDARD_TUMBLESTONE_COATING.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final BaseFlowingFluid.Properties STANDARD_TUMBLESTONE_COATING_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.STANDARD_TUMBLESTONE_COATING_FLUID_TYPE, SOURCE_STANDARD_TUMBLESTONE_COATING, FLOWING_STANDARD_TUMBLESTONE_COATING)
            .slopeFindDistance(3).levelDecreasePerBlock(2).tickRate(25)
            .block(ModFluids.STANDARD_TUMBLESTONE_COATING_BLOCK).bucket(ModFluids.STANDARD_TUMBLESTONE_COATING_BUCKET);

    //Light Tumblestone Coating register

    public static final Supplier<FlowingFluid> SOURCE_LIGHT_TUMBLESTONE_COATING = FLUIDS.register("source_light_tumblestone_coating",
            () -> new BaseFlowingFluid.Source(ModFluids.LIGHT_TUMBLESTONE_COATING_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_LIGHT_TUMBLESTONE_COATING = FLUIDS.register("flowing_light_tumblestone_coating",
            () -> new BaseFlowingFluid.Flowing(ModFluids.LIGHT_TUMBLESTONE_COATING_PROPERTIES));

    public static final DeferredBlock<LiquidBlock> LIGHT_TUMBLESTONE_COATING_BLOCK = ModBlocks.BLOCKS.register("light_tumblestone_coating_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LIGHT_TUMBLESTONE_COATING.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredItem<Item> LIGHT_TUMBLESTONE_COATING_BUCKET = ModItems.ITEMS.registerItem("light_tumblestone_coating_bucket",
            properties -> new BucketItem(ModFluids.SOURCE_LIGHT_TUMBLESTONE_COATING.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final BaseFlowingFluid.Properties LIGHT_TUMBLESTONE_COATING_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.LIGHT_TUMBLESTONE_COATING_FLUID_TYPE, SOURCE_LIGHT_TUMBLESTONE_COATING, FLOWING_LIGHT_TUMBLESTONE_COATING)
            .slopeFindDistance(3).levelDecreasePerBlock(2).tickRate(25)
            .block(ModFluids.LIGHT_TUMBLESTONE_COATING_BLOCK).bucket(ModFluids.LIGHT_TUMBLESTONE_COATING_BUCKET);

    //Dense Tumblestone Coating register

    public static final Supplier<FlowingFluid> SOURCE_DENSE_TUMBLESTONE_COATING = FLUIDS.register("source_dense_tumblestone_coating",
            () -> new BaseFlowingFluid.Source(ModFluids.DENSE_TUMBLESTONE_COATING_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_DENSE_TUMBLESTONE_COATING = FLUIDS.register("flowing_dense_tumblestone_coating",
            () -> new BaseFlowingFluid.Flowing(ModFluids.DENSE_TUMBLESTONE_COATING_PROPERTIES));

    public static final DeferredBlock<LiquidBlock> DENSE_TUMBLESTONE_COATING_BLOCK = ModBlocks.BLOCKS.register("dense_tumblestone_coating_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DENSE_TUMBLESTONE_COATING.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable().mapColor(MapColor.COLOR_GRAY)));
    public static final DeferredItem<Item> DENSE_TUMBLESTONE_COATING_BUCKET = ModItems.ITEMS.registerItem("dense_tumblestone_coating_bucket",
            properties -> new BucketItem(ModFluids.SOURCE_DENSE_TUMBLESTONE_COATING.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final BaseFlowingFluid.Properties DENSE_TUMBLESTONE_COATING_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.DENSE_TUMBLESTONE_COATING_FLUID_TYPE, SOURCE_DENSE_TUMBLESTONE_COATING, FLOWING_DENSE_TUMBLESTONE_COATING)
            .slopeFindDistance(3).levelDecreasePerBlock(2).tickRate(25)
            .block(ModFluids.DENSE_TUMBLESTONE_COATING_BLOCK).bucket(ModFluids.DENSE_TUMBLESTONE_COATING_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}