package gpacalculator;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MethodsClass {
    
    public static double getGradePoint(int gradeIndex) {
            
        double gradePoint = 0;
        
        if(gradeIndex == 1) gradePoint = 4.0;
        else if(gradeIndex == 2) gradePoint = 3.5;
        else if(gradeIndex == 3) gradePoint = 3.0;
        else if(gradeIndex == 4) gradePoint = 2.5;
        else if(gradeIndex == 5) gradePoint = 2.0;
        else if(gradeIndex == 6) gradePoint = 1.5;
        else if(gradeIndex == 7) gradePoint = 1.0;
        else if(gradeIndex == 8) gradePoint = 0;

        return gradePoint;
    }
    
    
    
    public static int getCreditHours(int hoursIndex) {
        int creditHours = 0;
        
        if(hoursIndex == 1) creditHours = 1;
        else if(hoursIndex == 2) creditHours = 2;
        else if(hoursIndex == 3) creditHours = 3;
        else if(hoursIndex == 4) creditHours = 4;
        else if(hoursIndex == 5) creditHours = 5;
        else if(hoursIndex == 6) creditHours = 6;
        
        return creditHours;
    }
    
    
    
    public static void resetIndex(JComboBox grade1, JComboBox grade2, JComboBox grade3, JComboBox grade4, JComboBox hour1,
            JComboBox hour2, JComboBox hour3, JComboBox hour4) {
        
        grade1.setSelectedIndex(0); grade2.setSelectedIndex(0); grade3.setSelectedIndex(0); grade4.setSelectedIndex(0);
        hour1.setSelectedIndex(0);  hour2.setSelectedIndex(0);  hour3.setSelectedIndex(0);  hour4.setSelectedIndex(0);
    }
    
    
    
    public static double[] calaculate(JComboBox hoursCombo, JComboBox gradeCombo, int selected, int counter, double product,
            int creditHours, double gradePoint, int courseNumber) {
        
        if(hoursCombo.getSelectedIndex()>0 && gradeCombo.getSelectedIndex()>0){
            selected = 1;
            counter = creditHours;
            product = creditHours * gradePoint;
        }
        else if(hoursCombo.getSelectedIndex()==0 && gradeCombo.getSelectedIndex()==0){
            selected = 0;
            counter = 0;
            product = 0;
        }
        else if(hoursCombo.getSelectedIndex()>0 && gradeCombo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Please select a grade for course " + courseNumber, "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(hoursCombo.getSelectedIndex()==0 && gradeCombo.getSelectedIndex()>0){
            JOptionPane.showMessageDialog(null, "Please select credit hours for course " + courseNumber, "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
        
        double[] result = {selected, counter, product};
        
        return result;
    }
    
    
    public static String courses(int totalNumber) {
        
        if(totalNumber == 0) {
            return totalNumber + " Courses is: ";
        }
        else if(totalNumber == 1) {
            return totalNumber + " Course is: ";
        }
        else {
            return totalNumber + " Courses is: ";
        }
    }
    
}
