package concretes;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {

	


	@Override
	public void add(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " adlý oyun " + gamer.getFirstName() + " adlý oyuncunun hesabýna eklendi.");
		System.out.println(campaign.getName() + " uygulandý.");
		System.out.println(game.getPriceAfterDiscount() + " tl ödendi.");
		
	}

	@Override
	public void giveaGift(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " adlý oyun " + gamer.getFirstName() + " adlý oyuncunun hesabýna gönderildi.");
		System.out.println(campaign.getName() + " uygulandý.");
		System.out.println(game.getPriceAfterDiscount() + " tl ödendi.");
	}

	@Override
	public void refund(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " adlý oyun " + gamer.getFirstName() + " adlý oyuncu tarafýndan iade edildi.");
		System.out.println(game.getPriceAfterDiscount() + " tl " + gamer.getFirstName() + " adlý oyuncunun hesabýna iade edildi.");
	}

	


}
