package DSA;

public class PowerByRecursion {
    static int pow(int x, int y){
        if(y==0) return 1;
        int power =pow(x,y/2);
        if(y%2==0)return power*power;//even
         return power*power*x; //odd
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
