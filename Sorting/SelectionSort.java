package Sorting;
import java.util.*;
public class SelectionSort {
    public static void Selection(int [] arr){
        for(int i=0;i<= arr.length-2;i++){
            int smallest= i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={5,6,8,7,2,3};
        Selection(arr);
    }
}
