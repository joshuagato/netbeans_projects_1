
package consoleaddition;

import java.util.Scanner;

public class ConsoleAddition {

    
    
    public static void main(String[] args) {
        //int val = 1;
        String val = "y";

        //while(val != 0){
        while(!val.equals("n")){

            //Scanner sc;
            Scanner sc = new Scanner(System.in);
            Scanner valSc = new Scanner(System.in);

            System.out.println("");
            System.out.println("----------------------------------------------------------------");
            System.out.println("");

            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter second number: ");
            double secondNumber = sc.nextInt();

            double sum = firstNumber + secondNumber;
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

            System.out.println("");
            System.out.println("----------------------------------------------------------------");
            System.out.println("");

            System.out.print("Do you wanna perform another addition? 'Yes=y' or 'No=n': ");
            //val = sc.nextInt();
            val = valSc.next();  //val = valSc.nextLine();

            if (val.equals("n")){
                    System.out.println("");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("END OF PROGRAM!");
            }

        }
 
    }//end of method main
    
}// end of class ConsoleAddition
