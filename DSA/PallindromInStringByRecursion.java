package DSA;

public class PallindromInStringByRecursion {
    static boolean pallindrom(String str ,int start,int end){
        //base case
        if(start>end){ //it traverse till half
    return true;
        }
        if(str.charAt(start)==str.charAt(end)){
            return true;

        }
    if(str.charAt(start)!=str.charAt(end)){
        return false;
        }

return pallindrom(str ,start+1 ,end-1);

    }
    public static void main(String[] args) {
String Str="nayan";
        System.out.println(pallindrom(Str, 0,Str.length()-1));
        System.out.println();
    }
}
