// Import libraries here

public class Assignment1 {
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