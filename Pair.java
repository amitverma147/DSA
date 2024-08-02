import java.util.Scanner;

public class Pair {

    public static void ArrayPairs(int [] arr){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j< arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int [] arr=new int[10];
        for(int i=0;i< arr.length;i++){
          arr[i]=sc.nextInt();
        }
        ArrayPairs(arr);
    }
}
