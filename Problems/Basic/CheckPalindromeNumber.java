/*

 * Problem Statement : Check if a number is palindrome or not  
 * Solution : 
 * 1. Initialise a scanner object to take input from user. Save the input in a temp variable.
 * 2. Use mod (% 10) to get the digits of a number from end. Use divide (/ 10) to drop the last digit of a number. Eg : n = 157. n % 10 = 7 (got the last digit). n / 10 = 15 (dropped the last digit). 
 * 3. Initialise a variable reverse to 0. To get reversed number, take each digit, multiply reverse by 10 and add the digit. Eg : In the first loop, we will have reverse = (0 * 10) + 7 = 7. In second loop, (7 * 10) + 5 = 75. In the third loop, (75 * 10) + 1 = 751. 
 * 4. Check if reversed number and original number are same. If they are then its a palindrome else its not a palindrome. 

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        s.close();
        int reverse = 0;
        System.out.println("--------------------------");
        while(temp >= 1){
            int reminder = temp % 10;
            reverse = (reverse * 10) + reminder;
            temp = temp / 10;
        }
        if(reverse == num){
            System.out.println(num + " is palindrome ");
        }
        else{
            System.out.println(num + " is not palindrome ");
 
        }
        
    }
}
