package org.ssm.mvn.dubbo.order;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderServerApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:dubbo.xml");
		
		context.start();
		
		synchronized (OrderServerApp.class) {
			try {
				OrderServerApp.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
