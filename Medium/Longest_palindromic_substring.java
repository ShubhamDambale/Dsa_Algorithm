package Medium;

import java.util.*;

class Longest_palindromic_substring{
    
     public static int longestPalindrome(String s) {
        
        //  if (s == null || s.length() == 0)
        //  return "";

        if (s.length() == 1)
        return 1;
        
        
        String ans = "";
        
        
        for (int i = 0; i < s.length() - 1; i++) {
            String s1 = longPalin(s, i, i);
            if (s1.length() > ans.length()) ans = s1;
            String s2 = longPalin(s, i, i + 1);            
            if (s2.length() > ans.length()) ans = s2;
        }
        
        //return ans;
        
        return ans.length();
       
       //System.out.println(ans);
    }
    
     public static String longPalin(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) break;
            i--;
            j++;
        }
        return s.substring(i + 1, j);
      
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        
        System.out.println(longestPalindrome(s));
        
    }
}