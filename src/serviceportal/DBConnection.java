/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serviceportal;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sonytara
 */
public class DBConnection {
   public static Connection getConnection()
   {
      Connection con=null;
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:digital/digital@//localhost:1521/XE");

       }

       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
      
       return con;
   }

}
