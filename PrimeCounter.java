//Kennedy Talarico
//April 3 2017
//Prime Counter
//This program will count all prime numbers from 1 to 100...
package primecount;

import static java.lang.Math.sqrt;

public class PrimeCount {
    
    public static void main(String[] args)
    {
        System.out.println("All prime numbers from 1 to 100");
        
        //Defining the limit of our program.
        for(int i = 2; i <= 100; i++)
        {
            //Setting boolean statement for each loop.
            boolean isPrime = true;
            //i will loop, and be compared to j.
            for(int j = 2; j < sqrt(i); j+=1)
            {
                //If there is no remainder, set to false and re-loop.
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            //If it is prime, print number to console.
            if(isPrime)
            {
                System.out.println(i);
            }
        }
        
    }
}
