package Coding_Practice.Strings;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 5. Check if two strings are anagrams.
import java.util.Arrays;
class anagram {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String a="evil";
        String b="vil";
       System.out.println(testAnagram(a,b));
    }
    public static boolean testAnagram(String a,String b){
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        // System.out.println(lengthCheck);
        if(a1.length!=b1.length){return false;}
        else{
            Arrays.sort(a1);
            Arrays.sort(b1);
            
        }
        return(Arrays.equals(a1,b1));
    }
}