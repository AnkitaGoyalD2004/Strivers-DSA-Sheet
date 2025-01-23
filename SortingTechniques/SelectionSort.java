package SortingTechniques;

public class SelectionSort {
    public static void selection_sort(int []arr , int n){
        for(int i = 0 ; i < n-1 ; i++){
            int minimum = i;
             
             for(int j = i+1 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    minimum = j;
                }
             }
             int temp = arr[minimum];
             arr[minimum] = arr[i];
             arr[i] = temp;
           }
           for(int i=0; i< n ; i++){
            System.out.print(arr[i]);
           }
           System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
    }
}
