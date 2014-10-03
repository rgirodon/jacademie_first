package org.jacademie.first.service;

import org.jacademie.first.service.impl.AnotherFakeBanqueServiceImpl;

public class ServiceFactory {

	public static BanqueService getBanqueService() {
		
		return new AnotherFakeBanqueServiceImpl();
	}
}
