package Lec_14;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int idx=0;idx< arr.length;idx++){
            arr[idx]= sc.nextInt();
        }
        System.out.println("============>");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int arr2[]={22,11,12,33,44,55,66,7,2,3};

    }
}
