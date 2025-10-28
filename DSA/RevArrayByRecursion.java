package DSA;

public class RevArrayByRecursion {
    static int[] rev(int arr[]){
        int x =arr.length;
//        if(x==0)return new int[]{0};
//        new int[rev(x-1)];
//        return rev(x-1);
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,3,6};
        rev(arr);
    }
}
