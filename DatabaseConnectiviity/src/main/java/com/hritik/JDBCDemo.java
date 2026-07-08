package com.hritik;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;
public class JDBCDemo {
    static final String URL      = "jdbc:h2:mem:studentdb;DB_CLOSE_DELAY=-1";
    static final String USER     = "sa";
    static final String PASSWORD = "";
    public static void main(String[] args) throws SQLException, IOException {
        Server server = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8083").start();
        System.out.println("H2 Console: http://localhost:8082");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connected to H2 database.\n");

        Statement stmt = conn.createStatement();
        stmt.execute(
                "CREATE TABLE students (" +
                        "id   INT PRIMARY KEY AUTO_INCREMENT," +
                        "name VARCHAR(100)," +
                        "age  INT)"
        );
        System.out.println("Table created.");

        stmt.execute("INSERT INTO students (name, age) VALUES ('Alice', 21)");
        stmt.execute("INSERT INTO students (name, age) VALUES ('Bob',   22)");
        stmt.execute("INSERT INTO students (name, age) VALUES ('Carol', 20)");
        System.out.println("3 rows inserted.\n");

        System.out.println("--- All Students ---");
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println(
                    "ID: "   + rs.getInt("id")    +
                            " | Name: " + rs.getString("name") +
                            " | Age: "  + rs.getInt("age")
            );
        }
        stmt.execute("UPDATE students SET age = 25 WHERE name = 'Alice'");
        System.out.println("\nAlice's age updated to 25.");

        System.out.println("\n--- After Update ---");
        rs = stmt.executeQuery("SELECT * FROM students WHERE name = 'Alice'");
        while (rs.next()) {
            System.out.println(
                    "ID: "   + rs.getInt("id")    +
                            " | Name: " + rs.getString("name") +
                            " | Age: "  + rs.getInt("age")
            );
        }
        stmt.execute("DELETE FROM students WHERE name = 'Bob'");
        System.out.println("\nBob deleted.");

        System.out.println("\n--- Final Table ---");
        rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            System.out.println(
                    "ID: "   + rs.getInt("id")    +
                            " | Name: " + rs.getString("name") +
                            " | Age: "  + rs.getInt("age")
            );
        }
        rs.close();
        stmt.close();
        conn.close();
        System.out.println("H2 Console open at http://localhost:8082");
        System.out.println("Press ENTER to stop...");
        System.in.read(); // program waits here

        server.stop();
        System.out.println("\nConnection closed.");
    }
}
//JDBC URL:  jdbc:h2:mem:studentdb
//User Name: sa
//Password:  (leave blank)