package Coding_Practice.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String a = "apple is sweet teews si elppa";
        String a1 = a.toLowerCase().replaceAll(" ", "");
        boolean isPalindrome=true;
        int end=a1.length()-1;
        char[] a2=a1.toCharArray();
        for (char c : a2) {
            if (c != a2[end--]) {
                isPalindrome=false;
            }
        }
        System.out.println("Palindrome: "+isPalindrome);
    }
}
