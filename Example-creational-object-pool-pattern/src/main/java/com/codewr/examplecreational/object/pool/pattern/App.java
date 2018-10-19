package com.codewr.examplecreational.object.pool.pattern;

import java.sql.Connection;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String args[]) throws InterruptedException {
        // Do something...
        //    ...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/codewr", "root", "");

        // Get a connection:
        Connection con = pool.checkOut();
        Thread.sleep(10000);
        Connection con2 = pool.checkOut();
        Thread.sleep(25000);
        pool.checkIn(con2);
        pool.checkIn(con);
        pool.checkOut();
//        pool.expire(con);
//        pool.expire(con2);
//        boolean isConnected = pool.validate(con);
//        boolean isConnected2= pool.validate(con2);
//        System.out.println("con isconnect: "+isConnected);
//        System.out.println("con2 isconnect: "+isConnected2);
        // Use the connection
        //    ...
        // Return the connection:

    }
}
