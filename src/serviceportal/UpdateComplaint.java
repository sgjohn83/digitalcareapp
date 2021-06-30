/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewComplaint.java
 *
 * Created on Aug 8, 2015, 1:36:39 AM
 */

package serviceportal;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author sgjohn
 */
public class UpdateComplaint extends javax.swing.JFrame {

    /** Creates new form NewComplaint */


    private static boolean copyName=false;
    private static String imageName="";
    private   boolean advanceUpdate=false;
    public UpdateComplaint() {


       
        initComponents();
        if(!ServicePortalApp.getUsername().equals("admin"))
       {
           est_charges.setEditable(false);
           advancetxt.setEditable(false);
           cashopt.setEnabled(false);
       }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        serviceid = new javax.swing.JTextField();
        cname2 = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        phoneModel = new javax.swing.JTextField();
        imeino = new javax.swing.JTextField();
        est_charges = new javax.swing.JTextField();
        recvdby = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        imgUploadbtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        advancetxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cashopt = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(serviceportal.ServicePortalApp.class).getContext().getResourceMap(UpdateComplaint.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(327, 23, 227, 22);

        updatebtn.setText(resourceMap.getString("updatebtn.text")); // NOI18N
        updatebtn.setName("updatebtn"); // NOI18N
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn);
        updatebtn.setBounds(580, 380, 130, 40);

        resetbtn.setText(resourceMap.getString("resetbtn.text")); // NOI18N
        resetbtn.setName("resetbtn"); // NOI18N
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn);
        resetbtn.setBounds(810, 380, 130, 40);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 190));

        jLabel3.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        serviceid.setEditable(false);
        serviceid.setText(resourceMap.getString("serviceid.text")); // NOI18N
        serviceid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        serviceid.setName("serviceid"); // NOI18N

        cname2.setText(resourceMap.getString("cname2.text")); // NOI18N
        cname2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cname2.setName("cname2"); // NOI18N

        contactno.setText(resourceMap.getString("contactno.text")); // NOI18N
        contactno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactno.setName("contactno"); // NOI18N

        phoneModel.setText(resourceMap.getString("phoneModel.text")); // NOI18N
        phoneModel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneModel.setName("phoneModel"); // NOI18N
        phoneModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneModelActionPerformed(evt);
            }
        });

        imeino.setText(resourceMap.getString("imeino.text")); // NOI18N
        imeino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imeino.setName("imeino"); // NOI18N

        est_charges.setText(resourceMap.getString("est_charges.text")); // NOI18N
        est_charges.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        est_charges.setName("est_charges"); // NOI18N

        recvdby.setText(resourceMap.getString("recvdby.text")); // NOI18N
        recvdby.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recvdby.setEnabled(false);
        recvdby.setName("recvdby"); // NOI18N

        jComboBox2.setName("jComboBox2"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, 237, Short.MAX_VALUE)
                    .addComponent(est_charges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(imeino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(contactno)
                        .addComponent(cname2)
                        .addComponent(serviceid, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                    .addComponent(phoneModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(recvdby, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(cname2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imeino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(est_charges, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(recvdby, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel2});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 60, 490, 410);

        jPanel2.setName("jPanel2"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jCheckBox1.setSelected(true);
        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText(resourceMap.getString("jCheckBox2.text")); // NOI18N
        jCheckBox2.setName("jCheckBox2"); // NOI18N

        jCheckBox4.setText(resourceMap.getString("jCheckBox4.text")); // NOI18N
        jCheckBox4.setName("jCheckBox4"); // NOI18N

        jCheckBox3.setText(resourceMap.getString("jCheckBox3.text")); // NOI18N
        jCheckBox3.setName("jCheckBox3"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jComboBox1.setName("jComboBox1"); // NOI18N

        jLabel12.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        imgUploadbtn.setText(resourceMap.getString("imgUploadbtn.text")); // NOI18N
        imgUploadbtn.setName("imgUploadbtn"); // NOI18N
        imgUploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgUploadbtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(resourceMap.getFont("jLabel13.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N

        advancetxt.setText(resourceMap.getString("advancetxt.text")); // NOI18N
        advancetxt.setName("advancetxt"); // NOI18N

        jLabel14.setFont(resourceMap.getFont("jLabel13.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        cashopt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Direct Cash", "UPI" }));
        cashopt.setName("cashopt"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgUploadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(advancetxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cashopt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox1)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox3)
                        .addComponent(jCheckBox4))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(advancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cashopt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(imgUploadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(520, 60, 480, 290);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1024)/2, (screenSize.height-600)/2, 1024, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneModelActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        DateFormat df = new SimpleDateFormat("dd-MMM-yy");
        DateFormat dt = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        String cname1 = cname2.getText();
        String contact_no = contactno.getText();
        String phone_model = phoneModel.getText();
        String compl_name = jComboBox2.getSelectedItem().toString();
        String recvd_accr = "";
        String recvd_by = recvdby.getText();
        String receipt_no;
        String recvd_date = df.format(cal.getTime());
        String est_charges1 = est_charges.getText();
        String recvd_time = dt.format(cal.getTime());
        String imei_no = imeino.getText();
        String tech = jComboBox1.getSelectedItem().toString();
        String advancestr = advancetxt.getText();
        int cashMode = cashopt.getSelectedIndex();


        if(jCheckBox1.isSelected())
        {
            recvd_accr=jCheckBox1.getText();
        }
        if(jCheckBox2.isSelected())
        {
            recvd_accr = recvd_accr + ","+ jCheckBox2.getText();
        }
        if(jCheckBox3.isSelected())
        {
            recvd_accr = recvd_accr + ","+ jCheckBox3.getText();
        }
        if(jCheckBox4.isSelected())
        {
            recvd_accr = recvd_accr + ","+ jCheckBox4.getText();
        }
        
        int balance = Integer.parseInt(est_charges1)-Integer.parseInt(advancestr);
        String  sqlQuery="update complaint set cname= '"+cname1+"',contact_no='"+contact_no+"',phone_model='"+phone_model+
                    "',complaint_name='"+compl_name+"',recvd_accr='" +recvd_accr+"',recvd_by='"+recvd_by+
                    "',est_chargs='"+est_charges1+"',assigned_to='"+tech+"',imei_no='"+imeino.getText()+"', advance="+Integer.parseInt(advancestr)+",balance="+balance+"  where receipt_no = '"+serviceid.getText()+"'";
        if(copyName)
        {
            sqlQuery="update complaint set cname= '"+cname1+"',contact_no='"+contact_no+"',phone_model='"+phone_model+
                    "',complaint_name='"+compl_name+"',recvd_accr='" +recvd_accr+"',recvd_by='"+recvd_by+
                    "',est_chargs='"+est_charges1+"',assigned_to='"+tech+"',image_names='"+imageName+"',imei_no='"+imeino.getText()+"', advance="+Integer.parseInt(advancestr)+",balance="+balance+" where receipt_no = '"+serviceid.getText()+"'";
        }


       

       String i= StringTrim.trim(new StringBuilder(recvd_accr), ',');
       recvd_accr=i;
       try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:digital/digital@//localhost:1521/XE");
            Statement sa = con.createStatement();
           
            if(serviceid.getText().equals("") || serviceid==null)
                return;

           
           int j = sa.executeUpdate(sqlQuery);
           String c1= cashMode==0 ? "Direct Cash" : "UPI";
           System.out.println("insert into payments values('"+serviceid.getText()+"',"+Integer.parseInt(advancestr)+",advance,'"+recvd_date+"','"+recvd_time+"','"+recvd_by+"','"+ c1+"')");
           if(advanceUpdate)
           {
              // JOptionPane.showMessageDialog(null,"Change of payment details");
               sa.executeUpdate("delete from payments where serviceid="+serviceid.getText());
               sa.executeUpdate("insert into payments values('"+serviceid.getText()+"',"+Integer.parseInt(advancestr)+",'advance','"+recvd_date+"','"+recvd_time+"','"+recvd_by+"','"+ c1+"')");
           }

          if(j==0)
          {
              JOptionPane.showMessageDialog(null,"Update Error","Error",JOptionPane.ERROR_MESSAGE);
          }

           JOptionPane.showMessageDialog(this,"Database Updated Successfully");
           this.dispose();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error", 0);
        }

    }//GEN-LAST:event_updatebtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        
         contactno.setText(null);
         phoneModel.setText(null);
         recvdby.setText(null);
         est_charges.setText(null);
         
    }//GEN-LAST:event_resetbtnActionPerformed

    private void imgUploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgUploadbtnActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        ImagePreviewPanel imp = new ImagePreviewPanel();
        jf.setAccessory(imp);
        jf.addPropertyChangeListener(imp);
        int retvalue=jf.showOpenDialog(null);
        File getSelectedFile=null;
        if(retvalue==JFileChooser.APPROVE_OPTION)
        {
            getSelectedFile = jf.getSelectedFile();
        }
        //Check Dest Folder exist or not
        File destFolder = new File("images");
        if(!destFolder.exists())
        {
            System.out.println("Creating image dest folder");
            destFolder.mkdir();
        }
       //check filename exist in dest
        File destFile= new File("images/"+getSelectedFile.getName());
        BufferedImage img=null;
        if(destFile.exists())
        {
            copyName=false;
            JOptionPane.showMessageDialog(null, "File name already exist","error",JOptionPane.ERROR_MESSAGE);
             return;
        }
        else
        {
            //create dest file
            String s=getSelectedFile.getName();
            imageName=s;
            try
            {
                img= ImageIO.read(getSelectedFile);
                int index=s.lastIndexOf('.');
                
                ImageIO.write(img, s.substring(index+1), new File("images/"+getSelectedFile.getName()));
                JOptionPane.showMessageDialog(this,"Image Upload Successfull");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            //Copy file name to the Database
            copyName=true;
        }
        
    }//GEN-LAST:event_imgUploadbtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateComplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField advancetxt;
    private javax.swing.JComboBox cashopt;
    private javax.swing.JTextField cname2;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField est_charges;
    private javax.swing.JTextField imeino;
    private javax.swing.JButton imgUploadbtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phoneModel;
    private javax.swing.JTextField recvdby;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField serviceid;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

   
public int setServiceID(String sid)
{
    serviceid.setText(sid);
    int i=-1;
    Connection con;
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:digital/digital@//localhost:1521/XE");
            Statement stmt = con.createStatement();
        ResultSet rs =    stmt.executeQuery("select * from complaint where receipt_no " +
                    "like '%"+serviceid.getText()+"%'");

       
        String parts="";
        String tech="";
        int a=0;
        while(rs.next())
        {
           cname2.setText(rs.getString("cname"));
           contactno.setText(rs.getString("contact_no"));
           phoneModel.setText(rs.getString("phone_model"));
           jComboBox2.setSelectedItem(rs.getString("complaint_name"));
           recvdby.setText(rs.getString("recvd_by"));
           est_charges.setText(rs.getString("est_chargs"));
           imeino.setText(rs.getString("imei_no"));
           advancetxt.setText(rs.getString("advance"));
           a=rs.getInt("advance");
           parts=rs.getString("recvd_accr");
           tech=rs.getString("assigned_to");
           i=0;
        }
        if(a==0)
            advanceUpdate=true;
        String[] accr = parts.split(",");
        for(int x=0;x<accr.length;x++)
        {
            if(jCheckBox1.getText().equals(accr[x]))
                    jCheckBox1.setSelected(true);
            else if(jCheckBox2.getText().equals(accr[x]))
                    jCheckBox2.setSelected(true);
            else if(jCheckBox3.getText().equals(accr[x]))
                    jCheckBox3.setSelected(true);
            else if(jCheckBox4.getText().equals(accr[x]))
                    jCheckBox4.setSelected(true);
        }

       rs= stmt.executeQuery("select * from payments where type='advance' and serviceid='"+serviceid.getText()+"'");
       String mode="";
       while(rs.next())
       {
           mode=rs.getString("cashmode");
       }

       if(mode.equals("Direct Cash"))
       {
           cashopt.setSelectedIndex(0);
       }
       else
           cashopt.setSelectedIndex(1);


       if(i==-1)
        {
            JOptionPane.showMessageDialog(null, "Service Id not available","error",JOptionPane.ERROR_MESSAGE);
            return i;
        }
        rs=stmt.executeQuery("select userid from technician");
        String uid;
        while(rs.next())
        {
            uid=rs.getString("userid");
            jComboBox1.addItem(uid);
        }
         if(tech!=null)
            {
                jComboBox1.setSelectedItem(tech);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    return  0;
}
 public void loadCombo()
    {
        Connection connection=null;
        Statement statement= null;
        ResultSet rs= null;

        try
        {
           connection=DBConnection.getConnection();
           statement=connection.createStatement();
           rs=statement.executeQuery("select complaint_name from clist order by complaint_name asc");
           while(rs.next())
           {
               jComboBox2.addItem(rs.getString("complaint_name"));
           }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}


