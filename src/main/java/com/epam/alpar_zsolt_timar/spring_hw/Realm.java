package com.epam.alpar_zsolt_timar.spring_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Realm {

	private String name;
	private List<Person> persons = new ArrayList<>();

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Realm(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean setPerson(Person e) {
		return persons.add(e);
	}

	public Person[] getNames() {
		return Arrays.copyOf(persons.toArray(), persons.size(), Person[].class);
	}

	@Override
	public String toString() {
		return "Realm [name=" + name + ", persons=" + persons + "]";
	}
	
	

}
