package gpacalculator;

//import javafx.scene.paint.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CalculatorFrame extends JFrame {
    
        public double c1gradePoint,c2gradePoint,c3gradePoint,c4gradePoint; //private double gradePoint1;
        public int c1gradeIndex,c2gradeIndex,c3gradeIndex,c4gradeIndex;
        public int c1creditHours,c2creditHours,c3creditHours,c4creditHours; //private int creditHours1;
        public int c1HourIndex,c2HourIndex,c3HourIndex,c4HourIndex;
        public int c1counter,c2counter,c3counter,c4counter;
        public double totalProduct, c1product,c2product,c3product,c4product;
        public int selected1, selected2,selected3,selected4;
        public int counterSum, selectedSum;
        public double gpa;
        public Color ltGray = new Color(214,220,219);
        public Color ltGreen = new Color(152,233,215);
        
    
    public CalculatorFrame() {
        super("GPA Calculator");
        
        //Creating a Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        //Creating a Panel and appending to first tab
        JPanel tab1Panel = new JPanel();
        tab1Panel.setLayout(null);
        //tab1Panel.setBackground(ltGray);
        tabbedPane.addTab("Calculate Semester GPA", null, tab1Panel, "Semester GPA");
        
        
        //Creating a Label and two Combo boxes for Course 1
        JLabel course1label = new JLabel("Course 1");
        tab1Panel.add(course1label);
        course1label.setBounds(10,15,60,25);
        
        double gp [] = {0, 4.0, 1.5};
        String pg = null;
        
        String hours [] = {"Select Hours","1","2","3","4","5","6"};
        JComboBox course1hours = new JComboBox(hours);
        course1hours.setMaximumRowCount(4);
        course1hours.setBounds(70,15,100,25);
        tab1Panel.add(course1hours);
        course1hours.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED);
                        c1HourIndex = course1hours.getSelectedIndex();

                        // Method for getting the credit hours
                        c1creditHours = MethodsClass.getCreditHours(c1HourIndex);
                }
            }
        );
        
        
        
        String grades [] = {"Select Grade","A","B+","B","C+","C","D+","D","E"};
        JComboBox course1Grade = new JComboBox(grades);
        course1Grade.setMaximumRowCount(4);
        course1Grade.setBounds(180,15,100,25);
        tab1Panel.add(course1Grade);
        course1Grade.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c1gradeIndex = course1Grade.getSelectedIndex();
                        
                        // Method for getting the gradepoint
                        c1gradePoint = MethodsClass.getGradePoint(c1gradeIndex);
                    }
                }
            }
        );
        
               
        
        
        
        //Creating a Label and two Combo boxes for Course 2
        JLabel course2label = new JLabel("Course 2");
        course2label.setBounds(300,15,60,25);
        tab1Panel.add(course2label);
        
        JComboBox course2hours = new JComboBox(hours);
        course2hours.setMaximumRowCount(4);
        course2hours.setBounds(360,15,100,25);
        tab1Panel.add(course2hours);
        course2hours.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c2HourIndex = course2hours.getSelectedIndex();

                        c2creditHours = MethodsClass.getCreditHours(c2HourIndex);
                    }
                }
            }
        );

        JComboBox course2Grade = new JComboBox(grades);
        course2Grade.setMaximumRowCount(4);
        course2Grade.setBounds(470,15,100,25);
        tab1Panel.add(course2Grade);
        course2Grade.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c2gradeIndex = course2Grade.getSelectedIndex();
                        
                        c2gradePoint = MethodsClass.getGradePoint(c2gradeIndex);
                    }
                }
            }
        );
        
        
        
        
        
        
        
        //Creating a Label and two Combo boxes for Course 3
        JLabel course3label = new JLabel("Course 3");
        course3label.setBounds(10,55,60,25);
        tab1Panel.add(course3label);
        
        JComboBox course3hours = new JComboBox(hours);
        course3hours.setMaximumRowCount(4);
        course3hours.setBounds(70,55,100,25);
        tab1Panel.add(course3hours);
        course3hours.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c3HourIndex = course3hours.getSelectedIndex();
                        
                        c3creditHours = MethodsClass.getCreditHours(c3HourIndex);
                    }
                }
            }
        );
        
        JComboBox course3Grade = new JComboBox(grades);
        course3Grade.setMaximumRowCount(4);
        course3Grade.setBounds(180,55,100,25);
        tab1Panel.add(course3Grade);
        course3Grade.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c3gradeIndex = course3Grade.getSelectedIndex();
                        
                        c3gradePoint = MethodsClass.getGradePoint(c3gradeIndex);
                    }
                }
            }
        );
        
        
        
        
        //Creating a Label and two Combo boxes for Course 4
        JLabel course4label = new JLabel("Course 4");
        course4label.setBounds(300,55,60,25);
        tab1Panel.add(course4label);
        
        JComboBox course4hours = new JComboBox(hours);
        course4hours.setMaximumRowCount(4);
        course4hours.setBounds(360,55,100,25);
        tab1Panel.add(course4hours);
        course4hours.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c4HourIndex = course4hours.getSelectedIndex();
                        
                        c4creditHours = MethodsClass.getCreditHours(c4HourIndex);
                    }
                }
            }
        );
        
        JComboBox course4Grade = new JComboBox(grades);
        course4Grade.setMaximumRowCount(4);
        course4Grade.setBounds(470,55,100,25);
        tab1Panel.add(course4Grade);
        course4Grade.addItemListener(
            new ItemListener(){
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange()==ItemEvent.SELECTED){
                        c4gradeIndex = course4Grade.getSelectedIndex();
                        
                        c4gradePoint = MethodsClass.getGradePoint(c4gradeIndex);
                    }
                }
            }
        );
        
        
        
        
        JButton clear = new JButton("Clear");
        tab1Panel.add(clear);
        clear.setBounds(360,95,100,25);
        clear.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    
                    MethodsClass.resetIndex(course1Grade, course2Grade, course3Grade, course4Grade, course1hours, course2hours,
                            course3hours, course4hours);
                }
            }
        );
        
        
        
        
        
        JButton calculate = new JButton("Calculate");
        tab1Panel.add(calculate);
        calculate.setBounds(470,95,100,25);
        calculate.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    
                    
                    
                    double course1Result[] = MethodsClass.calaculate(course1hours, course1Grade, selected1, c1counter, c1product, c1creditHours, c1gradePoint, 1);
                    double course2Result[] = MethodsClass.calaculate(course2hours, course2Grade, selected2, c2counter, c2product, c2creditHours, c2gradePoint, 2);
                    double course3Result[] = MethodsClass.calaculate(course3hours, course3Grade, selected3, c3counter, c3product, c3creditHours, c3gradePoint, 3);
                    double course4Result[] = MethodsClass.calaculate(course4hours, course4Grade, selected4, c4counter, c4product, c4creditHours, c4gradePoint, 4);
                    
                    selectedSum = (int) (course1Result[0] + course2Result[0] + course3Result[0] + course4Result[0]);
                    counterSum = (int) (course1Result[1] + course2Result[1] + course3Result[1] + course4Result[1]);
                    totalProduct = course1Result[2] + course2Result[2] + course3Result[2] + course4Result[2];
                    gpa = totalProduct/counterSum;
                    
                    JOptionPane.showMessageDialog(null, "The GPA of the " + MethodsClass.courses(selectedSum) + gpa, "Grade Point Average", JOptionPane.PLAIN_MESSAGE);
                    
                }
            }
        );
        
        
        
        
        
        
        JPanel tab2Panel = new JPanel();
        //tab2Panel.setBackground(ltGray);
        tabbedPane.addTab("Calculate Yearly CGPA", null, tab2Panel, "Yearly CGPA");
        
        JInternalFrame tab3Panel = new JInternalFrame("Internal Frame",true,true,true,true);
        tab3Panel.setVisible(true);
        //tab3Panel.setBackground(Color.cyan);
        tabbedPane.addTab("Check Your Summary", null, tab3Panel, "Summary Check");
        
        add(tabbedPane);
    }
    
    
    
    
    
    
    
    
}
