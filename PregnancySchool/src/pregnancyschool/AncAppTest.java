package pregnancyschool;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class AncAppTest {
    private static int tkWidth;
    private static int tkHeight;
    public static RealAppFrame realAppFrame;
    
    public static void main(String[] args) {
        
        try{
            //Set System l&F
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch(Exception exception){
                exception.printStackTrace();
        }
        
        //pswd = new PasswordUtils();
             
        
        // /*  */
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        tkWidth = ((int) toolkit.getScreenSize().getWidth());
        tkHeight = ((int) toolkit.getScreenSize().getHeight());
        
        realAppFrame = new RealAppFrame();
        realAppFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //realAppFrame.addWindowListener(new java.awt.event.WindowAdapter() {
        realAppFrame.addWindowListener(new WindowAdapter() {
        //@Override
        
            public void windowClosing(WindowEvent windowEvent) {
                int dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?","WARNING",JOptionPane.YES_NO_OPTION);
                if(dialogButton == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
                else{
                    //JOptionPane.showMessageDialog(null, "The Username and Password do not match! \n Please check and try again!", "Username & Password Mismatch", JOptionPane.ERROR_MESSAGE);
                    //dispose();
                    //JDialog.remove(dialogButton);
                }
            }
        });
        
        
        realAppFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //realAppFrame.setLocationRelativeTo(null);
        realAppFrame.setSize(tkWidth, tkHeight);
        realAppFrame.setVisible(true);
        //realAppFrame.setEnabled(false);
        
        
        /*LoginFrame loginFrame = new LoginFrame();
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        //loginFrame.getContentPane().setOpaque(false);*/
        
        LoginDialog loginDlg = new LoginDialog(realAppFrame);
        loginDlg.setVisible(true);
        //loginDlg.setDefaultCloseOperation(System.exit(0));
        loginDlg.setSize(300,100);
        loginDlg.setLayout(new FlowLayout());        
    }
}
