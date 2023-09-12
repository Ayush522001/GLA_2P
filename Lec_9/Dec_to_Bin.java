package Le_9;

import java.util.Scanner;

public class Dec_to_Bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int multiplier=1;
        int result=0;
        while (n!=0){
            int rem=n%2;
            result+=(multiplier*rem);
            multiplier*=10;
            n=n/2;
        }
        System.out.println(result);
    }
}
