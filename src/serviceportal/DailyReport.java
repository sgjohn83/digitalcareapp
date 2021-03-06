/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DailyReport.java
 *
 * Created on Jun 17, 2021, 7:50:30 PM
 */

package serviceportal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.print.PrinterException;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author sgjohn
 */
public class DailyReport extends javax.swing.JFrame {


   String serviceID;
   public static int sum_charges=0;

    /** Creates new form DailyReport */
    public DailyReport() {
        initComponents();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        getReport = new javax.swing.JButton();
        report = new javax.swing.JComboBox();
        userid = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        date1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        amountlbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deliverylbl = new javax.swing.JLabel();
        failurelbl = new javax.swing.JLabel();
        completedlbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        countlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        acosts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(serviceportal.ServicePortalApp.class).getContext().getResourceMap(DailyReport.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel2.border.title"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1250, 300));
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 1280, 460);

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), resourceMap.getString("jPanel1.border.title"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        getReport.setBackground(resourceMap.getColor("getReport.background")); // NOI18N
        getReport.setText(resourceMap.getString("getReport.text")); // NOI18N
        getReport.setName("getReport"); // NOI18N
        getReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getReportActionPerformed(evt);
            }
        });
        jPanel1.add(getReport);
        getReport.setBounds(462, 31, 130, 30);

        report.setBackground(resourceMap.getColor("report.background")); // NOI18N
        report.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "User Id", "UPI", "Direct Cash", "Advance", "Balance" }));
        report.setName("report"); // NOI18N
        report.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                reportItemStateChanged(evt);
            }
        });
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel1.add(report);
        report.setBounds(342, 31, 110, 30);

        userid.setText(resourceMap.getString("userid.text")); // NOI18N
        userid.setToolTipText(resourceMap.getString("userid.toolTipText")); // NOI18N
        userid.setName("userid"); // NOI18N
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        jPanel1.add(userid);
        userid.setBounds(174, 31, 150, 30);

        printButton.setText(resourceMap.getString("printButton.text")); // NOI18N
        printButton.setName("printButton"); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel1.add(printButton);
        printButton.setBounds(610, 31, 92, 30);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(55, 31, 93, 36);

        date1.setBackground(resourceMap.getColor("date1.background")); // NOI18N
        date1.setName("date1"); // NOI18N
        jPanel1.add(date1);
        date1.setBounds(1110, 30, 150, 30);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setForeground(resourceMap.getColor("jLabel5.foreground")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(960, 30, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 1280, 80);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(new javax.swing.border.LineBorder(resourceMap.getColor("jPanel3.border.lineColor"), 5, true)); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        amountlbl.setFont(resourceMap.getFont("amountlbl.font")); // NOI18N
        amountlbl.setForeground(resourceMap.getColor("amountlbl.foreground")); // NOI18N
        amountlbl.setText(resourceMap.getString("amountlbl.text")); // NOI18N
        amountlbl.setName("amountlbl"); // NOI18N
        jPanel3.add(amountlbl);
        amountlbl.setBounds(1030, 40, 150, 30);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(850, 50, 190, 19);

        jLabel3.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel3.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(49, 16, 134, 48);

        jLabel4.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel4.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(247, 16, 135, 48);

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setForeground(resourceMap.getColor("jLabel7.foreground")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(49, 75, 122, 17);

        deliverylbl.setFont(resourceMap.getFont("deliverylbl.font")); // NOI18N
        deliverylbl.setForeground(resourceMap.getColor("deliverylbl.foreground")); // NOI18N
        deliverylbl.setText(resourceMap.getString("deliverylbl.text")); // NOI18N
        deliverylbl.setName("deliverylbl"); // NOI18N
        jPanel3.add(deliverylbl);
        deliverylbl.setBounds(183, 24, 50, 30);

        failurelbl.setFont(resourceMap.getFont("deliverylbl.font")); // NOI18N
        failurelbl.setForeground(resourceMap.getColor("failurelbl.foreground")); // NOI18N
        failurelbl.setText(resourceMap.getString("failurelbl.text")); // NOI18N
        failurelbl.setName("failurelbl"); // NOI18N
        jPanel3.add(failurelbl);
        failurelbl.setBounds(180, 70, 40, 20);

        completedlbl.setFont(resourceMap.getFont("deliverylbl.font")); // NOI18N
        completedlbl.setForeground(resourceMap.getColor("completedlbl.foreground")); // NOI18N
        completedlbl.setText(resourceMap.getString("completedlbl.text")); // NOI18N
        completedlbl.setName("completedlbl"); // NOI18N
        jPanel3.add(completedlbl);
        completedlbl.setBounds(390, 30, 40, 20);

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(850, 80, 160, 19);

        countlbl.setFont(resourceMap.getFont("countlbl.font")); // NOI18N
        countlbl.setForeground(resourceMap.getColor("countlbl.foreground")); // NOI18N
        countlbl.setText(resourceMap.getString("countlbl.text")); // NOI18N
        countlbl.setName("countlbl"); // NOI18N
        jPanel3.add(countlbl);
        countlbl.setBounds(1030, 80, 150, 20);

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setForeground(resourceMap.getColor("jLabel6.foreground")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(850, 20, 160, 19);

        acosts.setFont(resourceMap.getFont("acosts.font")); // NOI18N
        acosts.setForeground(resourceMap.getColor("acosts.foreground")); // NOI18N
        acosts.setText(resourceMap.getString("acosts.text")); // NOI18N
        acosts.setName("acosts"); // NOI18N
        jPanel3.add(acosts);
        acosts.setBounds(1030, 20, 120, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 560, 1280, 110);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1366)/2, (screenSize.height-706)/2, 1366, 706);
    }// </editor-fold>//GEN-END:initComponents

    private void getReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getReportActionPerformed
        // TODO add your handling code here:
        String formatted;
        java.util.Date d  = date1.getDate();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yy");
        if(d!=null)
        {
           formatted =    df.format(d);
        }
        else
        {
            formatted = df.format(new Date());
        }


       
        String url="select serviceid as ReceiptNo,phone_model,complaint_name,Received_amount as amount,type,to_char(received_date,'dd-MM-yy') as received_date,recieved_time,received_by,cashmode,status,delivery_status from payments p,status s,complaint c where p.serviceid=s.receipt_no and p.serviceid=c.receipt_no and  received_date='"+formatted+"'";


         if(report.getSelectedItem().equals("UPI"))
         {
             url = url+" and cashMode='UPI'";
         }

         if(report.getSelectedItem().equals("Direct Cash"))
         {
             url = url+" and cashMode='Direct Cash'";
         }

         if(report.getSelectedItem().equals("Advance"))
         {
              url = url+" and type='advance'";
         }
         if(report.getSelectedItem().equals("Balance"))
         {
              url = url+" and type='Balance Amount'";
         }

         if(!userid.getText().isEmpty() && report.getSelectedItem().equals("User Id"))
         {
             url = url+" and received_by='"+userid.getText()+"',";
         }


        url = url+" and (received_amount!=0 or  delivery_status='Delivered') order by serviceid";

         QueryTableModel12 qtm;
         qtm=new QueryTableModel12();
         qtm.setHostURL("jdbc:oracle:thin:digital/digital@//localhost:1521/XE");
         System.out.println(url);
         qtm.setQuery(url);
         jTable1.setModel(qtm);



         MyTableRender12 r = new MyTableRender12();
         jTable1.setDefaultRenderer(Object.class, r);

         jTable1.getColumnModel().getColumn(9).setMinWidth(0);
         jTable1.getColumnModel().getColumn(9).setMaxWidth(0);
         jTable1.getColumnModel().getColumn(10).setMinWidth(0);
         jTable1.getColumnModel().getColumn(10).setMaxWidth(0);
        try
        {
           DBConnection db = new DBConnection();
           Connection con = db.getConnection();
           Statement sa = con.createStatement();
           int pos =  url.indexOf("from");
          String url2 = url.substring(pos);
          String  u = "select sum(RECEIVED_AMOUNT)"+" "+url2;
          ResultSet rs2 = sa.executeQuery(u);
          int amount=0;

          while(rs2.next())
           {
            amount=   amount + rs2.getInt(1);

           }
          amount = amount + sum_charges;
          String a= ""+amount;
          amountlbl.setText(a);
          // Delivery Count
          rs2=sa.executeQuery("select count(distinct serviceid) from payments p,status s where p.serviceid=s.receipt_no and received_date='"+formatted+"' and delivery_status='Delivered'");
          rs2.next();
          deliverylbl.setText(rs2.getString(1));

          // Failure Count
          rs2=sa.executeQuery("select count(distinct serviceid) from payments p,status s where p.serviceid=s.receipt_no and received_date='"+formatted+"' and (status='Failed' or status='Cancelled') and delivery_status='Delivered'");
          rs2.next();
          failurelbl.setText(rs2.getString(1));

     /*     //new count
          rs2=sa.executeQuery("select count(distinct serviceid) from payments p,status s where p.serviceid=s.receipt_no and received_date='"+formatted+"' and status='New'");
          rs2.next();
          newlbl.setText(rs2.getString(1));  */

          //complete count
          rs2=sa.executeQuery("select count(distinct serviceid) from payments p,status s where p.serviceid=s.receipt_no and received_date='"+formatted+"' and status='Completed' and delivery_status='Delivered'");
          rs2.next();
          completedlbl.setText(rs2.getString(1));

       /*   //pending count
           rs2=sa.executeQuery("select count(distinct serviceid) from payments p,status s where p.serviceid=s.receipt_no and received_date='"+formatted+"' and status='Pending'");
          rs2.next();
          pendinglbl.setText(rs2.getString(1)); */

          //total count
           rs2=sa.executeQuery("select count(distinct serviceid) from payments p,status s where p.serviceid=s.receipt_no and received_date='"+formatted+"' and (received_amount!=0 or status='Failed' or status='Cancelled')");
          rs2.next();
         countlbl.setText(rs2.getString(1));
         acosts.setText(sum_charges+"");



        }
       catch(Exception e)
       {
           e.printStackTrace();
       }


    }//GEN-LAST:event_getReportActionPerformed

    private void reportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reportItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_reportItemStateChanged

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow[] = jTable1.getSelectedRows();
        int selectedCol[] = jTable1.getSelectedColumns();
        String selectedData=null,str="";
        for(int i=0;i<selectedRow.length;i++)
        {
            for(int j=0;j<selectedCol.length;j++)
            {
                str=jTable1.getColumnName(selectedCol[j]);
                str=str +": "+ (String) jTable1.getValueAt(selectedRow[i], selectedCol[j]);

                selectedData=(String) jTable1.getValueAt(selectedRow[i], 0);
            }
        }
        serviceID=selectedData;
        if(evt.getClickCount()==2)
        {

        ViewReport vr = new ViewReport();
        vr.setDetails(serviceID);
        vr.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    } /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyReport().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acosts;
    private javax.swing.JLabel amountlbl;
    private javax.swing.JLabel completedlbl;
    private javax.swing.JLabel countlbl;
    private org.jdesktop.swingx.JXDatePicker date1;
    private javax.swing.JLabel deliverylbl;
    private javax.swing.JLabel failurelbl;
    private javax.swing.JButton getReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printButton;
    private javax.swing.JComboBox report;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables

}
class QueryTableModel12 extends AbstractTableModel {
  Vector cache; // will hold String[] objects . . .

