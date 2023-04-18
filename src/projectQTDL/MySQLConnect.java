/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectQTDL;

/**
 *
 * @author yen nuong
 */
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
    public static void main (String[] args){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/qlst","root","T#9758@qlph");
            if (conn != null){
                System.out.println("Ket noi thanh cong database");
            }
        }catch(SQLException e){
                    System.out.println("Ket noi that bai");
                    e.printStackTrace();
                    }
    }
    
}
