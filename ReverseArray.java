import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int [] arr){
        int last = arr.length-1;
        for(int i=0;i< arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int [] arr=new int[10];
        for(int i=0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        reverse(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
