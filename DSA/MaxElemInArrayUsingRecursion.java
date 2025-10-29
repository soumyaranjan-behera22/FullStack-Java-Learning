package DSA;

public class MaxElemInArrayUsingRecursion {
    static int max(int arr[],int idx){
       if(idx==arr.length) return 0; // base case
       int maximum =max(arr,idx+1); // recursive work
       return(Math.max(maximum,arr[idx])); //self work

    }
    public static void main(String[] args) {
        int arr[]={11,23,14,22};
        System.out.println(max(arr,0));

    }
}
