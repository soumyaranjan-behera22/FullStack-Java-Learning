package DSA;

import java.util.*;

//import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,2};
        int arr2[]=new int[arr.length];
        int count=0;
        Set<Integer> st =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
                arr2[i]=arr[i];
                count++;

                st.add(arr[i]);
            }
//            st.add(arr[i]);
        }
//        System.out.println();
        for(int i=0;i<count;i++){
            System.out.println(arr2[i]);
        }
        System.out.println(st);
    }

}
