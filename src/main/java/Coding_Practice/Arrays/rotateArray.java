package Coding_Practice;

public class rotateArray {
    public static void main(String[] args){
        int[] arr={2,4,6,8,3,7};
        int k=2;
        rotate(arr,k);
    }
    public static void rotate(int[] arr,int k){
        int k1=k%arr.length;
        int[] arr1=new int[arr.length];
        int x=0;
        for(int i=k1;i<arr.length;i++){
            arr1[x]=arr[i];
            x++;
        }
        for(int i=0;i<k1;i++){
            arr1[x]=arr[i];
            x++;
        }
        for(int i:arr1){
            System.out.println(i);
        }
    }
}
