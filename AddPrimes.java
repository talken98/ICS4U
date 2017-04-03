//Kennedy Talarico
//March 24 2017
//AdditivePrimes
//This program takes integer input, and determines whether
// a number is prime, additive or neither...

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class AddPrimes {
   
    public String x = null;//converted into an array to check if additive...
    public int y = 0;//user input; determines whether prime or not...
    public String strArray[];//string array which is converted to int array...
    
    public Scanner sc;
    
    public static void main(String[] args){
        
        AddPrimes addPrime = new AddPrimes();
        addPrime.userInput();
        addPrime.isPrime();
        
    }
   
    public void userInput(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        while(!sc.hasNextInt()){//continously loops until input is valid...
            sc.next();
        }
        y = sc.nextInt();
    }
    
    public void isPrime(){
        
        boolean prime = true;
        
        for(int i = 2; i <= sqrt(y); i++){//for statement to check if prime...
            
            if(y % i == 0){
                prime = false;
                break;
            }
            
        }
        
        if(prime){//only if prime this block will run...
            System.out.println("Your number is prime...");
            
            x = String.valueOf(y);//creating string value of int y...
            
            String strArray[] = x.split("");//Splitting each element of x into an array...
            int numArray[] = new int[strArray.length];
            
            for(int j = 0; j < strArray.length; j++){//numArray holds all values of strArray...
                numArray[j] = Integer.parseInt(strArray[j]);      
            }
 
            int l = 0;
            int sum = 0;
            
            while(l < numArray.length){
                sum += numArray[l];//each element in numArray[at index] will be added to int sum...
                l++;
            }
            
            boolean addprime = true;
            
            for(int k = 2; k <= sqrt(sum); k++){//runs to check if the sum of values is also prime...
                if(sum % k == 0){
                    addprime = false;
                    break;
                }
            }
            
            if(numArray.length < 2){//if the array has less than two elements, it can't be an additive prime...
                addprime = false;
            }
            
            if(addprime){
                System.out.println("Your number is additive...");
            }
            
        } else {
            System.out.println("Your number is not prime...");
        }
        
    }
}
