/*

 * Problem Statement : Reverse a number and print it   
 * Solution : 
 * 1. Initialise a scanner object to take input from user.
 * 2. Use mod (% 10) to get the digits of a number from end. Use divide (/ 10) to drop the last digit of a number. Eg : n = 157. n % 10 = 7 (got the last digit). n / 10 = 15 (dropped the last digit). 
 * 3. Initialise a variable reverse to 0. To get reversed number, take each digit, multiply reverse by 10 and add the digit. Eg : In the first loop, we will have reverse = (0 * 10) + 7 = 7. In second loop, (7 * 10) + 5 = 75. In the third loop, (75 * 10) + 1 = 751. 
 * 4. Finaly print the reversed number.  

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class ReverseANumber {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int reverse = 0;
        System.out.println("--------------------------");
        while(num >= 1){
            int reminder = num % 10;
            reverse = (reverse * 10) + reminder;
            num = num / 10;
        }
        System.out.println("The reversed number is " + reverse);
        
    }
}
