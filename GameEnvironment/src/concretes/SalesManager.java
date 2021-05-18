package concretes;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {

	


	@Override
	public void add(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " adl� oyun " + gamer.getFirstName() + " adl� oyuncunun hesab�na eklendi.");
		System.out.println(campaign.getName() + " uyguland�.");
		System.out.println(game.getPriceAfterDiscount() + " tl �dendi.");
		
	}

	@Override
	public void giveaGift(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " adl� oyun " + gamer.getFirstName() + " adl� oyuncunun hesab�na g�nderildi.");
		System.out.println(campaign.getName() + " uyguland�.");
		System.out.println(game.getPriceAfterDiscount() + " tl �dendi.");
	}

	@Override
	public void refund(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " adl� oyun " + gamer.getFirstName() + " adl� oyuncu taraf�ndan iade edildi.");
		System.out.println(game.getPriceAfterDiscount() + " tl " + gamer.getFirstName() + " adl� oyuncunun hesab�na iade edildi.");
	}

	


}
