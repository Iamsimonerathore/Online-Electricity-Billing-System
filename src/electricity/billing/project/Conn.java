/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.project;

/**
 *
 * @author simone
 */
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricitybillingsystem", "root", "simone2582");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}