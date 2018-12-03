/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Andy Jiang (replace with your name)
 * @version 06/22/18       (replace with today's date)
 */
public class CurrencyV1 {
    
    public static void main(String [ ] args) {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 23857.97;            // Mexican Pesos spent
        double pesoExchangeRate = 19.19;     // 1 US dollar = 19.19 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;        // US dollars remaining after Mexico
        //remaining variables below here
        
        double sterlingsSpent = 1093.06;            // Great Britain Pound Sterling spent
        double sterlingExchangeRate = 0.71;     // 1 US dollar = 0.71 Sterling
        double dollarsSpentInGreatBritain = sterlingsSpent / sterlingExchangeRate; // US dollars spent in Great Britain
        double dollarsAfterGreatBritain = dollarsAfterMexico - dollarsSpentInGreatBritain; // US dollars remaining after Great Britain and above
        
        double canadiandollarsSpent = 1433.44;            // Canadian Dollars spent
        double canadiandollarsExchangeRate = 1.26;     // 1 US dollar = 19.57852  Canadian Dollars
        double dollarsSpentInCanada = canadiandollarsSpent / canadiandollarsExchangeRate;      // US dollars spent in Canada
        double dollarsAfterCanada = dollarsAfterGreatBritain - dollarsSpentInCanada; // US dollars remaining after Canada and above

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        // Conversion
        // code goes below here
        System.out.println("Starting US dollars:          " + startingUsDollars);
        System.out.println();
        
        System.out.println("Mexico");
        System.out.println(" Pesos spent:                 " + pesosSpent);
        System.out.println(" US dollars equivalent:       " + dollarsSpentInMexico);
        System.out.println(" US dollars remaining:        " + dollarsAfterMexico);
        System.out.println();
        
        System.out.println("Great Britain");
        System.out.println(" Sterling spent:              " + sterlingsSpent);
        System.out.println(" US dollars equivalent:       " + dollarsSpentInGreatBritain);
        System.out.println(" US dollars remaining:        " + dollarsAfterGreatBritain);
        System.out.println();
        
        System.out.println("Canada");
        System.out.println(" Sterling spent:              " + canadiandollarsSpent);
        System.out.println(" US dollars equivalent:       " + dollarsSpentInCanada);
        System.out.println(" US dollars remaining:        " + dollarsAfterCanada);
        
        System.out.println("==================================================");
        System.out.println("Remaining US dollars:         " + dollarsAfterCanada);
        System.out.println();
        System.out.println();
        System.out.println();


        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = budget1/costItem1;        //how many items can be purchased
        int fundsRemaining1 = (budget1 % costItem1);  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = (int) (budget2/costItem2);    //how many items can be purchased
        double fundsRemaining2 = (budget2 % costItem2);   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

