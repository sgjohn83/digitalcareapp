/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginMain.java
 *
 * Created on Aug 29, 2015, 1:43:54 AM
 */

package serviceportal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sonytara
 */
public class LoginMain extends javax.swing.JFrame {

    /** Creates new form LoginMain */
    public LoginMain() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwdField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(serviceportal.ServicePortalApp.class).getContext().getResourceMap(LoginMain.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        userField.setText(resourceMap.getString("userField.text")); // NOI18N
        userField.setName("userField"); // NOI18N

        passwdField.setText(resourceMap.getString("passwdField.text")); // NOI18N
        passwdField.setName("passwdField"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "RECEPTIONIST", "TECHNICIAN" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        submitBtn.setText(resourceMap.getString("submitBtn.text")); // NOI18N
        submitBtn.setName("submitBtn"); // NOI18N
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel4.setBackground(resourceMap.getColor("jLabel4.background")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel4.foreground")); // NOI18N
        jLabel4.setIcon(resourceMap.getIcon("jLabel4.icon")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwdField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(userField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-645)/2, (screenSize.height-389)/2, 645, 389);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:

        String userName=userField.getText();
        String passwd=passwdField.getText();
        if(userName.equals("") || passwd.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter username and password","error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        con = DBConnection.getConnection();
        try
        {
            st=con.createStatement();
            if(jComboBox1.getSelectedItem().toString().equals("ADMIN"))
            {
                rs=st.executeQuery("select userid from users where userid='"+userName+"' and user_type='ADMIN' ");
                if(rs.next())
                {
                    rs=st.executeQuery("select passwd from users where passwd='"+passwd+"' and userid='"+userName+"'");
                    if(rs.next())
                    {
                        loginSession=true;
                        userType="ADMIN";
                        userSession=userName;
                        
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Wrong Password","Wrong Password",JOptionPane.ERROR_MESSAGE);
                    
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid UserName","Wrong UserName",JOptionPane.ERROR_MESSAGE);
                }

            }
            
            // Check authentication of receptionist
             if(jComboBox1.getSelectedItem().toString().equals("RECEPTIONIST"))
            {
                rs=st.executeQuery("select userid from users where userid='"+userName+"' and user_type='RECEPTIONIST' ");
                if(rs.next())
                {
                    rs=st.executeQuery("select passwd from users where passwd='"+passwd+"' and userid='"+userName+"'");
                    if(rs.next())
                    {
                        loginSession=true;
                        userType="RECEPTIONIST";
                        userSession=userName;
                        
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Wrong Password","Wrong Password",JOptionPane.ERROR_MESSAGE);
                    
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid UserName","Wrong UserName",JOptionPane.ERROR_MESSAGE);
                }

            }
            
            // Check authentication of Technicians
             if(jComboBox1.getSelectedItem().toString().equals("TECHNICIAN"))
            {
                rs=st.executeQuery("select userid from technician where userid='"+userName+"'");
                if(rs.next())
                {
                    rs=st.executeQuery("select passwd from technician where passwd='"+passwd+"' and userid='"+userName+"'");
                    if(rs.next())
                    {
                        loginSession=true;
                        userType="TECHNICIAN";
                        userSession=userName;
                        
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Wrong Password","Wrong Password",JOptionPane.ERROR_MESSAGE);
                    
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid UserName","Wrong UserName",JOptionPane.ERROR_MESSAGE);
                }

            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        if(!loginSession && count!=5)
        {
            count=count+1;

            return;
        }


       data[0]="true";
        data[1]=userSession;
        data[2]=userType;
        ServicePortalApp.setLoginDetails(data,count);

    }//GEN-LAST:event_submitBtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwdField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables

 private static boolean  loginSession=false;
 private static String userSession=null;
 private static String userType=null;
 String[] data=new String[10];
 private static int count=0;

 public void setButton()
 {
     this.getRootPane().setDefaultButton(submitBtn);
 }

}
