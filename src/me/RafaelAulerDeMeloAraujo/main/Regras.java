package me.RafaelAulerDeMeloAraujo.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Regras implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
			sender.sendMessage("�a\n�c�l            REGRAS \n \n�c1. �7N�o utilize nenhum tipo Cheat ou Trapa�a.\n�c2. �7N�o fa�a ofensas a equipe ou a jogadores.\n�c3. �7N�o abuse de bug's, reporte a equipe. \n�c4. �7N�o divulgue outros servidores.\n�c5. �7N�o tenha nenhum tipo de Trapa�a em seu computador.\n�c6. �7N�o ofenda o servidor.\n�c7. �7N�o amea�e o servidor, equipe e jogadores.\n�c8. �7Nao pe�a cargos.\n�c9. �7N�o forje nenhum tipo de Trapa�a.\n�c10. �7Evite spam.\n�c11. �7Nao e permitido 3x1 (Exceto na Arena normal)\n \n�cN�o obedecer essas regras pode te levar a ter puni��es em nossa network.");
            return true;
	}

}
