package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	private Connection connection = null;

	public Connection getConnection(){

		try {
			// MySQL Driver 로드
			Class.forName(MySQLConnection.getDriver());

			// DB 연결 설정, connection 생성.
			connection = DriverManager.getConnection(
					MySQLConnection.getUrl(),MySQLConnection.getUser(), MySQLConnection.getPassword());
					
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}
}
