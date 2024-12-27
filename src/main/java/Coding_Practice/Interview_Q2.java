//Example Input (Content of input.txt):
//Copy code
//apple orange apple banana orange banana apple mango mango grape
//Example Output:
//Top 5 most frequent words:
//apple: 3
//banana: 2
//orange: 2
//mango: 2
//grape: 1

package Coding_Practice;

import java.util.*;

public class Interview_Q2 {
    public static void main(String[] arge) {
        String[] listA = {"apple", "orange", "apple", "banana", "orange", "banana", "apple", "mango", "mango", "grape"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : listA) {
            map.put(word, map.getOrDefault(word, 0) + 1);

        }
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<Math.max(5,list.size());i++){
            Map.Entry<String,Integer> entry=list.get(i);
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}