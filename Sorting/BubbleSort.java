package Sorting;
import java.util.*;
public class BubbleSort {

    public static void Bubble(int []arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr={5,8,6,7,2,3};
        Bubble(arr);
    }
}
