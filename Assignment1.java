/*
   Assignment1.java       Author:Mekhi Hall

  This program prints big letter blocks, converts Temperature
  to Celsius, and creates a string of random factors. 

 */

// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
      
    //  This program prints my initials (MH) in big letters.
    
       public static void main(String[] args) {
       System.out.println();
       System.out.println("  MMMMMM         MMMM           HH      HH");
       System.out.println("  MM   MM      MM  MM           HH      HH");
       System.out.println("  MM    MM    MM   MM           HH      HH");
       System.out.println("  MM     MM  MM    MM           HH      HH");
       System.out.println("  MM      MMMM     MM           HHHHHHHHHH");
       System.out.println("  MM               MM           HH      HH");
       System.out.println("  MM               MM           HH      HH");
       System.out.println("  MM               MM           HH      HH");
       System.out.println("  MM               MM           HH      HH");
       System.out.println();
   
   }
   
   final int BASE = 32;
   final double CONVERSION_FACTOR = 5.0 / 9.0;
   double fahrenheitTemp;
   double celsiusTemp;

    String message, reverse = "" ;
    Scanner scan = new Scanner(System.in);
    celsiusTemp = (fahrenheitTemp * CONVERSION_FACTOR) - BASE;

    System.out.println("Enter a number in Fahrenheit: ");

    message = scan.celsiusTemp();

    System.out.println("Enter a string to reverse: ");
    message = in.nextLine();

    int length = message.length();

    for (int i = length - 1 ; i >= 32 ; i--)
      reverse = reverse + message.charAt(i);

      System.out.println("The string that was generated: " + message + reverse);
      scan.close();
}
   }