package DSA;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int nums[]){
        int n =nums.length;
        int reversed[] =new int[n];
        for(int i=0;i<n;i++){
            reversed [i] = nums[n-i-1];

        }
        return reversed;
//        return new int[]{nums[n-0-1],nums[n-1-1],nums[n-2-1],nums[n-3-1],nums[n-4-1]};  only for the limited no of elements it works
    }
    public static void main(String[] args) {
        int nums[] ={4,2,3,82,12};
        nums=reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
