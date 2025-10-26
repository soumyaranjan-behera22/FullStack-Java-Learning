package DSA;
public class Strings {
    static String revString(String str){
        int n= str.length();
        String rev = "";
        for(int i=0;i<n;i++){
            rev =rev+str.charAt(n-i-1);
        }

        return rev;
    }
    static String reverse(String str) {
        int n = str.length();
        StringBuilder str1 =new StringBuilder(str);
        int start = 0;
        int end = n - 1;
        while (start<end) {
            char temp =str1.charAt(start);
            str1.setCharAt(start,str1.charAt(end));
            str1.setCharAt(end,temp);
            start++;
            end--;
        }
    return str1.toString();
    }

    public static void main(String[] args) {
        String str ="soumya";

//        System.out.println(revString(str));
        System.out.println("before "+str);
        System.out.println(reverse(str));
//        System.out.println("after"+str);
    }
}
