package com.peaches.epicskyblock;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;

public class Missions implements Listener {

    public Missions() {
        getInstance = this;
    }

    public static Missions getInstance;
    public ArrayList<ItemStack> missions1 = new ArrayList<>();
    public ArrayList<ItemStack> missions2 = new ArrayList<>();
    public ArrayList<ItemStack> missions3 = new ArrayList<>();
    public HashMap<ItemStack, Integer> missions = new HashMap<>();

    public void put() {

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Harvest 5000 Sugar Cane");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "$50,000");
        missions1.add(EpicSkyBlock.getSkyblock.makeItem(Material.SUGAR_CANE, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.SUGAR_CANE, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer", lore), 5000);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Mine 1000 Ores");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "1 Island Crystal");
        missions1.add(EpicSkyBlock.getSkyblock.makeItem(Material.COAL_ORE, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.COAL_ORE, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner", lore), 1000);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Get 50 Kills");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "1 Island Crystal");
        missions2.add(EpicSkyBlock.getSkyblock.makeItem(Material.DIAMOND_SWORD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Soldier", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.DIAMOND_SWORD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Soldier", lore), 50);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Kill 1000 Mobs");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "1 Island Crystal");
        missions2.add(EpicSkyBlock.getSkyblock.makeItem(Material.DIAMOND_SWORD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Mob Hunter", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.DIAMOND_SWORD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Mob Hunter", lore), 1000);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Win 30 Duels");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "3 Island Crystal");
        missions2.add(EpicSkyBlock.getSkyblock.makeItem(Material.DIAMOND_SWORD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Dueler", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.DIAMOND_SWORD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Dueler", lore), 50);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Gather 10,000 XP");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "5 Island Crystals");
        missions3.add(EpicSkyBlock.getSkyblock.makeItem(Material.EXP_BOTTLE, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Treasure Hunter", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.EXP_BOTTLE, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Treasure Hunter", lore), 10000);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Enchant 100 Items");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "3 Island Crystals");
        missions3.add(EpicSkyBlock.getSkyblock.makeItem(Material.ENCHANTED_BOOK, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Enchantress", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.ENCHANTED_BOOK, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Enchantress", lore), 100);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Catch 500 Fish");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "5 Island Crystals");
        missions3.add(EpicSkyBlock.getSkyblock.makeItem(Material.FISHING_ROD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.FISHING_ROD, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman", lore), 500);

        lore.clear();
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Requirements:");
        lore.add(ChatColor.YELLOW + "Win a Koth");
        lore.add("");
        lore.add(ChatColor.RED + "" + ChatColor.BOLD + "Rewards:");
        lore.add(ChatColor.YELLOW + "5 Island Crystals");
        missions3.add(EpicSkyBlock.getSkyblock.makeItem(Material.ENDER_PORTAL_FRAME, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "KoTH", lore));
        missions.put(EpicSkyBlock.getSkyblock.makeItem(Material.ENDER_PORTAL_FRAME, 1, 0, ChatColor.YELLOW + "" + ChatColor.BOLD + "KoTH", lore), 1);
    }


    @EventHandler
    public void onentitykill(EntityDeathEvent e) {
        if (e.getEntity().getKiller() != null) {
            if (User.getbyPlayer(e.getEntity().getKiller()) == null) {
                User.users.add(new User(e.getEntity().getKiller().getName()));
            }
            User u = User.getbyPlayer(e.getEntity().getKiller());
            if (u.getIsland() != null) {
                Island island = u.getIsland();
                if (island.getMission2() == 1) {
                    if (island.getMission2Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions2.get(island.getMission2()))) {
                        island.setMission2Data(island.getMission2Data() + 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onkill(PlayerDeathEvent e) {
        if (e.getEntity().getKiller() != null) {
            if (User.getbyPlayer(e.getEntity().getKiller()) == null) {
                User.users.add(new User(e.getEntity().getKiller().getName()));
            }
            User u = User.getbyPlayer(e.getEntity().getKiller());
            if (u.getIsland() != null) {
                Island island = u.getIsland();
                if (island.getMission2() == 0) {
                    if (island.getMission2Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions2.get(island.getMission2()))) {
                        island.setMission2Data(island.getMission2Data() + 1);
                    }
                }
            }
        }
    }


    @EventHandler
    public void onxp(PlayerExpChangeEvent e) {
        if (User.getbyPlayer(e.getPlayer()) == null) {
            User.users.add(new User(e.getPlayer().getName()));
        }
        User u = User.getbyPlayer(e.getPlayer());
        if (u.getIsland() != null) {
            Island island = u.getIsland();
            if (island.getMission3() == 0) {
                if (island.getMission3Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions3.get(island.getMission3()))) {
                    island.setMission3Data(island.getMission3Data() + e.getAmount());
                }
            }
        }
    }

    @EventHandler
    public void onfish(PlayerFishEvent e) {
        if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
            if (User.getbyPlayer(e.getPlayer()) == null) {
                User.users.add(new User(e.getPlayer().getName()));
            }
            User u = User.getbyPlayer(e.getPlayer());
            if (u.getIsland() != null) {
                Island island = u.getIsland();
                if (island.getMission3() == 2) {
                    if (island.getMission3Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions3.get(island.getMission3()))) {
                        island.setMission3Data(island.getMission3Data() + 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onbreak(BlockBreakEvent e) {
        if (User.getbyPlayer(e.getPlayer()) == null) {
            User.users.add(new User(e.getPlayer().getName()));
        }
        User u = User.getbyPlayer(e.getPlayer());
        if (u.getIsland() != null) {
            Island island = u.getIsland();
            if (island.getMission1() == 0) {
                if (e.getBlock().getType().equals(Material.SUGAR_CANE_BLOCK)) {
                    if (island.getMission1Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions1.get(island.getMission1()))) {
                        island.setMission1Data(island.getMission1Data() + 1);
                    }
                }
            }
            if (island.getMission1() == 1) {
                if (e.getBlock().getType().name().endsWith("ORE")) {
                    if (island.getMission1Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions1.get(island.getMission1()))) {
                        island.setMission1Data(island.getMission1Data() + 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onenchant(EnchantItemEvent e) {
        if (User.getbyPlayer(e.getEnchanter()) == null) {
            User.users.add(new User(e.getEnchanter().getName()));
        }
        User u = User.getbyPlayer(e.getEnchanter());
        if (u.getIsland() != null) {
            Island island = u.getIsland();
            if (island.getMission3() == 1) {
                if (island.getMission3Data() <= Missions.getInstance.missions.get(Missions.getInstance.missions3.get(island.getMission3()))) {
                    island.setMission3Data(island.getMission3Data() + 1);
                }
            }
        }
    }

}
