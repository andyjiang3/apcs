
/**
 * Calculation of Body Mass Index using if-else-if statement and Scanner class.
 *
 * @author Andy Jiang
 * @version 7/2/18
 */

import java.util.Scanner;


public class BMI {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        
        System.out.println();
        System.out.print("Name (First Last): ");
        String first = in.next();
        String last = in.nextLine();
        
        
        System.out.println();
        System.out.print("Height (Feet Inches): ");
        String feetString = in.next();
        String inchesString = in.nextLine().substring(1);
        
        
        System.out.println();
        System.out.print("Weight (Pounds): ");
        String weightString = in.next();
        System.out.println();
        
        // Converting correct type
        
        int feet = Integer.parseInt(feetString);
        int inches = Integer.parseInt(inchesString);
        int weight = Integer.parseInt(weightString);
        
        //Converting to nesscary units
        
        double feetToMeters = (feet * 12 * 2.54) / 100; 
        double inchesToMeters = (inches * 2.54) / 100; 
        double heightInMeters = feetToMeters + inchesToMeters;
        double weightInKg = 0.45359237 * weight;
        
        double bMI = weightInKg / (heightInMeters * heightInMeters);
        
        String category;
        
        if (bMI < 18.5) {
            
            category = "Underweight";
            
        } else if (bMI < 24.9) {
            
            category = "Normal or Healthy Weight";
            
        } else if (bMI < 29.9) {
            
            category = "Overweight";
            
        } else {
            
            category = "Obese";                      
        
        }
        
        System.out.println();
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Name: " + first + " " + last);
        System.out.println("Height (m): " + heightInMeters);
        System.out.println("Weight (kg): " + weightInKg);
        System.out.println("BMI: " + bMI);
        System.out.println("Category: " + category);
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");
        
    }
   
}
