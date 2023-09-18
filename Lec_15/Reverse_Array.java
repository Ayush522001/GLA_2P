package Lec_15;

public class Reverse_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("============>");
//        reverse(arr);
//        reverse2(arr);
        reverse3(arr);
    }
    public static void reverse(int arr[]){
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse2(int arr[]){
        int narr[]=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            narr[arr.length-1-i]=arr[i];
        }
        for(int i= 0;i<narr.length;i++){
            System.out.print(narr[i]+" ");
        }

    }
    public static void reverse3(int arr[]){
        int i=0;
        int j= arr.length-1;
        while (i<=j){
            int c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
        }
        for(int k= 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
