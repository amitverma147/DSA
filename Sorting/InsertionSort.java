package Sorting;
public class InsertionSort {
    public static void Insertion(int [] arr)
    {
        for(int i=1;i< arr.length;i++)
        {
            int current= arr[i];
            int previous=i-1;
            while(previous>=0&&arr[previous]>current)
            {
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={5,6,8,7,2,3};
        Insertion(arr);
    }
}
