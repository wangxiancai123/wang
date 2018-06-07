package springtest.test;

public class UserDao implements ItfUserDao {

	
	@Override
	public void insert(String username, String password) {
		
		
	}
	
	@Override
	public boolean usernameExists(String username) {
		if (username.equals("admin")) {
			return true;
		}else{
		System.out.println("插入新建用户"+username);
		return false;
		}
	}
}
