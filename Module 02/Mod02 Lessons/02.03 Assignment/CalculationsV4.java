
/**
 * Simple arithmetic calculations using code, including using declarations and substitutions.
 *
 * @author Andy Jiang
 * @version 6/8/18
 */
public class CalculationsV4 {
    
     public static void main(String[ ] args) {
        
        // Declare integer variables
        int aNum1 = 25;
        int aNum2 = 9;
        int sNum1 = 11;
        int sNum2 = 9;
        int sNum3 = 25;
        int mNum1 = 25;
        int mNum2 = 9;
        int dNum1 = 9;
        int dNum2 = 25;
        int moNum1 = 11;
        int moNum2 = 9;
        int addEqNum1 = 5; 
        int addEqNum2 = 13;
        int addEqNum3 = 40;
        
        // Addition
        System.out.println("Addition");
        System.out.println(aNum1 + " + " + aNum2 + " = " + (aNum1 + aNum2));
        System.out.println(43.21 + " + " + 3.14 + " = " + (43.21 + 3.14));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(sNum1 + " - " + sNum2 + " - " + sNum3 + " = " + (sNum1 - sNum2 - sNum3));
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");       
        System.out.println(mNum1 + " * " + mNum2 + " = " + (mNum1 * mNum2)); 
        System.out.println( "3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(dNum1 + " / " + dNum2 + " = " + (dNum1 / dNum2));
        System.out.println( "43.21 / 10.0 = " +  (43.21 / 10.0) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(moNum1 + " % " + moNum2 + " = " + (moNum1 % moNum2));
        System.out.println( "10.0 % 3.14 = " + (10.0 % 3.14) );
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Additional Int Equations");
        
        System.out.println(addEqNum2 + " + " + addEqNum3 + " % " + addEqNum1 + " = " + (addEqNum2 + addEqNum3 % addEqNum1));
        System.out.println(addEqNum1 + " - " + addEqNum2 + " * " + addEqNum3 + " = " + (addEqNum1 - addEqNum2 * addEqNum3));
        System.out.println(addEqNum3 + " / " + addEqNum2 + " + " + addEqNum1 + " = " + (addEqNum3 - addEqNum2 - addEqNum1));
        
        //2.04 Additional double Equations
    }
   
}
