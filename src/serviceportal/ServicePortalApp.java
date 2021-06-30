/*
 * ServicePortalApp.java
 */

package serviceportal;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class ServicePortalApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new ServicePortalView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of ServicePortalApp
     */
    public static ServicePortalApp getApplication() {
        return Application.getInstance(ServicePortalApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {

       
        try
        {
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        LoginMain loginmain = new LoginMain();
        loginmain.setButton();
        loginmain.setVisible(true);
           
        while(!loginSession)
        {
           //do nothing
        }
        loginmain.dispose();
        

        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       

     if(count1==5)
     {
         JOptionPane.showMessageDialog(null, "Exceeded Maximum Tries","Error",JOptionPane.ERROR_MESSAGE);
         System.exit(1);
     }
      JOptionPane.showMessageDialog(null, "Login Successfull");
       launch(ServicePortalApp.class, args);

    }
    private static String username=null;
    private static String userType=null;
    private static boolean loginSession=false;
    private static int count1=0;
    public static void setLoginDetails(String[] d,int count)
    {
        if(d[0].equals("true"))
            loginSession=true;
        username=d[1];
        userType=d[2];
        count1=count;


    }

    public static String getUsername()
    {
        return username;
    }
    public static String getUserType()
    {
        return userType;
    }


}