  int colCount;

  String[] headers;

  Connection db;

  Statement statement;

  String currentURL;
  int total=0;

  public QueryTableModel12() {
    cache = new Vector();

    try
    {
        Class.forName("oracle.jdbc.OracleDriver");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

  }

  public String getColumnName(int i) {
    return headers[i];
  }

  public int getColumnCount() {
    return colCount;
  }

  public int getRowCount() {
    return cache.size();
  }

  public Object getValueAt(int row, int col) {
    return ((String[]) cache.elementAt(row))[col];
  }

  public void setHostURL(String url) {
    if (url.equals(currentURL)) {
      // same database, we can leave the current connection open
      return;
    }
    // Oops . . . new connection required
    closeDB();
    initDB(url);
    currentURL = url;
  }

  // All the real work happens here; in a real application,
  // we'd probably perform the query in a separate thread.
  public void setQuery(String q) {
    cache = new Vector();
    try {
      // Execute the query and store the result set and its metadata
      ResultSet rs = statement.executeQuery(q);
      ResultSetMetaData meta = rs.getMetaData();
      colCount = meta.getColumnCount()+1;

      // Now we must rebuild the headers array with the new column names
      headers = new String[colCount+1];
      int x=0;
      for (int h = 1; h <= colCount-1; h++) {
        headers[h - 1] = meta.getColumnName(h);
        x=h;
      }
      headers[x]="Additional Charges";

      // and file the cache with the records from our query. This would
      // not be
      // practical if we were expecting a few million records in response
      // to our
      // query, but we aren't, so we can do this.
      DateFormat df= new SimpleDateFormat("dd-MMM-yy");
      AddCharges a = new AddCharges();
      int charges=0;
      while (rs.next()) {
        String[] record = new String[colCount+1];
        if(rs.getString("type").equals("advance"))
            charges=0;
        else
            charges = a.getCharges(rs.getString("receiptno"));
        total+=charges;
        int j=0;
        for (int i = 0; i < colCount-1; i++) {

           record[i] = rs.getString(i + 1);
           j=i;
        }
        record[j+1]=new Integer(charges).toString();
        cache.addElement(record);
      }
      DailyReport.sum_charges=total;
      fireTableChanged(null); // notify everyone that we have a new table.
    } catch (Exception e) {
      cache = new Vector(); // blank it out and keep going.
      e.printStackTrace();
    }
  }

  public void initDB(String url) {
    try {
      db = DBConnection.getConnection();
      statement = db.createStatement();
    } catch (Exception e) {
      System.out.println("Could not initialize the database.");
      e.printStackTrace();
    }
  }

  public void closeDB() {
    try {
      if (statement != null) {
        statement.close();
      }
      if (db != null) {
        db.close();
      }
    } catch (Exception e) {
      System.out.println("Could not close the current connection.");
      e.printStackTrace();
    }
  }


}
class MyTableRender12 extends DefaultTableCellRenderer
{

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

