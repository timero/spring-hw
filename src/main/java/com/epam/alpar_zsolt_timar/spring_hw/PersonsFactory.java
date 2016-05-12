package com.epam.alpar_zsolt_timar.spring_hw;

import java.util.ArrayList;
import java.util.List;

public class PersonsFactory {
	
	public static List<Person> addPeople(int numberOfAdditionalPeople) {
		List<Person> personList = new ArrayList<>();
		return addPeople(numberOfAdditionalPeople, personList);
	}
	
	
	public static List<Person> addPeople(int numberOfAdditionalPeople, List<Person> personList) {
		for (int i = 0; i < numberOfAdditionalPeople; i++) {
			personList.add(new Person("Noname", 0));
		}
		return personList;
	}
	
	 

}
