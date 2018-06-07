package springtest.test;

public interface ItfUserDao {

	public abstract void insert(String username, String password);

	public abstract boolean usernameExists(String username);

}