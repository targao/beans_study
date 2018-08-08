package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//cast to processador, after getBean
        // Processador bean = (Processador) context.getBean("processador");
		Processador bean2 = context.getBean("processador", Processador.class);
		//bean.processe();
		bean2.processe();
	}
}
