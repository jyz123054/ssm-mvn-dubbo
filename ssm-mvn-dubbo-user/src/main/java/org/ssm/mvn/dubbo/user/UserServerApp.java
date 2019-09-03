package org.ssm.mvn.dubbo.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServerApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:dubbo.xml");
		
		context.start();
		
		synchronized (UserServerApp.class) {
			try {
				UserServerApp.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
