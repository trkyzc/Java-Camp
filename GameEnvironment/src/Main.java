import java.util.Date;

import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.GamerValidationManager;
import concretes.SalesManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game=new Game(1,"Fifa 09","Football",130,25);
		Gamer gamer=new Gamer(2, "Tarık", "Yazıcı", "trkyzc@hotmail.com", "12345", "45678912376", new Date(2000,11,5));
		Campaign campaign=new Campaign(3, "Bahar Kampanyası", 25);
		
		
		//GamerManager
		GamerManager gamerManager=new GamerManager(new GamerValidationManager());
		gamerManager.register(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
		System.out.println("*********************************");
		
		//GameManager
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		System.out.println("*********************************");
		
		
		
		//CampaignManager
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		System.out.println("*********************************");
		
		//SalesManager
		SalesManager salesManager=new SalesManager();
		salesManager.add(game, gamer, campaign);
		salesManager.giveaGift(game, gamer, campaign);
		salesManager.refund(game, gamer, campaign);
		
		
		
	}

}
