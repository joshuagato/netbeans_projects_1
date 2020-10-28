package singleinstance;

/*
* Program for setting single instance in JAVA
* Copyright 2009 @ yuvadeveloper
* Code By:- Prashant Chandrakar
*
*/
import java.net.ServerSocket;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.io.IOException;
import java.net.BindException;

public class SingleInstance {
    
  public static ServerSocket serverSocket;
  public static String errortype = "Access Error";
  public static String error = "Application already running.....";
  public static void main(String as[])
  {
    try
    {
        //creating object of server socket and bind to some port number serverSocket = new ServerSocket(15486);
        ////do not put common port number like 80 etc.
        ////Because they are already used by system
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(200, 200);
     }
     catch (BindException exc)
     {
        JOptionPane.showMessageDialog(null, error, errortype, JOptionPane.ERROR_MESSAGE);
        System.exit(0);
     }
     catch (IOException exc)
     {
        JOptionPane.showMessageDialog(null, error, errortype, JOptionPane.ERROR_MESSAGE);
        System.exit(0);
     }
   }
    
    
    
}
