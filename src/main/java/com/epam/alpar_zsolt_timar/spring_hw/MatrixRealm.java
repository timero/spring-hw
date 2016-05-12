package com.epam.alpar_zsolt_timar.spring_hw;

import java.util.List;

public class MatrixRealm extends Realm {

    public MatrixRealm(String name, List<Person> persons) {
		super(name, persons);
	}

	public void init(){
        System.out.println("init method: " + this.toString());
    }

	public static Object createPeople() {
		// TODO Auto-generated method stub
		return null;
	}

}
