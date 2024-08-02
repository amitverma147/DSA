import java.util.Scanner;
import java.lang.Math;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin=sc.nextInt();
       double dec=0;
        int power=0;
        while(bin>0){
            int last=bin%10;
            dec=dec+last*(Math.pow(2,power));
            power++;
            bin = bin/10;
        }
        System.out.println(dec);
    }
}
