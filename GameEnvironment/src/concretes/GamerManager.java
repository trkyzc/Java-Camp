package concretes;

import abstracts.GamerService;
import abstracts.GamerValidationService;
import entities.Gamer;

public class GamerManager implements GamerService {
	
	GamerValidationService gamerValidationService;

	public GamerManager(GamerValidationService gamerValidationService) {
		super();
		this.gamerValidationService = gamerValidationService;
	}

	@Override
	public void register(Gamer gamer) {
		
		if(gamerValidationService.validate(gamer)) {
			
			System.out.println(gamer.getFirstName() + " adlý oyuncu baþarýyla kaydedildi.");
		}
		
		else {
			System.out.println("Validation Error!");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " adlý oyuncu baþarýyla güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " adlý oyuncu baþarýyla silindi.");
		
	}

}
