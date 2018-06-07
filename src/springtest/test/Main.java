package springtest.test;



import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public  static void main(String[] args){
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("springtest/test/test.xml");
		UserController uc = context.getBean(UserController.class);
		
		 Scanner sc=new Scanner(System.in);
		 System.out.print("请输入用户名：");  
	       String username=sc.nextLine();
	     System.out.print("请输入用户密码：");  
	       String password=sc.nextLine();
	       uc.register(username,password);
		
	}
}
