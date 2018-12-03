
/**
 * Using the Scanner Class, String Class, and other methods to create a online purchase shop.
 *
 * @author Andy Jiang
 * @version 6/24/18
 */

import java.util.Scanner;

public class BuyCandy {
  public static void main(String[] args) throws Exception {
        //Creating scanner
        Scanner in = new Scanner(System.in);
        
        //Welcome part
        System.out.println();
        System.out.println("=============[Welcome to InternetCandy]=============");
        
        
        //Basic info about shopper
        System.out.print("Please enter name (First Last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.println();
        
        System.out.print("Please enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        int day = Integer.parseInt(date.substring(0,2));
        int month = Integer.parseInt(date.substring(3,5));
        int year = Integer.parseInt(date.substring(6));
        System.out.println();
        
        //What shopper want
        System.out.println();
        System.out.println("Please pick from candy options (Name one): ");
        System.out.println("*KitKat ($1.25)         *Butterfinger ($0.75)");
        System.out.println("*Skittles ($1.50)       *M&Ms ($1.25)");
        System.out.println("*Snickers ($1.50)       *Hershey ($1.75)");
        System.out.println("*Smarties ($0.50)       *Twix ($1.25)");
        System.out.println();
        String candy = in.next();
        
        System.out.println();
        System.out.print("Please enter the amount of " + candy + " ($): ");
        String amountOfCandy = in.next();
        int amount = Integer.parseInt(amountOfCandy);
        System.out.println();
        
        System.out.print("Please enter the price of item ($): ");
        String priceOfItemString = in.next();
        double priceOfItem = Double.parseDouble(priceOfItemString);
        System.out.println();
        
        //Shopper card info
        System.out.print("Please enter your debit card number (#####-###-####): ");
        String debitCardNumberString = in.next();
        String debitCardNumber = debitCardNumberString.replaceAll("-", ""); //When add by a number, it adds it to this value.
        //System.out.println(debitCardNumber + 5);                            //So looks like already int after removing -
        System.out.println();                                               //as parsing it lead to error
        
        System.out.print("Please enter your Pin Number (####): ");
        String pinString = in.next();
        int pin = Integer.parseInt(pinString);
        System.out.println(); 
        
        System.out.println(); 
        System.out.print("Processing Recipe...");
        System.out.println(); 
        Thread.sleep(3000);
        
        //Recipe
        System.out.println("==================================================");
        System.out.println("e-Recipe");
        System.out.println("");
        System.out.println(day + "-" + month + "-" + year);
        String order = firstName.substring(0,1) + lastName.substring(1,2) + candy.substring(0,1) + day + month + amount;
        System.out.println("Order #: "+ order);
        System.out.println();
        
        System.out.println(" " + firstName.substring(0,1) + "." + lastName);
        System.out.println(" Account: #####-###-" + debitCardNumber.substring(8));
        System.out.println(" Candy: " + candy);
        System.out.println(" Quantity: " + amount);
        System.out.println(" Price: $" + priceOfItem);
        
        double totalPrice = priceOfItem * amount;    // Calculating amount
        
        System.out.println();
        System.out.println(" $" + totalPrice + " will be debited to your account.");
        System.out.println();
        System.out.println("Thank you for buying at InternetCandy.");
        System.out.println("==================================================");
        
        
        
    }
}
