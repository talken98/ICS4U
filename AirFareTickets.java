//Kennedy Talarico
//March 22 2017
//AirFare calculator
//This program asks user where they want to travel 
//and tells them how much it will cost

package airfaretickets;

import java.util.Scanner;


public class AirFareTickets {
    // Declaring my public variables so I can access upon all void methods and classes...
    public String x = null;
    public String y = null;
    public int[][] ticketArray;

    public static void main(String[] args) {
        // TODO code application logic here
        AirFareTickets airFareTickets = new AirFareTickets();
        
        airFareTickets.userInput();
        airFareTickets.yourPrice();
    }
    
    public void ticketPrices(){
        //Declaring the multi-dimensional array...
        ticketArray = new int[4][4];
        //Row Chicago
        ticketArray[0][0]=0;
        ticketArray[0][1]=110;
        ticketArray[0][2]=120;
        ticketArray[0][3]=80;
        //Row New York
        ticketArray[1][0]=110;
        ticketArray[1][1]=0;
        ticketArray[1][2]=50;
        ticketArray[1][3]=100;
        //Row Boston
        ticketArray[2][0]=120;
        ticketArray[2][1]=50;
        ticketArray[2][2]=0;
        ticketArray[2][3]=90;
        //Row Toronto
        ticketArray[3][0]=80;
        ticketArray[3][1]=100;
        ticketArray[3][2]=90;
        ticketArray[3][3]=0;
        
    }
    
    public void userInput(){
        //Takes in user input as a string...
        Scanner sc = new Scanner(System.in);
        System.out.println("Where are you flying from?");
        while(!sc.hasNext("[A-Za-z]+")){
            System.out.println("Invalid, try again: ");
            sc.next();
        }
        x = sc.next();
        
        System.out.println("Where are you flying to?");
        while(!sc.hasNext("[A-za-z]+")){
            System.out.println("Invalid, try again: ");
            sc.next();
        }
        y = sc.next();
    }
    
    public void yourPrice(){
        this.ticketPrices();
        int z = 0; int l = 0;
       //Assigns switch cases variable z to access element according to input...
        switch(x){
            case "Chicago": z = 0; break;
            case "New York": z = 1; break;
            case "Boston": z = 2; break;
            case "Toronto": z = 3; break;
            default: System.out.println("You can't fly here...");
        }
        
        //Assigns int l to string y to access elements according to user input and case x...
        switch(y){
            case "Chicago": l = 0; break;
            case "New York": l = 1; break;
            case "Boston": l = 2; break;
            case "Toronto": l = 3; break;
            default: System.out.println("You can't fly here...");
        }
       
        System.out.println("It will cost you $" + ticketArray[z][l]);
        
    }
        
}
