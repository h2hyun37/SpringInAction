package com.h2hyun37.knight;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	// 단지 test 용도.
	BeanNameAware aware;
	BeanFactoryAware aware2;
	ApplicationContextAware aware3;

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("classpath:knight/applicationContext-knight.xml");

		String knightId = "knight";
		if (args.length > 0) {
			knightId = args[0];
		}

		Knight knight = (Knight) context.getBean(knightId);

		knight.embarkOnQuest();
	}

}
