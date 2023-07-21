/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket2;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/**
 *
 * @author girik
 */
public class DBConnection {
    static final String user="root";
    static final String url="jdbc:mysql://localhost:3306/supermarketdb";
    static final String pass="smilegiri";
    
    public static Connection connectDB() throws Exception
    {

        Connection conn=null;
        try{
               
               conn=(Connection) DriverManager.getConnection(url, user, pass);
               return conn;
           }
           catch(SQLException ex)
           {
//               System.out.print(ex.getMessage());
               return null;
           }
               
    }
}
