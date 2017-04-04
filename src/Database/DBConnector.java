package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	private Connection connection = null;

	public Connection getConnection(){

		try {
			// MySQL Driver �ε�
			Class.forName(MySQLConnection.getDriver());

			// DB ���� ����, connection ����.
			connection = DriverManager.getConnection(
					MySQLConnection.getUrl(),MySQLConnection.getUser(), MySQLConnection.getPassword());
					
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}
}
