package DSA;

public class SumOfDigit {
    static int digitSum(int n){
       if(n<9&&n>0) return n;
       int sum = digitSum(n/10); // recursive work
        return sum+n%10;// self work
    }
    static int DigSum(int n){
        if(n<9&&n>0) return n;
//        digitSum(n/10);
        int sum=n%10;
        return sum+=digitSum(n/10);
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
        System.out.println(DigSum(123));

    }

}
