package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesService {
	
	void add(Game game,Gamer gamer,Campaign campaign);
	void giveaGift(Game game,Gamer gamer,Campaign campaign);
	void refund(Game game,Gamer gamer,Campaign campaign);
	

}
