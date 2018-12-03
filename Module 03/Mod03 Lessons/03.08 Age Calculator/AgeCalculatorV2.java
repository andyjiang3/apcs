
/**
 * Write a description of class AgeCalculatorV2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class AgeCalculatorV2
{
  public static void main(String[] args)
    {
        //construct a Scanner object called in
        Scanner in = new Scanner(System.in);

        //ask user for input
        System.out.print("\nPlease enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");

        System.out.print("Please enter your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);

        //calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.substring(0,1);
        String name = firstInitial  + "." + lastName;

        // display name and minutes to screen
        System.out.print("Name: " + name);
        System.out.print("\n\n Age in Minutes: " + ageInMinutes + "\n");
    }
}
