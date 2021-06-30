/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serviceportal;

/**
 
 * @author sgjohn
 */
import java.awt.Container;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class printClass extends JFrame{

    HashMap hm = null;
    Connection con = null;
    String reportName="digital.jasper";

    public printClass()  {
       setExtendedState(MAXIMIZED_BOTH);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public printClass(HashMap map) {
        this.hm = map;
        setExtendedState(MAXIMIZED_BOTH);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

     public printClass(HashMap map,Connection con) {
        this.hm = map;
        this.con=con;
        setExtendedState(MAXIMIZED_BOTH);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       setTitle("Report Viewer");
    }
     public void callReport()
     {
         JasperPrint jasperPrint = generateReport();
        JasperViewer.viewReport(jasperPrint, false);
        // JRViewer viewer = new JRViewer(jasperPrint);
       //  Container c = getContentPane();
        // c.add(viewer);
        // this.setVisible(true);
     }
   public void setreportName(String rptname)
   {
       this.reportName=rptname;
   }
    public  JasperPrint generateReport() {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:digital/digital@//localhost:1521/XE");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }


        JasperPrint jasperPrint  = null;
        if(hm==null)
            hm=new HashMap();
        try
        {
       
            jasperPrint = JasperFillManager.fillReport(reportName,hm,con);

        }
        catch(JRException e)
        {

            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

        }
        return jasperPrint;
    }



}
