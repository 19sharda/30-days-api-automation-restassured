package Coding_Practice;

public class Maximum_product_two_integers_array {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 4, 8, 9, 8};

        int[] arr2 = {3, 6, 9, 7, 5, 2};
        System.out.println(maxProd(arr, arr2));
    }
    public static int maxProd(int[] arr,int[] arr1)
    {int prod=1;
        for(int i:arr){
            for(int j:arr1){
                if(i*j>prod){
                    prod=i*j;
                }
            }
        }
      return prod;
    }

}
