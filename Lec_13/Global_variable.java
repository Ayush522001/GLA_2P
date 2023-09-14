package Lec_13;

public class Global_variable {
    static int val=200;
    public static void main(String[] args) {
//        int val=9;
        //LOCAL
        System.out.println("Hello");
        System.out.println(val);
        car(3);
        System.out.println(val);
    }
    public static void car(int x){
        int val=x;
        System.out.println(val);
    }
}
