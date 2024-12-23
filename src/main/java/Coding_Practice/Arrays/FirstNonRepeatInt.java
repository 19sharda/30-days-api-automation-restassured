package Coding_Practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatInt {
    public static void main(String[] args){
        int[] arr={2,2,4,3,5,6,7,8,9,3,4,6};
        Map<Integer,Integer> arrMap=new HashMap<>();
        for(int i:arr){
            arrMap.put(i, arrMap.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            if(arrMap.get(i)==1){
                System.out.println("First uniques integer of Array is: "+i);
                break;
            }
        }
    }
}