       String status=SearchComplaint.getStatusMode();

       Font f = new Font("Courier",Font.PLAIN,24);
        comp.setFont(f); 
       if(!isSelected)
       {
            if(column!=0)
             {

             Font f2 = new Font("Courier",Font.PLAIN,24);
                 comp.setFont(f2);
             if(table.getValueAt(row, 9).equals("New") && table.getValueAt(row, 10).equals("NO"))
              {
                
                 comp.setBackground(Color.WHITE);
              }
              else if(table.getValueAt(row, 9).equals("Pending") && table.getValueAt(row, 10).equals("NO"))
              {
               
                  comp.setBackground(Color.YELLOW);
              }
               else if(table.getValueAt(row, 9).equals("Completed") && table.getValueAt(row, 10).equals("NO"))
              {
                   
                   comp.setBackground(Color.GREEN);
              }
                else if((table.getValueAt(row, 9).equals("Failed") || table.getValueAt(row, 9).equals("Cancelled")) && table.getValueAt(row, 10).equals("NO"))
              {
                 
                    comp.setBackground(Color.RED);
              }
              else if((table.getValueAt(row, 9).equals("Failed") || table.getValueAt(row, 9).equals("Cancelled")) && table.getValueAt(row, 10).equals("Delivered"))
              {
                 
                  
                  comp.setBackground(Color.magenta);
              }
                else if(table.getValueAt(row, 10).equals("Delivered"))
                {
                    
                    comp.setBackground(Color.BLUE);
                }
                else if(table.getValueAt(row, 10).equals("Returned"))
                {
                    comp.setBackground(new Color(185, 122, 87));
                }
             }

            /*   Color c = table.getBackground();
           if((row%2==0) && c.getRed()>10 && c.getGreen()>10 && c.getBlue()>10 )
             comp.setBackground(Color.WHITE);
             * 
           else
               comp.setBackground(new Color(238, 224, 229)); */
             else if(column==0)
             {
                 comp.setBackground(Color.PINK);
                 Font f1 = new Font(Font.DIALOG,Font.BOLD,22);
                 comp.setFont(f1);
             }
       }


       return comp;

    }

}

