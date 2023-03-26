/*

 * Problem Statement : Find sum of n numbers.  Eg : Sum of 5 numbers will be 5 + 4 + 3 + 2 + 1 = 15.
 * Solution : 
 * 1. Initialise a scanner object to take input from user
 * 2. Loop through from 1 to 10 or n number of entries you want
 * 3. multiply the user input with i and display the numbers

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int sum = 0;
        System.out.println("--------------------------");
        for(int i = 0; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The sum of number is : " + sum);
    }
}
