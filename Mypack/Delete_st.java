/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class Delete_st {
    public static void main(String []args)
    {
        Statement stmt = null;
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/col","root","raj");
            
            
            
             
      stmt = c.createStatement();
      
      stmt.executeUpdate("delete from student where s_id=102");

            System.out.println("Data deleted");
            
            c.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
