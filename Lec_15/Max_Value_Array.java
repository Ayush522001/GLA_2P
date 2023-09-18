package Lec_15;

public class Max_Value_Array {
    public static void main(String[] args) {
        int arr[]={22,1,-10,11,33,12,45,13};
        max(arr);
    }
    public static void max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
