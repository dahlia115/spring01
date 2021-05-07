package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		System.out.println("서브클래스");
		String path ="classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
			
		Car car = ctx.getBean("controller",Car.class); //new Controller02();
		//Car car = new Controller02();
		car.speen();
	}
}
