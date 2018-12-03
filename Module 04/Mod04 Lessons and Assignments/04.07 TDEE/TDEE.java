
/**
 * Using BMR and AF, activity factor, it calculate TDEE by using user input
 *
 * @author Andy Jiang 
 * @version 7/11/18
 */

import java.util.Scanner;


public class TDEE {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean invalidChoice = false;
        
        System.out.println();
        System.out.print("Pleaes enter your name: ");
        String name = in.nextLine();
        System.out.println();
        
        
        System.out.print("Pleaes enter your BMR: ");
        String bMRString = in.next();
        int bMR = Integer.parseInt(bMRString);
        System.out.println();
        
       
        System.out.print("Pleaes enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();
        
        System.out.println();
        System.out.println("Select your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal movement, watching TV)");
        System.out.println("[C] Light (Sitting, Walking, Laundry)");
        System.out.println("[D] Moderate (Light manual labor, Dancing)");
        System.out.println("[E] Very Active (Hard manual labor, Team sports)");
        System.out.println("[F] Extremely Active (Heavy manual labor, Full-time athletes)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        System.out.println();
        String activityChoice = in.next();
        
        
        
        Double aF = 0.0;
        
        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("M")) {
            if (activityChoice.equalsIgnoreCase("A")) {
                aF = 1.0;
            } else if (activityChoice.equalsIgnoreCase("B")) {
                aF = 1.3;
            } else if (activityChoice.equalsIgnoreCase("C")) {
                 aF = 1.6;
            } else if (activityChoice.equalsIgnoreCase("D")) {
                 aF = 1.7;
            } else if (activityChoice.equalsIgnoreCase("E")) {
                 aF = 2.1;
            } else if (activityChoice.equalsIgnoreCase("F")) {
                 aF = 2.4;                                                         
            } else {
                invalidChoice = true;
                System.out.println();
                System.out.println("The choice you picked is not one of the activity level");
            }
        } else {
            if (gender.equalsIgnoreCase("A")) {
                aF = 1.0;
            } else if (activityChoice.equalsIgnoreCase("B")) {
                aF = 1.3;
            } else if (activityChoice.equalsIgnoreCase("C")) {
                 aF = 1.5;
            } else if (activityChoice.equalsIgnoreCase("D")) {
                 aF = 1.6;
            } else if (activityChoice.equalsIgnoreCase("E")) {
                 aF = 1.9;
            } else if (activityChoice.equalsIgnoreCase("F")) {
                 aF = 2.2;                                                         
            } else {
                invalidChoice = true;
                System.out.println();
                System.out.println("The choice you picked is not one of the activity level");
            }            
        }
        
        double tDEE = bMR * aF;
        if (!invalidChoice) {  
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Result: ");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + bMR);
        System.out.println("Activity Factor (AF): " + aF);
        System.out.println("TDEE: " + tDEE);
        System.out.println();
        System.out.println("=======================================");
       } else {
        return;
       }
    }   
   
}
