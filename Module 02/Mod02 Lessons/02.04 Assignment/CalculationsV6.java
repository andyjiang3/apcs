
/**
 * Write a description of class CalculationsV6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationsV6 {
    
   public static void main(String[ ] args) {
        
        // Declare integer variables
        int iANum1 = 25;
        int iANum2 = 9;
        int iSNum1 = 11;
        int iSNum2 = 9;
        int iSNum3 = 25;
        int iMNum1 = 25;
        int iMNum2 = 9;
        int iDNum1 = 9;
        int iDNum2 = 25;
        int iMoNum1 = 11;
        int iMoNum2 = 9;
        int iAddEqNum1 = 5; 
        int iAddEqNum2 = 13;
        int iAddEqNum3 = 40;
        
        double dANum1 = 43.21;
        double dANum2 = 3.14;
        double dSNum1 = 3.14;
        double dSNum2 = 10.0;
        double dMNum1 = 3.14;
        double dMNum2 = 10.0;
        double dMNum3 = 10.0;
        double dDNum1 = 43.21;
        double dDNum2 = 10.0;
        double dMoNum1 = 10.0;
        double dMoNum2 = 3.14;
        double dAddEqNum1 = 11.01; 
        double dAddEqNum2 = 200.45;
        double dAddEqNum3 = 30.10;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iANum1 + " + " + iANum2 + " = " + (iANum1 + iANum2));
        System.out.println(dANum1 + " + " + dANum2 + " = " + (dANum1 + dANum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iSNum1 + " - " + iSNum2 + " - " + iSNum3 + " = " + (iSNum1 - iSNum2 - iSNum3));
        System.out.println(dSNum1 + " - " + dSNum2 + " = " + (dSNum1 - dSNum2));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");       
        System.out.println(iMNum1 + " * " + iMNum2 + " = " + (iMNum1 * iMNum2)); 
        System.out.println(dMNum1 + " * " + dMNum2 + " * " + dMNum3 + " = " + (dMNum1 * dMNum2 * dMNum3));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iDNum1 + " / " + iDNum2 + " = " + (iDNum1 / iDNum2));
        System.out.println(dDNum1 + " / " + dDNum2 + " = " + (dDNum1 / dDNum2));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iMoNum1 + " % " + iMoNum2 + " = " + (iMoNum1 % iMoNum2));
        System.out.println(dMoNum1 + " % " + dMoNum2 + " = " + (dMoNum1 % dMoNum2));
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Additional Int Equations");
        
        System.out.println(iAddEqNum2 + " + " + iAddEqNum3 + " % " + iAddEqNum1 + " = " + (iAddEqNum2 + iAddEqNum3 % iAddEqNum1));
        System.out.println(iAddEqNum1 + " - " + iAddEqNum2 + " * " + iAddEqNum3 + " = " + (iAddEqNum1 - iAddEqNum2 * iAddEqNum3));
        System.out.println(iAddEqNum3 + " / " + iAddEqNum2 + " + " +iAddEqNum1 + " = " + (iAddEqNum3 - iAddEqNum2 - iAddEqNum1));
        System.out.println();
        
        //2.04 Additional double Equations
        System.out.println("Additional Double Equations");
        
        System.out.println(dAddEqNum3 + " / " + dAddEqNum2 + " + " + dAddEqNum1 + " = " + (dAddEqNum3 - dAddEqNum2 - dAddEqNum1));
        System.out.println(dAddEqNum2 + " + " + dAddEqNum3 + " % " + dAddEqNum1 + " = " + (dAddEqNum2 + dAddEqNum3 % dAddEqNum1));
        System.out.println(dAddEqNum1 + " - " + dAddEqNum2 + " * " + dAddEqNum3 + " = " + (dAddEqNum1 - dAddEqNum2 * dAddEqNum3));
        System.out.println();
        
    }
}
