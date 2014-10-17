package org.jacademie.first.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Student {

	private Integer id;

	private String name;

	private Collection<Double> notes;

	public Student() {
		this.notes = new ArrayList<Double>();
	}

	public void addNote(Double note) {
		this.notes.add(note);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Double> getNotes() {
		return notes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
