package DSA;

public class RevStringUsingRecursion {
    static String rev(String s){
        if(s.isEmpty()) return s;
        String str =rev(s)+s.charAt(0);
        return str;
    }
    public static void main(String[] args) {

    }
}
