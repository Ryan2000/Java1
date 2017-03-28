/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
in class exercise. Tuesday class.  
 */

package palindrome;


public class Palindrome {


    public static void main(String[] args) {
        
        String s1 = "radar";
        boolean s1p = isPalindrome(s1);
        System.out.println(s1 + " --> " + s1p);
        
    }
    
    public static boolean isPalindrome(String s) {  //assuming situation is true and go through possibilities of when would be false
        int n = s.length();
        boolean palindrome = true;
        
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    
    
    
    
    
    
}
