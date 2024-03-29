package me.exitium.hardcoreseason.messagehandler;

import java.util.Map;

import static java.util.Map.entry;

public class EntityNames {
    Map<String, String> entities = Map.<String, String>ofEntries(
            entry("entity.minecraft.area_effect_cloud", "Area Effect Cloud"),
            entry("entity.minecraft.armor_stand", "Armor Stand"),
            entry("entity.minecraft.arrow", "Arrow"),
            entry("entity.minecraft.bat", "Bat"),
            entry("entity.minecraft.bee", "Bee"),
            entry("entity.minecraft.blaze", "Blaze"),
            entry("entity.minecraft.boat", "Boat"),
            entry("entity.minecraft.cat", "Cat"),
            entry("entity.minecraft.cave_spider", "Cave Spider"),
            entry("entity.minecraft.chicken", "Chicken"),
            entry("entity.minecraft.cow", "Cow"),
            entry("entity.minecraft.creeper", "Creeper"),
            entry("entity.minecraft.dolphin", "Dolphin"),
            entry("entity.minecraft.panda", "Panda"),
            entry("entity.minecraft.donkey", "Donkey"),
            entry("entity.minecraft.dragon_fireball", "Dragon Fireball"),
            entry("entity.minecraft.drowned", "Drowned"),
            entry("entity.minecraft.egg", "Egg"),
            entry("entity.minecraft.elder_guardian", "Elder Guardian"),
            entry("entity.minecraft.ender_crystal", "Ender Crystal"),
            entry("entity.minecraft.ender_dragon", "Ender Dragon"),
            entry("entity.minecraft.enderman", "Enderman"),
            entry("entity.minecraft.endermite", "Endermite"),
            entry("entity.minecraft.ender_pearl", "Ender Pearl"),
            entry("entity.minecraft.evocation_illager", "Evoker"),
            entry("entity.minecraft.evocation_fang", "Evoker Fang"),
            entry("entity.minecraft.eye_of_ender_signal", "Eye of Ender"),
            entry("entity.minecraft.falling_block", "Falling Block"),
            entry("entity.minecraft.fireball", "Fireball"),
            entry("entity.minecraft.fireworks_rocket", "Firework Rocket"),
            entry("entity.minecraft.fishing_hook", "Fishing Hook"),
            entry("entity.minecraft.fish.clownfish", "Clownfish"),
            entry("entity.minecraft.fox", "Fox"),
            entry("entity.minecraft.cod", "Cod"),
            entry("entity.minecraft.pufferfish", "Pufferfish"),
            entry("entity.minecraft.salmon", "Salmon"),
            entry("entity.minecraft.tropicalfish", "Tropical Fish"),
            entry("entity.minecraft.ghast", "Ghast"),
            entry("entity.minecraft.piglin_brute", "Piglin Brute"),
            entry("entity.minecraft.guardian", "Guardian"),
            entry("entity.minecraft.hoglin", "Hoglin"),
            entry("entity.minecraft.horse", "Horse"),
            entry("entity.minecraft.husk", "Husk"),
            entry("entity.minecraft.ravager", "Ravager"),
            entry("entity.minecraft.iron_golem", "Iron Golem"),
            entry("entity.minecraft.item", "Item"),
            entry("entity.minecraft.leash_knot", "Leash Knot"),
            entry("entity.minecraft.lightning_bolt", "Lightning Bolt"),
            entry("entity.minecraft.lingering_potion", "Lingering Potion"),
            entry("entity.minecraft.llama", "Llama"),
            entry("entity.minecraft.llama_spit", "Llama Spit"),
            entry("entity.minecraft.magma_cube", "Magma Cube"),
            entry("entity.minecraft.minecart", "Minecart"),
            entry("entity.minecraft.chest_minecart", "Minecart with Chest"),
            entry("entity.minecraft.command_block_minecart", "Minecart with Command Block"),
            entry("entity.minecraft.furnace_minecart", "Minecart with Furnace"),
            entry("entity.minecraft.hopper_minecart", "Minecart with Hopper"),
            entry("entity.minecraft.tnt_minecart", "Minecart with TNT"),
            entry("entity.minecraft.mule", "Mule"),
            entry("entity.minecraft.mooshroom", "Mooshroom"),
            entry("entity.minecraft.moving_block", "Moving Block"),
            entry("entity.minecraft.ocelot", "Ocelot"),
            entry("entity.minecraft.painting", "Painting"),
            entry("entity.minecraft.parrot", "Parrot"),
            entry("entity.minecraft.phantom", "Phantom"),
            entry("entity.minecraft.pig", "Pig"),
            entry("entity.minecraft.piglin", "Piglin"),
            entry("entity.minecraft.pillager", "Pillager"),
            entry("entity.minecraft.polar_bear", "Polar Bear"),
            entry("entity.minecraft.rabbit", "Rabbit"),
            entry("entity.minecraft.sheep", "Sheep"),
            entry("entity.minecraft.shulker", "Shulker"),
            entry("entity.minecraft.shulker_bullet", "Shulker Bullet"),
            entry("entity.minecraft.silverfish", "Silverfish"),
            entry("entity.minecraft.skeleton", "Skeleton"),
            entry("entity.minecraft.skeleton_horse", "Skeleton Horse"),
            entry("entity.minecraft.stray", "Stray"),
            entry("entity.minecraft.slime", "Slime"),
            entry("entity.minecraft.small_fireball", "Small Fireball"),
            entry("entity.minecraft.snowball", "Snowball"),
            entry("entity.minecraft.snow_golem", "Snow Golem"),
            entry("entity.minecraft.spider", "Spider"),
            entry("entity.minecraft.splash_potion", "Potion"),
            entry("entity.minecraft.squid", "Squid"),
            entry("entity.minecraft.strider", "Strider"),
            entry("entity.minecraft.tnt", "Block of TNT"),
            entry("entity.minecraft.thrown_trident", "Trident"),
            entry("entity.minecraft.tripod_camera", "Tripod Camera"),
            entry("entity.minecraft.turtle", "Turtle"),
            entry("entity.minecraft.unknown", "Unknown"),
            entry("entity.minecraft.vex", "Vex"),
            entry("entity.minecraft.villager_v2", "Villager"),
            entry("entity.minecraft.vindicator", "Vindicator"),
            entry("entity.minecraft.wandering_trader", "Wandering Trader"),
            entry("entity.minecraft.witch", "Witch"),
            entry("entity.minecraft.wither", "Wither"),
            entry("entity.minecraft.wither_skeleton", "Wither Skeleton"),
            entry("entity.minecraft.wither_skull", "Wither Skull"),
            entry("entity.minecraft.wither_skull_dangerous", "Wither Skull"),
            entry("entity.minecraft.wolf", "Wolf"),
            entry("entity.minecraft.xp_orb", "Experience Orb"),
            entry("entity.minecraft.xp_bottle", "Bottle o' Enchanting"),
            entry("entity.minecraft.zoglin", "Zoglin"),
            entry("entity.minecraft.zombie", "Zombie"),
            entry("entity.minecraft.zombie_horse", "Zombie Horse"),
            entry("entity.minecraft.zombie_pigman", "Zombified Piglin"),
            entry("entity.minecraft.zombie_villager", "Zombie Villager"),
            entry("entity.minecraft.zombie_villager_v2", "Zombie Villager")
    );

    public String getName(String key) {
        if (!entities.containsKey(key)) return "Unknown";
        return entities.get(key);
    }
}
