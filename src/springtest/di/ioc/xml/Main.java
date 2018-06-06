package springtest.di.ioc.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext  context = 
			new ClassPathXmlApplicationContext("beans.xml");
	 A a =context.getBean(A.class);
	 a.a();
	}

}
