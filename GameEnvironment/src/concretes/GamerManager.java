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
			
			System.out.println(gamer.getFirstName() + " adl� oyuncu ba�ar�yla kaydedildi.");
		}
		
		else {
			System.out.println("Validation Error!");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " adl� oyuncu ba�ar�yla g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " adl� oyuncu ba�ar�yla silindi.");
		
	}

}
