package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path ="classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
			
		Car car = ctx.getBean("controller",Car.class); //new Controller02();
		System.out.println("메인 클래스");
		car.speen();
		
		SubClass sc = new SubClass();
		sc.subFunc();
	}
}
