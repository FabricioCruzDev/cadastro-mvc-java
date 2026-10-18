package dao;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.ConnectionDb;

public abstract class DAO<T> {

    private Connection conn;

    public DAO () throws SQLException{
        conn = ConnectionDb.getConnection();
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() throws SQLException{
        conn.close();
    }

    public abstract void save(T obj) throws SQLException;

    public abstract void update(T obj) throws SQLException;

    public abstract void delete(T obj) throws SQLException;

    public abstract T getAll() throws SQLException;

    public abstract T getById(int id) throws SQLException;
}
