/*

 * Problem Statement : Find if a number is Armstrong number or not. An Armstrong number is one which when taken the sum of the cubes of its individual digits, returns the orignal number. Eg : n = 153. 3^3 + 5^3 + 1^3 = 27 + 125 + 1 = 153.  
 * Solution : 
 * 1. Initialise a scanner object to take input from user. Save the input in a temp variable.
 * 2. Use mod (% 10) to get the digits of a number from end. Use divide (/ 10) to drop the last digit of a number. Eg : n = 157. n % 10 = 7 (got the last digit). n / 10 = 15 (dropped the last digit). 
 * 3. Initialise a cubeSum variable to 0. Next, for each digits, set cubeSum to cubeSum plus the cube of that digits (by using Math.pow() method. Since returns a double, we type case it to int).
 * 4. Check if cubeSum is same as original number num. If it is print, it is an armstrong number else print not an armstrong number. 

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int cubeSum = 0;
        s.close();
        while(temp >= 1){
            int reminder = temp % 10;
            cubeSum = cubeSum + (int) Math.pow(reminder, 3);
            temp = temp / 10;
        }
        if(cubeSum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
