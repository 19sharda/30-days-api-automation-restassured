package Coding_Practice.pra;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Write the code to check if a string is a palindrome.

class Selectiosort {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1,3,6,8,2,5,4,8,7};
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp =arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            
        }
        
        for(int i:arr)
        System.out.println(i);
    }
}