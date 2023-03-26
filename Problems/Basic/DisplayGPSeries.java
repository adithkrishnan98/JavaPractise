/*

 * Problem Statement : Print the geometric series of a number. Take inputs for first number of series a, commond ratio r and range of numbers to be printed n.
 * Solution : 
* 1. Initialise a scanner object to take inputs from user for a, r and n.
 * 2. Initilise a temp varible and store value of a in temp.
 * 3. In a loop for n times, print the temp value and then replace temp with temp * r. 

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class DisplayGPSeries {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = s.nextInt();
        System.out.println("Enter the common difference : ");
        int r = s.nextInt();
        System.out.println("Enter the range of numbers to be printed : ");
        int n = s.nextInt();
        s.close();
        int temp = a;
        System.out.println("--------------------------");
        for(int i = 0; i < n; i++){
            System.out.print(temp + " , ");
            temp = temp * r;
        }
    }
}
