package de.flo56958.MineTinker.Data;

import de.flo56958.MineTinker.Main;
import de.flo56958.MineTinker.Modifiers.ModManager;
import de.flo56958.MineTinker.Modifiers.Types.ModifierType;
import de.flo56958.MineTinker.Utilities.ChatWriter;
import de.flo56958.MineTinker.Utilities.ItemGenerator;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ShapedRecipe;

public class CraftingRecipes {

    private static final ModManager modManager = Main.getModManager();

    public static void registerReinforcedModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Reinforced"), modManager.get(ModifierType.REINFORCED).getModItem()); //init recipe
            newRecipe.shape("OOO", "OOO", "OOO"); //makes recipe
            newRecipe.setIngredient('O', Material.OBSIDIAN); //set ingredients
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Reinforced-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerProtectingModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Protecting"), modManager.get(ModifierType.PROTECTING).getModItem()); //init recipe
            newRecipe.shape("DID", "IOI", "DID"); //makes recipe
            newRecipe.setIngredient('D', Material.DIAMOND);
            newRecipe.setIngredient('I', Material.IRON_INGOT);
            newRecipe.setIngredient('O', Material.OBSIDIAN); //set ingredients
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Protecting-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerHasteModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Haste"), modManager.get(ModifierType.HASTE).getModItem()); //init recipe
            newRecipe.shape("RRR", "RRR", "RRR"); //makes recipe
            newRecipe.setIngredient('R', Material.REDSTONE_BLOCK); //set ingredients
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Haste-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerSharpnessModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Sharpness"), modManager.get(ModifierType.SHARPNESS).getModItem()); //init recipe
            newRecipe.shape("QQQ", "QQQ", "QQQ"); //makes recipe
            newRecipe.setIngredient('Q', Material.QUARTZ_BLOCK); //set ingredients
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Sharpness-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerLuckModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Luck"), modManager.get(ModifierType.LUCK).getModItem()); //init recipe
            newRecipe.shape("LLL", "LLL", "LLL"); //makes recipe
            newRecipe.setIngredient('L', Material.LAPIS_BLOCK); //set ingredients
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Luck-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerGlowingModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Glowing"), modManager.get(ModifierType.GLOWING).getModItem()); //init recipe
            newRecipe.shape("GGG", "GEG", "GGG"); //makes recipe
            newRecipe.setIngredient('G', Material.GLOWSTONE_DUST); //set ingredients
            newRecipe.setIngredient('E', Material.ENDER_EYE);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Glowing-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerAutoSmeltModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Autosmelt"), modManager.get(ModifierType.AUTO_SMELT).getModItem()); //init recipe
            newRecipe.shape("CCC", "CFC", "CCC"); //makes recipe
            newRecipe.setIngredient('C', Material.FURNACE); //set ingredients
            newRecipe.setIngredient('F', Material.BLAZE_ROD);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Auto-Smelt-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerElevatorMotor() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Elevator_Motor"), ItemGenerator.itemEnchanter(Material.HOPPER, ChatColor.GRAY + Main.getPlugin().getConfig().getString("Elevator.name"), 1, Enchantment.FIRE_ASPECT, 1)); //init recipe
            newRecipe.shape("RRR", "RHR", "RRR"); //makes recipe
            newRecipe.setIngredient('R', Material.REDSTONE); //set ingredients
            newRecipe.setIngredient('H', Material.HOPPER);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Elevator-Motor!"); //executes if the recipe could not initialize
        }
    }

    public static void registerShulkingModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Shulking"), modManager.get(ModifierType.SHULKING).getModItem()); //init recipe
            newRecipe.shape(" S ", " C ", " S "); //makes recipe
            newRecipe.setIngredient('S', Material.SHULKER_SHELL); //set ingredients
            newRecipe.setIngredient('C', Material.CHORUS_FRUIT);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Shulking-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerEnderModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Ender"), modManager.get(ModifierType.ENDER).getModItem()); //init recipe
            newRecipe.shape("PPP", "PEP", "PPP"); //makes recipe
            newRecipe.setIngredient('P', Material.ENDER_PEARL); //set ingredients
            newRecipe.setIngredient('E', Material.ENDER_EYE);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Ender-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerBuildersWands() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Builderswand_Wood"), ItemGenerator.buildersWandCreator(Material.WOODEN_SHOVEL, Main.getPlugin().getConfig().getString("Builderswands.name_wood"), 1)); //init recipe
            newRecipe.shape("  W", " S ", "S  "); //makes recipe
            newRecipe.setIngredient('S', Material.STICK); //set ingredients
            newRecipe.setIngredient('W', Material.LEGACY_WOOD);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Wooden Builderswand!"); //executes if the recipe could not initialize
        }
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Builderswand_Stone"), ItemGenerator.buildersWandCreator(Material.STONE_SHOVEL, Main.getPlugin().getConfig().getString("Builderswands.name_stone"), 1)); //init recipe
            newRecipe.shape("  C", " S ", "S  "); //makes recipe
            newRecipe.setIngredient('S', Material.STICK); //set ingredients
            newRecipe.setIngredient('C', Material.COBBLESTONE);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Stone Builderswand!"); //executes if the recipe could not initialize
        }
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Builderswand_Iron"), ItemGenerator.buildersWandCreator(Material.IRON_SHOVEL, Main.getPlugin().getConfig().getString("Builderswands.name_iron"), 1)); //init recipe
            newRecipe.shape("  I", " S ", "S  "); //makes recipe
            newRecipe.setIngredient('S', Material.STICK); //set ingredients
            newRecipe.setIngredient('I', Material.IRON_INGOT);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Iron Builderswand!"); //executes if the recipe could not initialize
        }
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Builderswand_Gold"), ItemGenerator.buildersWandCreator(Material.GOLDEN_SHOVEL, Main.getPlugin().getConfig().getString("Builderswands.name_gold"), 1)); //init recipe
            newRecipe.shape("  G", " S ", "S  "); //makes recipe
            newRecipe.setIngredient('S', Material.STICK); //set ingredients
            newRecipe.setIngredient('G', Material.GOLD_INGOT);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Golden Builderswand!"); //executes if the recipe could not initialize
        }
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Builderswand_Diamond"), ItemGenerator.buildersWandCreator(Material.DIAMOND_SHOVEL, Main.getPlugin().getConfig().getString("Builderswands.name_diamond"), 1)); //init recipe
            newRecipe.shape("  D", " S ", "S  "); //makes recipe
            newRecipe.setIngredient('S', Material.STICK); //set ingredients
            newRecipe.setIngredient('D', Material.DIAMOND);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Diamond Builderswand!"); //executes if the recipe could not initialize
        }
    }

    public static void registerTimberModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Timber"), modManager.get(ModifierType.TIMBER).getModItem()); //init recipe
            newRecipe.shape("LLL", "LEL", "LLL"); //makes recipe
            newRecipe.setIngredient('L', Material.OAK_WOOD); //set ingredients
            newRecipe.setIngredient('E', Material.EMERALD);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Timber-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerWebbedModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Webbed"), modManager.get(ModifierType.WEBBED).getModItem()); //init recipe
            newRecipe.shape("WWW", "WWW", "WWW"); //makes recipe
            newRecipe.setIngredient('W', Material.COBWEB); //set ingredients
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Webbed-Modifier!"); //executes if the recipe could not initialize
        }
    }

    public static void registerDirectingModifier() {
        try {
            ShapedRecipe newRecipe = new ShapedRecipe(new NamespacedKey(Main.getPlugin(), "Modifier_Directing"), modManager.get(ModifierType.DIRECTING).getModItem()); //init recipe
            newRecipe.shape("ECE", "CIC", "ECE"); //makes recipe
            newRecipe.setIngredient('C', Material.COMPASS); //set ingredients
            newRecipe.setIngredient('E', Material.ENDER_PEARL);
            newRecipe.setIngredient('I', Material.IRON_BLOCK);
            Main.getPlugin().getServer().addRecipe(newRecipe); //adds recipe
        } catch (Exception e) {
            ChatWriter.log(true, "Could not register recipe for the Directing-Modifier!"); //executes if the recipe could not initialize
        }
    }
}
