package Coding_Practice;

public class Mergetwosortedarrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 8};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i : arr1) {
            arr3[index++] = i;
        }
        for (int i : arr2) {
            arr3[index++] = i;
        }
    for(int i:arr3){
        System.out.print(i);
    }
    }

}
