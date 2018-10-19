package com.codewr.examplecreational.object.pool.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author codewr
 */
//The three remaining methods are abstract 
//and therefore must be implemented by the subclass
public class JDBCConnectionPool extends ObjectPool<Connection> {

    private String dsn, usr, pwd;

    public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            Connection connection = DriverManager.getConnection(dsn, usr, pwd);
            System.out.println("create connection success");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }

    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
            System.out.println("Connection expire! ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            boolean isClosed = o.isClosed();
//            return (!((Connection) o).isClosed());
            return !isClosed;
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
