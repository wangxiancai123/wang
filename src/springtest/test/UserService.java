package springtest.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService implements ItfUserService {
	private ItfUserDao ud;
	private BCryptPasswordEncoder bpe;

	public void setBpe(BCryptPasswordEncoder bpe) {
		this.bpe = bpe;
	}


	public void setUd(ItfUserDao ud) {
		this.ud = ud;
	}


	
	@Override
	public void register(String username, String password) {
		System.out.println("检查用户名"+username+"是否存在...");
		boolean bl = ud.usernameExists(username);
		if (bl==true) {
			System.out.println("注册失败，用户名"+username+"已存在");
		}else{
			ud.insert(username,password);
			String encodedPassword = bpe.encode(password);
			System.out.println("注册成功加密明文密码"+"("+encodedPassword+")");
			
		}
		
	}
	
}
