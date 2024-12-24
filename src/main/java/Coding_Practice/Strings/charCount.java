package Coding_Practice.Strings;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 4. Count the occurrences of each character in a string.
import java.util.HashMap;
class charCount {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String test="Try programiz.pro";
        HashMap<Character,Integer> charcount=countChar(test);
        for(char i:charcount.keySet()){
            System.out.println(i+":"+charcount.get(i));
        }
    }
    public static HashMap<Character,Integer> countChar(String a){
       HashMap<Character,Integer> charcount=new HashMap<>();
        char[] test=a.toCharArray();
        for(char i:test){
            charcount.put(i,charcount.getOrDefault(i,0)+1);
        }
        return charcount;
    }
}