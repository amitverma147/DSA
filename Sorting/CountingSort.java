package Sorting;

public class CountingSort {
    public static void Counting(int[] arr){
        int largest =Integer.MIN_VALUE;
        for (int k : arr) {
            largest = Math.max(largest, k);
        }
         int [] count=new int[largest+1];
        for (int j : arr) {              //for (int i=0;i<arr.length;i++){count[arr[i]]++;}
            count[j]++;
        }
        //Sorting
        int j=0;
        for(int i=0;i< count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,4,1,3,2,4,3,7};
        Counting(arr);
    }

}
