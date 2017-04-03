//Kennedy Talarico
//March 24 2017
//Greatest Common Factor
//This program takes to numbers of input, and determines the 
//greatest common factor between them...

package gcd;

import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) 
    {
        //Initializing my variables...
        int x = 0;//This will be the first inputted number...
        int y = 0;//This will be the second inputted number...
        int r;//This will be the remainder...
        
       //Getting user input...
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a number: ");
       while(!scan.hasNextInt()){//Will continue reprompting until input is valid
           scan.next();
       }
       x = scan.nextInt();
       
       System.out.println("Please enter another number: ");
       while(!scan.hasNextInt()){//Will continue reprompting until input is valid
           scan.next();
       }
       y = scan.nextInt();
       
        while(y != 0)
       {
           r = x % y;//make r the remainder of x and y...
           x = y;// make x = y...
           y = r;// set y = r and redo the remainder division...
       }
       System.out.println("Greatest Common Factor = " + x);
    }
    
}
