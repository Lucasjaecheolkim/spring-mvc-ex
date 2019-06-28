package cmm.lucas.example;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MysqlConnectionTest {
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3307/webauthn?autoReconnect=true&useTimezone=true&useSSL=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println(connection);
		} catch (Exception e) {
			
		}
	}

}
