/*

 * Problem Statement : Display digits of a number. 
 * Solution : 
 * 1. Initialise a scanner object to take input from user. 
 * 2. Use mod (% 10) to get the digits of a number from end. Use divide (/ 10) to drop the last digit of a number. Eg : n = 157. n % 10 = 7 (got the last digit). n / 10 = 15 (dropped the last digit). 
 * 3. Print each digit. Loop until n becomes 0

*/


package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class DisplayDigitsOfNumber {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        System.out.println("--------------------------");
        while(num >= 1){
            int reminder = num % 10;
            System.out.println(reminder);
            num = num / 10;
        }
    }
}
