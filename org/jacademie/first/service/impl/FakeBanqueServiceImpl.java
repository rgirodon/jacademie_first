package org.jacademie.first.service.impl;

import org.jacademie.first.service.BanqueService;

public class FakeBanqueServiceImpl implements BanqueService {

	@Override
	public Double calculerFonds(Integer idBanque) {
		
		// fake implementation 
		
		return 100.0;
	}

}
