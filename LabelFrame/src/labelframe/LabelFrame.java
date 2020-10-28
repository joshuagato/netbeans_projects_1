package LabelFrame;

import javax.swing.*;
import java.awt.*;


public class LabelFrame extends JFrame{
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
        
        public LabelFrame(){
            super("Testing JLabel");
            setLayout(new FlowLayout());
            
            //ImageIcon img = new ImageIcon("bug1.jpg");
            ImageIcon img = new ImageIcon(getClass().getResource("bug2.png"));
            setIconImage(img.getImage());
            
            // JLabel constructor with a string argument
            label1 = new JLabel("Label with text");
            label1.setToolTipText("This is label1");
            add(label1);
            
            // JLabel constructor with string, Icon and alignment arguments
            Icon bug = new ImageIcon(getClass().getResource("bug1.jpg"));
            label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT );
            label2.setToolTipText("This is label2");
            add(label2);
            
            label3 = new JLabel();
            label3.setText("Label with icon and text at bottom");
            label3.setIcon(bug);
            label3.setHorizontalTextPosition(SwingConstants.CENTER);
            label3.setVerticalTextPosition(SwingConstants.BOTTOM);
            label3.setToolTipText("This is label3");
            add(label3);
        }
}