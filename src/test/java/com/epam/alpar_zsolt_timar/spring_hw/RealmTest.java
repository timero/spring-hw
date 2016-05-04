package com.epam.alpar_zsolt_timar.spring_hw;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RealmTest {
	
	private static AbstractApplicationContext context;

	@BeforeClass
	public static void init(){
		context = new ClassPathXmlApplicationContext("beans.xml");

	}
	
	@Test
	public void test() {
		Realm matrix = context.getBean("matrix", Realm.class);
		String shouldBe = "Realm [name=Matrix, persons=[Person [names=[Neo, Mr. Anderson], power=1000], "
				+ "Person [names=[Trinity], power=50], Person [names=[Morpheus], power=100], "
				+ "Person [names=[Oracle], power=0], Person [names=[Agent Smith], power=900], "
				+ "Person [names=[agent2], power=800], Person [names=[agent3], power=700]]]";
		System.out.println(matrix.toString());
		Assert.assertEquals(shouldBe, matrix.toString());
	}

}
