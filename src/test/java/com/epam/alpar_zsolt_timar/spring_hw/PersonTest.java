package com.epam.alpar_zsolt_timar.spring_hw;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	
	private static AbstractApplicationContext context;

	@BeforeClass
	public static void init(){
		context = new ClassPathXmlApplicationContext("beans.xml");

	}
	
	
	@Test
	public void emptyTest() {
		Person p = new Person("", 10);
		Assert.assertEquals("Person [names=[], power=10]", p.toString());
		Assert.assertEquals(10, p.getPower());
		
	}
	
	@Test
	public void oneName() {
		String name = "Neo";
		Person p = new Person(name, 10);
		Assert.assertEquals("Person [names=["+name+"], power=10]", p.toString());
		Assert.assertEquals(10, p.getPower());
	}
	
	@Test
	public void twoNames() {
		Person neo = context.getBean("neo", Person.class);
		String name = "Neo";
		String name2 = "Mr. Anderson";
		System.out.println(neo);
		Assert.assertArrayEquals(new String[] {new String(name), new String(name2)}, neo.getNames());
		Assert.assertEquals(1000, neo.getPower());
	}
	
//	@Test
//	public void 
}
