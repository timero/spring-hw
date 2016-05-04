package com.epam.alpar_zsolt_timar.spring_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

	List<String> names = new ArrayList<>();
	long power = 0;

	public Person(List<String> names, long power) {
		super();
		this.names.addAll(names);
		this.power = power;
	}

	public Person(String name, long power) {
		super();
		this.names.add(name);
		this.power = power;
	}

	public boolean addNames(String e) {
		return names.add(e);
	}

	public String[] getNames() {
		return Arrays.copyOf(names.toArray(), names.size(), String[].class);
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", power=" + power + "]";
	}

	public long getPower() {
		return power;
	}

}
