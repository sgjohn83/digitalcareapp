/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StatusReport.java
 *
 * Created on Aug 30, 2015, 10:30:58 AM
 */

package serviceportal;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author sonytara
 */
public class StatusReport extends javax.swing.JFrame {

    /** Creates new form StatusReport */
    public StatusReport() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N
        setResizable(false);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-600)/2, 1024, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
        {
            int selectedRow[] = jTable1.getSelectedRows();
        int selectedCol[] = jTable1.getSelectedColumns();
        String selectedData=null,str="";
        for(int i=0;i<selectedRow.length;i++)
        {
            for(int j=0;j<selectedCol.length;j++)
            {
                str=jTable1.getColumnName(selectedCol[j]);
                str=str +": "+ (String) jTable1.getValueAt(selectedRow[i], selectedCol[j]);

                selectedData=(String) jTable1.getValueAt(selectedRow[i], 6);
            }
        }
        receipt_no=selectedData;
        ViewReport vr = new ViewReport();
        vr.setDetails(receipt_no);
        vr.setVisible(true);
        
        }

    }//GEN-LAST:event_jTable1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
  
  static String receipt_no=null;
public void loadTable(String mode)
{
     String newSqlQuery="select cname as CUSTOMER,contact_no as CONTACT,phone_model as MODEL" +
               ",complaint_name as COMPLAINT,recvd_accr as ACCESSORIES,recvd_by as RECEIVEDBY," +
               "receipt_no as SERVICEID,recvd_date,est_chargs as CHARGES,recvd_time,imei_no,advance,balance";
    if(mode.equals("new"))
    {
        this.setTitle("Newly Arrived Handsets");
        newSqlQuery=newSqlQuery + " from complaint where receipt_no in " +
                "(select receipt_no from status where status = 'New')";
    }
    if(mode.equals("pending"))
    {
        this.setTitle("Pending Handsets");
        newSqlQuery=newSqlQuery + " from complaint where receipt_no in " +
                "(select receipt_no from status where status = 'Pending')";
    }
     if(mode.equals("completed"))
    {
        this.setTitle("Completed Handsets");
        newSqlQuery=newSqlQuery + " from complaint where receipt_no in " +
                "(select receipt_no from status where status = 'Completed')";
    }
     if(mode.equals("failed"))
    {
        this.setTitle("Failed/Cancelled Handsets");
        newSqlQuery=newSqlQuery + " from complaint where receipt_no in " +
                "(select receipt_no from status where status = 'Failed' or status='Cancelled')";
    }
     if(mode.equals("cdelivery"))
     {
         this.setTitle("Cancelled Deliveries");
        newSqlQuery="select * from cancelled";
     }
     


     StatusTable qtm;
       qtm=new StatusTable();
       qtm.setHostURL("jdbc:oracle:thin:digital/digital@//localhost:1521/XE");

       qtm.setQuery(newSqlQuery);
       jTable1.setModel(qtm);
        StatusRender r = new StatusRender();
jTable1.setDefaultRenderer(Object.class, r);
}
}

class StatusTable extends AbstractTableModel {
  Vector cache; // will hold String[] objects . . .

  int colCount;

  String[] headers;

  Connection db;

  Statement statement;

  String currentURL;

  public StatusTable() {
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
      colCount = meta.getColumnCount();

      // Now we must rebuild the headers array with the new column names
      headers = new String[colCount];
      for (int h = 1; h <= colCount; h++) {
        headers[h - 1] = meta.getColumnName(h);
      }

      // and file the cache with the records from our query. This would
      // not be
      // practical if we were expecting a few million records in response
      // to our
      // query, but we aren't, so we can do this.
      DateFormat df= new SimpleDateFormat("dd-MMM-yy");
      while (rs.next()) {
        String[] record = new String[colCount];
        for (int i = 0; i < colCount; i++) {

           if(i==7)
           {
              record[i] = df.format(rs.getDate(i+1));
           }
           else
           record[i] = rs.getString(i + 1);
        }
        cache.addElement(record);
      }
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
class StatusRender extends DefaultTableCellRenderer
{

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(!isSelected)
       {
           Color c = table.getBackground();
           if((row%2==0) && c.getRed()>10 && c.getGreen()>10 && c.getBlue()>10 )
             comp.setBackground(Color.WHITE);
           else
               comp.setBackground(new Color(238, 224, 229));
       }
       return comp;

    }

}
