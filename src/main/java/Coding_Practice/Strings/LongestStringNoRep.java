package Coding_Practice.Strings;

public class LongestStringNoRep {
    //    Find the longest substring without repeating characters.
    public static void main(String[] args) {
        String a = "I am looking for a fox and a cat";
        int max = 0;
        int count = 0;
        int count1 = 0;
        char[] a1 = a.toCharArray();
        for(int i=0;i<a1.length;i++){
            for(int j=i+1;j<a1.length;j++){
                System.out.println(a1[i]+":"+a1[j]+":"+count);
                count1++;
                if(a1[i]==a1[j]){
                    count++;
                    System.out.println(a1[i]+":"+a1[j]+":"+count+":"+count1);
                    break;
                }
                count=0;

            }
            max=Math.max(max,count1);
            count1=0;

        }
        System.out.println(max);
    }
}