package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean stb = new STBean();
		//stb.setSt(new Student());
		
		String path = "classpath:applicationSt.xml";//경로설정
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		STBean stb = ctx.getBean("stb",STBean.class); //빈을 가져온다
		
		//stb.setName("홍길동1");
		//stb.setAge(201);
		
		stb.print();
		
	}
}
