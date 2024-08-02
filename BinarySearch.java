import java.util.Scanner;

public class BinarySearch {

    public static int BinSearch(int[] arr, int ele) {
        int lower = 0;
        int higher = arr.length - 1;
        while (lower <= higher) {
            int mid = (lower + higher) / 2;
            if (ele == arr[mid]) {
                return mid;
            } else if (ele < arr[mid]) {
                higher = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements in ascending order:");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int ele = sc.nextInt();

        int result = BinSearch(arr, ele);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
