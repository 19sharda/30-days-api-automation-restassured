package Coding_Practice.pra;

public class SecondHighest {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] ar={4,5,3,2,6,8,9,1,13,1,3};
        secondhigh(ar);
    }
    public static void secondhigh(int[] ar){
        int max=Integer.MIN_VALUE,secMax=Integer.MIN_VALUE;

        for(int i:ar){
            if(i>max){
                secMax=max;
                max=i;
            }
            else if(i>secMax && i<max){
                secMax=i;
            }

        }
        System.out.println(max+":"+secMax);

    }
}
