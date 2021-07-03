/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serviceportal;

import java.awt.Font;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author sonytara
 */
public class DeliverHandset {
private static String serID="";
    public static void delivery()
{


       DateFormat df = new SimpleDateFormat("dd-MMM-yy");
       DateFormat dt = new SimpleDateFormat("HH:mm");
       Calendar cal = Calendar.getInstance();
       String date1= df.format(cal.getTime());
       String time = dt.format(cal.getTime());

       if(serID.equals(""))
       {
            String x =JOptionPane.showInputDialog(null,"Enter ServiceID to create delivery","Service ID Request",JOptionPane.QUESTION_MESSAGE);
            if(x==null || x.equals(""))
           return;
           serID=x;
       }


       int i=-1,j=-1;
     String stat = StatusCheck.CheckStatus(serID);
     String del_stat=StatusCheck.deliveryStatus(serID);
     j=StatusCheck.validNo();
        if(j!=0)
           {
               JOptionPane.showMessageDialog(null, "Service ID not available","error",JOptionPane.ERROR_MESSAGE);
               return;
           }


      if(!del_stat.equals("Returned"))
      {
        if(stat.equals("New") || del_stat.equals("Delivered") || stat.equals("Pending"))
       {
           JOptionPane.showMessageDialog(null, serID+" Handset cannot be delivered!","Warning",JOptionPane.WARNING_MESSAGE);
           return;
       }

      }
       
       
       if( stat.equals("Failed")|| stat.equals("Completed") || stat.equals("Cancelled") || del_stat.equals("Returned"))
       {
       String issuedby = "";
       Connection con = DBConnection.getConnection();
       Statement statement;
       ResultSet rs;
       int amount=0;
       int bal;
       try
       {
         int o =  JOptionPane.showConfirmDialog(null, "Are You Sure delivery of "+serID,"Confirm "+serID,JOptionPane.YES_NO_OPTION);
          if(o==1)
          {
              return;
          }
          statement = con.createStatement();

          int can=statement.executeUpdate("delete from cancelled where receipt_no='"+serID+"'");

          rs=statement.executeQuery("select * from complaint where receipt_no like '%"+serID+"%'");
          bal=0;
          while(rs.next())
           {
               amount = rs.getInt("est_chargs");
               issuedby = rs.getString("recvd_by");
               bal=rs.getInt("balance");

           }
           String recvd_by = ServicePortalApp.getUsername();
        
          int b=bal+new AddCharges().getCharges(serID);
           JLabel label = new JLabel("Pay Amount:"+b);
          label.setFont(new Font("serif", Font.PLAIN, 25));
          int x= JOptionPane.showConfirmDialog(null, label,"payment confirmation "+serID,JOptionPane.YES_NO_OPTION);
          String op="";
          if(x==1)
             return;
          else
              op= JOptionPane.showInputDialog("0-Direct Cash\n1-UPI");

          if(op==null)
          {
              return;
          }
          if(op.equals(""))
          op="0";
          int choice = Integer.parseInt(op);
          String cashMode = choice==0 ? "Direct Cash" : "UPI";
          statement.executeUpdate("insert into payments values('"+serID+"',"+bal+",'Balance Amount','"+date1+"','"+time+"','"+recvd_by+"','"+cashMode +"')");
          
         
           
           if(can==0)
           {
             statement.executeUpdate("insert into delivery values('"+serID+"','"+date1+"',"+amount+",'"+ServicePortalApp.getUsername()+"','"+time+"')");
             JOptionPane.showMessageDialog(null, "Delivery of "+serID+" Successfully created" );
           }
           else
           {
              JOptionPane.showMessageDialog(null, "Delivery error","error",JOptionPane.ERROR_MESSAGE );
           }

       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       StatusCheck.updateStatus(serID);
       }
       else if(stat.equals("Delivered"))
           JOptionPane.showMessageDialog(null, "Already Handset is delivered","Error",JOptionPane.ERROR_MESSAGE);
       else
           JOptionPane.showMessageDialog(null, "Operation Cancelled");
}

    static void setServiceID(String serviceID) {
        serID=serviceID;
    }
}
