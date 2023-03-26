/*

 * Problem Statement : Display a number in words (zeros included). Eg : 1700 as input must give output as OneSevenZeroZero
 * Solution : 
 * 1. Convert the number to string (parse through from end using mod (%) and / and concatenate with a empty string string variable initialised )
 * 2. Loop through characters of the string from end, convert it to character using charAt() method. 
 * 3. Use switch case to check the character and print the output in words

*/

package JavaPractise.Problems.Basic;

class DisplayNumbersAsWords{
	public static void main (String[] args){
    int n = 1700;
    String s = "";
    while(n >= 1){
      int reminder = n % 10;
      n = n / 10;
      s = s + reminder;
    }
    char c;
    for(int i = s.length() - 1; i >=0 ; i--){
      c = s.charAt(i);
      switch(c){
        case '0' : 
        System.out.print("Zero");
        break;
      case '1' : 
        System.out.print("One");
        break;
      case '2' : 
        System.out.print("Two");
        break;
      case '3' : 
        System.out.print("Three");
        break;
      case '4' : 
        System.out.print("Four");
        break;
      case '5' : 
        System.out.print("Five");
        break;
      case '6' : 
        System.out.print("Six");
        break;
      case '7' : 
        System.out.print("Seven");
        break;
      case '8' : 
        System.out.print("Eight");
        break;
      case '9' : 
        System.out.print("Nine");
        break;
      }
    }
  }
} 