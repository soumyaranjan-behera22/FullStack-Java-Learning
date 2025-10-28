package DSA;

public class ReverseStringUsingArray {
    public static void main(String[] args) {
        char arr[] ={ 'a','b','c','d'};
        int start=0;
        int n=arr.length;
        System.out.println(n);
        int  end=n-1;
//        start='s';
        System.out.println(start);
        System.out.println(arr[1]);
        while(start<end){
            char temp= arr[start];
            arr[start]=arr[end];
            System.out.println("arr[start] "+arr[start]);
            arr[end]=temp;
            System.out.println("arr[end] "+arr[end]);
            start++;
            end--;
//            System.out.println(arr);
        }
        System.out.println(arr);
    }
}
