package DSA;

//import java.util.Scanner;

public class ArraysExample {
//    static
    public static int maxFromArray(int[] arr){int large=0;
    for(int i=0;i<arr.length;i++){
            if(large<arr[i]){large =arr[i];}}
//        System.out.println("hello");
    return large;}
    public static void main(String[] args) {
//    creating an array of size n
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//    int arr1[] =new int[n];
     int arr[] ={122,1,3,5,4,3,23};
    int large =maxFromArray(arr);
        System.out.println(large);


    }

}
