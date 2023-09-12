package Lec_10;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int ans=0;
        int place=1;
        while (n!=0){
            int rem=n%10;
            ans=ans+(int)(Math.pow(10,rem-1)*place);
            place++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
