package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " başarıyla eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " başarıyla güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " başarıyla silindi.");
		
	}

}
