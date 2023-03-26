/*

 * Problem Statement : Find factorial of a number. Eg : Factorial for 5 will be 5 x 4 x 3 x 2 x 1 = 120.
 * Solution : 
 * 1. Initialise a scanner object to take input from user. 
 * 2. Initialise factorial as 1. Loop through from 1 to n numbers
 * 3. Set factorial as factorial multiplied by i. 

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int factorial = 1;
        System.out.println("--------------------------");
        for(int i = 1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of given number is : " + factorial);
    }
}
