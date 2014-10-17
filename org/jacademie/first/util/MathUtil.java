package org.jacademie.first.util;

import java.util.List;

public class MathUtil {

	public static Double calculerMoyenne(List<Double> list) {
		
		Double result = null;
		
		if (list != null) {
			
			result = 0.0;
			
			if (!list.isEmpty()) {
				
				Double somme = 0.0;
				
				for (Double item : list) {
					
					somme += item;
				}
				
				result = somme / list.size();
			}
		}
		
		return result;
	}
}
