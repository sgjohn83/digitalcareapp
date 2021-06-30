/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serviceportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sonytara
 */
public class StatusCheck {

   static int i=-1;
    public static String CheckStatus(String id)
    {
       Connection con = DBConnection.getConnection();
       Statement st = null;
       ResultSet rs = null;
       String status = null;
       try
       {
           if(con!=null)
           {
            st = con.createStatement();
            rs=st.executeQuery("select status from status where receipt_no like '%"+id+"%'");



           while(rs.next())
           {
               status = rs.getString("status");
               i=0;
               
           }
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }

       return status;
    }

    public static void updateStatus(String id)
    {
        Connection con = DBConnection.getConnection();
       Statement st = null;

       try
       {
           st = con.createStatement();
           st.executeUpdate("update status set delivery_status='Delivered' where receipt_no " +
                   "like '%"+id+"%'");

       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    public static String deliveryStatus(String id)
    {
         Connection con = DBConnection.getConnection();
       Statement st = null;
        ResultSet rs=null;
       String res="";
        try
       {
           st = con.createStatement();
           rs=st.executeQuery("select delivery_status from status where receipt_no='"+id+"'");
           while(rs.next())
           {
               res=rs.getString("delivery_status");
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return  res;
    }
public static int validNo()
 {
   return i;
 }
    

}
