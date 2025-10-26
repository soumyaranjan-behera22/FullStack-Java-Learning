package DSA;
import java.util.Arrays;
public class FrequencyOfAnElement {
    public static int[] Frequency(int nums[]){
    Arrays.sort(nums);
    int n=nums.length;
        int ptr =0;
        int frequency=0;
        int maxElem =nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==nums[ptr]){frequency++;}
            else{ptr++;}
            if(frequency>maxElem){
                maxElem =nums[i];}}
        return new int[]{maxElem,frequency};}
    public static void main(String[] args) {
        int arr[]={23,14,55,23,78,14,14};
        System.out.println("before sort"+Arrays.toString(arr));
//        Frequency(arr);
        System.out.println("after srt "+ Arrays.toString(arr));
        System.out.println("the max element occurrence "+Arrays.toString(Frequency(arr)));
    }
}
