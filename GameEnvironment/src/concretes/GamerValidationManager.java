package concretes;

import abstracts.GamerValidationService;
import entities.Gamer;



public class GamerValidationManager implements GamerValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		
		if(gamer.getFirstName().length()>1 && 
				gamer.getLastName().length()>1 && 
				gamer.getNationalityId().length()==11 && 
				!gamer.getNationalityId().startsWith("0")) {
			
			
			return true;
		}
		
		else {
			return false;
		}
			
		
	}

}
