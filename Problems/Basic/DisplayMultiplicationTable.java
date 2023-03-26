/*

 * Problem Statement : Display multiplication tables for a number. 
 * Solution : 
 * 1. Initialise a scanner object to take input from user
 * 2. Loop through from 1 to 10 or n number of entries you want
 * 3. multiply the user input with i and display the numbers

*/

package JavaPractise.Problems.Basic;

import java.util.Scanner;

public class DisplayMultiplicationTable {
    public static void main (String[] args){
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        System.out.println("--------------------------");
        for(int i = 1; i<=10; i++){
            System.out.println(num * i);
        }
    }
}
