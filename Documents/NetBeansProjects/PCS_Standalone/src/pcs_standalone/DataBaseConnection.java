package pcs_standalone;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jc
 */
public class DataBaseConnection 
{
    public static java.sql.Connection dbConnection() throws ClassNotFoundException, SQLException
    {
        java.sql.Connection conn=null;
	String url="jdbc:mysql://localhost:3306/pcs";
        Class.forName("com.mysql.jdbc.Driver");
        conn = (java.sql.Connection) DriverManager.getConnection(url,"root","root");
        return conn;
    }
}
     
      
       
    
    
    
    
