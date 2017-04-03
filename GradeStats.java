//Kennedy Talarico
//March 24 2017
//ArrayReview
//This program will find average, range, variance, and standard deviation
//of a group of inputted marks...

package arrayreview;

//Import utilities
import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;


public class ArrayReview {

    public double[] marksArray;
    public double avg;
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayReview arrayReview = new ArrayReview();// creating new instance of my class...
        arrayReview.userInput();//calling in my void methods...
        arrayReview.findAverage();
        arrayReview.findRange();
        arrayReview.stats();
    }
    //Finding the nth user input, storing each element into an array.
    public void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of marks: ");
        int n;
        while(!sc.hasNextDouble()){//continously reprompt while input is invalid...
            sc.next();
        }
        n = sc.nextInt();
        
        marksArray = new double[n];//array which will hold the inputted grades...
        
        System.out.println("Please enter the grades: ");
        for(int j = 0; j < n; j++){
            marksArray[j] = sc.nextDouble();
        }
        
        
        
    }
    //Finding the average
    public void findAverage(){
        
        avg = (DoubleStream.of(marksArray).sum()/ marksArray.length);//Sum of elements in array / array length...
        System.out.println("Your average is " + avg);
    }
    //Finding the range
    public void findRange(){
        
        Arrays.sort(marksArray);
        System.out.println("Your range is " + (marksArray[marksArray.length - 1] - marksArray[0])); //last element in array - first element
    }
    //Finding the variance and standard deviation
    public void stats(){
       double variance = 0;
       //created as double to include decimals...
       for(int i = 0; i < marksArray.length; i++){
           variance += (marksArray[i] - avg)*(marksArray[i] - avg) / marksArray.length;
           //for each loop add (array[at index]) squared / length of array) to variable variance...
       }
        
       double standardDeviation = sqrt(variance);//Take the square root of variance for standard deviation...
       
       System.out.println("Your variance is " + variance);
       System.out.println("Your standard deviation is " + standardDeviation);
    }
    
}
