package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDb {

    static {
        try {
            Class.forName("org.postgresql.Driver");            
        } catch (ClassNotFoundException exc) {
            throw new RuntimeException("Driver SGBD não encontrado.", exc);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:postgresql://127.0.0.1:5432/data_db",
            "dev",
            "Senha123"
        );
    }

}
