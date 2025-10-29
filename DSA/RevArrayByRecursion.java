package DSA;

public class RevArrayByRecursion {
    static int[] rev(int arr[], int idx){
        int x =arr.length;
//        if()
        return new int[]{};
    }
    static void  reverse(int []arr,int idx){
        int start =0;
        int end=idx;
        if(end==0) {
            System.out.print(arr[start]);
            return;
        }
        System.out.println(arr[end]);
         reverse(arr,idx-1);
    }
    public static void main(String[] args) {
        int arr[]={12,1,3,5,3,6,34,22};
//        rev(arr,0);
        int len =arr.length-1;
    reverse(arr,len);
    }
}
