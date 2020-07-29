package com.arre.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
	public void method1(){
		System.out.println("Method1");
	}
	@Test
	public void method2(){
		System.out.println("Method2");
	}
	
	@AfterTest
	public void method3(){
		System.out.println("Method3");
	}

}
