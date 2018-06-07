package springtest.test;

public class UserController {
	private ItfUserService us;
	

	public UserController(ItfUserService us) {
		
		this.us = us;
	}




	public void register(String username,String password) {
		System.out.println("注册用户名为"+username+"注册用户密码为"+password);
		us.register(username,password);
	}

}
