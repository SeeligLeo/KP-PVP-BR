/*    */ package me.RafaelAulerDeMeloAraujo.SpecialAbility;
/*    */ 
/*    */ import me.RafaelAulerDeMeloAraujo.main.Main;

import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;

/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class GladCMD implements org.bukkit.command.CommandExecutor
/*    */ {
/*    */   private Main main;
/*    */   static Main plugin;
/*    */   
/*    */   public GladCMD(Main main)
/*    */   {
/* 20 */     this.main = main;
/* 21 */     plugin = main;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean onCommand(org.bukkit.command.CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 27 */     Player p = (Player)sender;
/*    */     
/* 29 */     if (cmd.getName().equalsIgnoreCase("gladiator"))
/*    */     {
/* 31 */       if (!Join.game.contains(p.getName()))
/*    */       {
/* 33 */         p.sendMessage(String.valueOf(this.main.getConfig().getString("Prefix").replace("&", "�")) + " �eYou are not in kitpvp to do choose this kit!");
/* 34 */         return true;
/*    */       }
/* 36 */       if (!p.hasPermission("kitpvp.kit.gladiator")) {
/* 37 */         p.sendMessage(String.valueOf(this.main.getConfig().getString("Prefix").replace("&", "�")) + this.main.getConfig().getString("Permission").replace("&", "�").replaceAll("%permisson%", commandLabel));
/* 38 */         p.playSound(p.getLocation(), Sound.valueOf(this.main.getConfig().getString("Sound.NoPermissionMessage")), 1.0F, 1.0F);
/* 39 */         return true;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/* 44 */       if (Habilidade.ContainsAbility(p)) {
/* 45 */         p.sendMessage(String.valueOf(this.main.getConfig().getString("Prefix").replace("&", "�")) + this.main.getConfig().getString("Message.KitUse").replace("&", "�"));
/* 46 */         p.playSound(p.getLocation(), Sound.valueOf(this.main.getConfig().getString("Sound.KitUse")), 1.0F, 1.0F);
/* 47 */         return true;
/*    */       }
/* 49 */       if (!Join.game.contains(p.getName()))
/*    */       {
/* 51 */         p.sendMessage(String.valueOf(this.main.getConfig().getString("Prefix").replace("&", "�")) + " §eYou are not in kitpvp to do choose this kit!");
/* 52 */         return true;
/*    */       }
if (Main.kits.getBoolean("GladiatorDisabled")) {
	p.sendMessage(API.NomeServer + ChatColor.RED + "The Gladiator kit is disabled, sorry");
	return true;
}
/* 54 */       p.getInventory().clear();
/* 55 */       ItemStack dima = new ItemStack(Material.STONE_SWORD);
/* 56 */       ItemMeta souperaa = dima.getItemMeta();
/* 57 */       souperaa.setDisplayName("�cEspada");
/* 58 */       dima.setItemMeta(souperaa);
/* 59 */       ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 60 */       ItemMeta sopas = sopa.getItemMeta();
/* 61 */       sopas.setDisplayName("�6Sopa");
/* 62 */       sopa.setItemMeta(sopas);
/* 63 */       ItemStack especial = new ItemStack(Material.IRON_FENCE);
/* 64 */       ItemMeta especial2 = especial.getItemMeta();
/* 65 */       especial2.setDisplayName("�bArena");
/* 66 */       especial.setItemMeta(especial2);
/*    */       
/*    */ 
/*    */       
/* 82 */       p.sendMessage(String.valueOf(this.main.getConfig().getString("Prefix").replace("&", "�")) + this.main.getConfig().getString("Message.Kit").replaceAll("%kit%", "Gladiator").replace("&", "�"));
/*    */       
/* 84 */       p.getInventory().addItem(new ItemStack[] { dima });
/* 85 */       p.getInventory().addItem(new ItemStack[] { especial });
/*    */       
/*    */ 
/* 88 */       Habilidade.setAbility(p, "Gladiator");
RTP.TeleportArenaRandom(p);
/* 89 */       for (int i = 0; i <= 34; i++) {
/* 90 */         p.getInventory().addItem(new ItemStack[] { sopa });
/* 91 */         me.RafaelAulerDeMeloAraujo.TitleAPI.TitleAPI.sendTitle(p, Integer.valueOf(20), Integer.valueOf(60), Integer.valueOf(20), this.main.getConfig().getString("Title.KitTitle"), this.main.getConfig().getString("Title.KitSubTitle").replaceAll("%kit%", "Gladiator"));
/*    */       }
Main.give(p);
/*    */     }
/*    */     
/* 96 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\Desktop\video\Minhas Coisas do Desktop\KP-PVPvB12 (1).jar!\me\RafaelAulerDeMeloAraujo\SpecialAbility\GladCMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
