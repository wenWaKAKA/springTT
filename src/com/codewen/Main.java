package com.codewen;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Hello.xml");
		HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage1();
		helloWorld.getMessage2();
		
		HelloChina helloChina=(HelloChina) context.getBean("hellochina");
		helloChina.getMessage1();
		helloChina.getMessage2();
		helloChina.getMessage3();
		//关闭bean。调用destroy方法
		context.registerShutdownHook();
	}
}
