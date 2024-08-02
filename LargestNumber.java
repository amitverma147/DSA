import java.util.Scanner;

public class LargestNumber {
    public static int largest(int[] arr){
        int largest=arr[0];
        for( int i=1;i<arr.length;i++)
        {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int[] arr =new int[10];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result= largest(arr);
        System.out.println(result);

    }
}
