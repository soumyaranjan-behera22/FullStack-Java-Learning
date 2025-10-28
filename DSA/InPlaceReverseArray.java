package DSA;

public class InPlaceReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3};
        int start=0;
        int n= arr.length;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=arr[start];
//            System.out.println(arr[i]);

        }

    }
}
