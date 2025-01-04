package Coding_Practice.pra;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Insertionsort {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1,4,3,6,7,9,2,3,5};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i:arr) System.out.println(i);
    }
}