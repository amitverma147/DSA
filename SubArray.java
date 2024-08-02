import java.util.*;
public class SubArray {
    public static void SubArr(int[] arr){
        int total=0;
        int sum = 0;
        int t=0;
        int[] arr1=new int[15];
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                     sum=sum+arr[k];
                }
                total++;
                arr1[t]=sum;
                t++;
                System.out.print(" "+ "Sum of sub-string:"+sum);
                System.out.println();
                sum=0;
            }
            System.out.println();
        }
        System.out.println("Total Sub array:"+total);
        int max=Integer.MIN_VALUE;
        for(int p:arr1){
            if(max<p){
                max=p;
            }
        }
        System.out.println("Maximum sum:"+max);
    }


    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        SubArr(arr);
    }
}
