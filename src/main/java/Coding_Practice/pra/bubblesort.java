package Coding_Practice.pra;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Write the code to check if a string is a palindrome.

class bubblesort {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1,3,6,8,2,5,4,8,7};

        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;

                }
            }
            if(!swap) break;

        }

        for(int i:arr)
        System.out.println(i);
    }
}