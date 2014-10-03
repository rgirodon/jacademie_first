package org.jacademie.first.test;

import org.jacademie.first.service.BanqueService;
import org.jacademie.first.service.ServiceFactory;

public class TestBanqueService {

	public static void main(String[] args) {
		
		BanqueService banqueService = ServiceFactory.getBanqueService();
		
		System.out.println(banqueService.calculerFonds(1));
	}

}
