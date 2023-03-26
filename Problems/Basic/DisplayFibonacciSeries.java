/*

 * Problem Statement : Print the fibonacci series for n numbers
 * Solution : 
 * 1. Initialise a scanner object to take inputs from user for a, d and n.
 * 2. Initilise two variables a and b with 0 and 1 as values. Print them. 
 * 3. In a loop starting from 2 till n times, we print the sum of a and b and shift a and b with next two values. 
 
 */


package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class DisplayFibonacciSeries {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range of numbers to be printed : ");
        int n = s.nextInt();
        s.close();
        int a = 0;
        int b = 1;
        System.out.print(a + " , " + b + " , ");
        for(int i = 2; i<n; i++){
            int c = a + b;
            System.out.print(c + " , ");    
            b = c;
            a = b;
        }
    }
}
