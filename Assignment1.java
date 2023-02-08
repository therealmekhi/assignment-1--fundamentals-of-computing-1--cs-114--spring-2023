/*
   Assignment1.java       Author:Mekhi Hall

  This program prints big letter blocks, converts Temperature
  to Celsius, and creates a string of random factors. 

 */

// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
<<<<<<< HEAD
      
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
=======
    public static void main(String[] args) {
        // Add your code here
        System.out.println(x:MMMMMMMM          MMMMMM  HHH         HHH)
        System.out.println(x:MMM    MMM       MMM MMM  HHH         HHH)
        System.out.println(x:MMM     MMM     MMM  MMM  HHH         HHH)
        System.out.println(x:MMM      MMM   MMM   MMM  HHH         HHH)
        System.out.println(x:MMM       MMM MMM    MMM  HHHHHHHHHHHHHHH)
        System.out.println(x:MMM        MMM       MMM  HHH         HHH)
        System.out.println(x:MMM                  MMM  HHH         HHH)
        System.out.println(x:MMM                  MMM  HHH         HHH)
        System.out.println(x:MMM                  MMM  HHH         HHH)
        System.out.println(x:MMM                  MMM  HHH         HHH)
    }
}
//********************************************************************
//  TempConverter.java       
//
//  Demonstrates the use of primitive data types and arithmetic
//  expressions.
//******************************************************************** 

public class TempConverter
{
   //-----------------------------------------------------------------
   //  Computes the Fahrenheit equivalent of a specific Celsius
   //  value using the formula F = (9/5)C + 32.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0; 

      double fahrenheitTemp;
      int celsiusTemp = 24;   // value to convert 

      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE; 

      System.out.println("Celsius Temperature: " + celsiusTemp);
      System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
   }
}
>>>>>>> 7409825659b1824b9f2a98fd7572ad2727c29fd2
