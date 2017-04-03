//Kennedy Talarico
//March 1, 2017
//primechecker
//This program determines if a number is prime or not

package primechecker;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeChecker {

    public static void main(String[] args) {
       
        
       //Initializing all my variables and importing scanner... 
       Scanner scan = new Scanner(System.in);
       int n; //remainder 
       String s;
       int num = 0; //user input
       boolean isPrime = true;
      
       
      //Getting user input... 
      try
      {
       System.out.println("Please Enter a Number: ");
       s = scan.nextLine();
       num = Integer.parseInt(s);
      }
      catch(NumberFormatException e)
      {
       System.out.println("Invalid input, Enter new number: ");
       s = scan.nextLine();
       num = Integer.parseInt(s);
      }
       
      
      //Loop to determine if the number is prime or not...
       for(int i = 2; i <= sqrt(num); i+=1)
       {
           n = num % i;
           if(n == 0)
           {
             isPrime = false;
             break;
           }
       }
       //Boolean statement to print if prime or not to console...
       if(isPrime)
       {
           System.out.println(num + " is a Prime Number.");
       }
       else
       {
           System.out.println(num + " is not a Prime Number.");
       }
       
    }
    
}
