package arraysss;
import java.util.*;

public class stringss {
    /* String can have characters (upper case)  (lower case) number 0-9 all specail char' ($,#,@%~)
      Sequence of a various characters!
      string is class not a data typer but assumes as data type.(non primitive datatype)
      String name = "toney"; //declaration
      

      //methods in strings 
     * to take input String A = sc.nextLine();
     * to get length of the string syso(A.length());
     * for loop for(int i=0;i<A.length();i++) {
     *    syso(A.charAt(i));
     * if(A==B) we use (A.CompareTo(B)==0)
     * }
     */


            //Example;
  /*  public static void main (String []args) {
        String s = "Heloo";
        s = s+"d";
        s = s + 'e';
        s = s + ""; //empty string 
        s = s + 10;
        System.out.println(s); // Heloode10 will be printed

    }
     */



     /* write a function
       string having only lower cases(a,b)
     */

      public static int countVowels(String S) {
      int count = 0;
       for (int i = 0; i < S.length(); i++) {
       if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' ||
      S.charAt(i) == 'o'
       || S.charAt(i) == 'u') {
       count++;
       }
       }
       return count;
       }
      
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S=sc.nextLine();
      System.out.println(countVowels(S));
      sc.close();
      
     }
       

     /* palindrom
      * 121
      madam
      nun
      naman
      malayalam
     write a function for a given string it is a palindrome or not 
      */
     /* public static String reverse(String S) { //first create an empty string 
             String rev = "";
             for(int i=S.length()-1;i>=0;i--) {
                   rev+=S.charAt(i);
             }
             return rev;
      }
      public static void main (String [] args) { 
        String S = 

      }
  }
      /*
      lower case 
      upper case
      numbers
      special characters

      length >= 8  (min
      if pass is satisfying all it is strong
      satisfying 4/5 moderate 
      satisfying 3/5 weak 
      satisfying 2/5 and 1/5 is poor!!
       write a function  */

       /*public static void main(String []args) {
        String S = "";
        if(int i=0) { 

        }



       }
     
/* Toggle the case of all characters */


    
}
