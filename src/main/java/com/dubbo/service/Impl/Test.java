package com.dubbo.service.Impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		System.out.println("Provider_1 is started.");
		System.in.read();

	}

}
