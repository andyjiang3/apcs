
/**
 * Using Scanner class, with its methods, to create a user input grade calculator
 *
 * @author Andy Jiang
 * @version 6/24/18
 */

import java.util.Scanner;
import java.lang.*;

public class GradesV3 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        
        int numTests = 0;
        int totalPoints = 0;
        double average = 0.0;
        
        
        
        
        System.out.println("Student's name (First and Last): ");
        String studentName = in.nextLine();
        System.out.println("Subject: ");
        String subject = in.next();
                        
        //Test #1
        System.out.println("Test #1 Score: ");      
        int testGrade1 = in.nextInt();
        
        numTests++;
        int totalPointAfterTest1 = testGrade1;
        totalPoints += testGrade1;
        double averageAfterTest1 = totalPointAfterTest1 / (double)numTests;
        
        
        //Test #2
        System.out.println("Test #2 Score: ");      
        int testGrade2 = in.nextInt();
          
        numTests++;
        int totalPointAfterTest2 = testGrade1 + testGrade2;
        totalPoints += testGrade2;             
        double averageAfterTest2 = totalPointAfterTest2 / (double)numTests;
        
        
        //Test #3
        System.out.println("Test #3 Score: ");      
        int testGrade3 = in.nextInt();
        
        System.out.println();
        System.out.println("Processing Report...");
        
        numTests++;
        int totalPointAfterTest3 = testGrade1 + testGrade2 + testGrade3 ;       
        totalPoints += testGrade3;
        average = totalPoints / (double)numTests;
        
        Thread.sleep(3000);
        
        System.out.println();
        System.out.println("=================================================");
        Thread.sleep(500);
        System.out.println();
        System.out.println("Student Name: " + studentName);
        Thread.sleep(500);
        System.out.println("Subject: " + subject);
        System.out.println();
        Thread.sleep(500);
        System.out.println("Test Scores: ");
        System.out.println();
        Thread.sleep(500);
        System.out.println("[#1] Score: " + testGrade1 + "  Total Points: " + totalPointAfterTest1 + "   Average: " + averageAfterTest1);
        Thread.sleep(500);
        System.out.println("[#2] Score: " + testGrade2 + "  Total Points: " + totalPointAfterTest2 + "  Average: " + averageAfterTest2);
        Thread.sleep(500);
        System.out.println("[#3] Score: " + testGrade3 + "  Total Points: " + totalPointAfterTest3 + "  Average: " + average);
        System.out.println();        
        Thread.sleep(500);
        System.out.println("Summary: ");
        Thread.sleep(500);
        System.out.println(" Total Points of 3 Tests: " + totalPoints);
        Thread.sleep(500);
        System.out.println(" Average of 3 Tests: " + average);    
        Thread.sleep(500);
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
        
       
    }
   
}
