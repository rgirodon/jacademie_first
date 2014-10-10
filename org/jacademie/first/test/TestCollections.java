package org.jacademie.first.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jacademie.first.domain.Point;

public class TestCollections {

	public static void main(String[] args) {
		
		Collection<Integer> integers1 = new ArrayList<>();		
		integers1.add(1);
		integers1.add(2);
		integers1.add(3);
		
		Collection<Integer> integers2 = new ArrayList<>();
		integers2.add(3);
		integers2.add(4);
		integers2.add(5);
		
		Collection<Integer> integers = new HashSet<Integer>();
		integers.addAll(integers1);
		integers.addAll(integers2);
		
		System.out.println("Taille de integers : " + integers.size());
		
		for (Integer currentInt : integers) {
			
			System.out.println("Elt de integers : " + currentInt);
		}
		
		System.out.println("");
		
		Collection<String> strings = new HashSet<>();
		strings.add("ch1");
		strings.add("ch2");
		strings.add("ch3");
		strings.add("ch1");
		strings.add("ch2");
		strings.add("ch3");
		
		System.out.println("Taille de strings : " + strings.size());
		
		for (String currentStr : strings) {
			
			System.out.println("Elt de strings : " + currentStr);
		}
		
		System.out.println("");
		
		Map<Integer, Collection<String>> villesMap = new HashMap<>();
		villesMap.put(75, new ArrayList<String>());
		villesMap.get(75).add("Paris");
		
		villesMap.put(13, new ArrayList<String>());
		villesMap.get(13).add("Marseille");
		
		villesMap.put(69, new ArrayList<String>());
		villesMap.get(69).add("Lyon");
		
		for (Integer cleDepartement : villesMap.keySet()) {
			
			Collection<String> villes = villesMap.get(cleDepartement);
			
			for (String ville : villes) {
			
				System.out.println("Ville : " + ville + ", Departement : " + cleDepartement);
			} 
		}
		
		System.out.println("");
		
		villesMap.get(69).add("Givors");
		
		for (Integer cleDepartement : villesMap.keySet()) {
			
			Collection<String> villes = villesMap.get(cleDepartement);
			
			for (String ville : villes) {
			
				System.out.println("Ville : " + ville + ", Departement : " + cleDepartement);
			} 
		}
		
		System.out.println("");
		
		Map<String, Integer> notesMap = new HashMap<String, Integer>();
		notesMap.put("eleve1", 12);
		notesMap.put("eleve2", 16);
		notesMap.put("eleve3", 14);
		
		Collection<Integer> notes = notesMap.values();
		
		for (Integer note : notes) {
			
			System.out.println("Note : " + note);
		}
		
		System.out.println("");
		
		Set<Map.Entry<String, Integer>> entries = notesMap.entrySet();
		
		for (Map.Entry<String, Integer> entry : entries) {
			
			System.out.println("Entry : " + entry.getKey() + " >> " + entry.getValue());
		}
				
		System.out.println("");
		
		Collection<Point> listPoints = new ArrayList<>();
		listPoints.add(new Point(0, 0));
		listPoints.add(new Point(1, 0));
		listPoints.add(new Point(0, 1));
		listPoints.add(new Point(1, 1));
		listPoints.add(new Point(0, 0));
		
		System.out.println("ListPoints : " + listPoints);
		System.out.println("Size listPoints : " + listPoints.size());
		
		System.out.println("");
		
		Collection<Point> setPoints = new HashSet<>();
		setPoints.add(new Point(0, 0));
		setPoints.add(new Point(1, 0));
		setPoints.add(new Point(0, 1));
		setPoints.add(new Point(1, 1));
		setPoints.add(new Point(0, 0));
		
		System.out.println("setPoints : " + setPoints);
		System.out.println("Size setPoints : " + setPoints.size());
	}
}
