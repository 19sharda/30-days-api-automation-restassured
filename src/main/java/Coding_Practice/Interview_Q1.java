// Write a Java program that takes an input string and outputs the frequency of each character in the string, along with the indices where each character occurs. Additionally, construct a compressed representation of the string where each character is followed by its frequency.
//
//Requirements:
//
//Input: A string of characters (e.g., "aaababbcccadd").
//Output:
//Print the frequency and the indices of each character in the string.
//Construct a compressed representation of the string (e.g., a4b3c3d2 for the input "aaababbcccadd").
//Example Output:
//a 4 [0, 1, 2, 4]
//b 3 [3, 5, 7]
//c 3 [6, 8, 9]
//d 2 [10, 11]
//Compressed Representation: a4b3c3d2



package Coding_Practice;
import java.util.HashMap;
import java.util.ArrayList;

public class Interview_Q1 {
public static void main(String[] args){
    String test="aaababbcccadd";
    char[] testch=test.toCharArray();
    HashMap<Character,Integer> charMap=new HashMap<>();
    HashMap<Character,ArrayList<Integer>> arMap=new HashMap<>();

    for(int i=0;i<testch.length;i++){
      charMap.put(testch[i],charMap.getOrDefault(testch[i],0)+1);
      arMap.putIfAbsent(testch[i],new ArrayList<>());
      arMap.get(testch[i]).add(i);
    }
    for(char i: arMap.keySet()){
    System.out.println(i+" "+charMap.get(i)+" "+arMap.get(i));}

    for(char i: arMap.keySet()){
    System.out.print(i+""+charMap.get(i));}




}
}
