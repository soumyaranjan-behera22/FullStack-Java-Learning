package DSA;

public class SumOfDigit {
    static int digitSum(int n){
       if(n<9&&n>0) return n;
       int sum = digitSum(n/10); // recursive work
        return sum+n%10;// self work
    }
    public static void main(String[] args) {
//        int x=1123;
//        int sum=0;
//        while(x>0) {
//            int digits = x % 10;
//           x/= 10;
//            sum +=digits;
//        }
//        System.out.println(sum);
        System.out.println(digitSum(123));

    }

}
