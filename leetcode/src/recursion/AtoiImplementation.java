package recursion;

public class AtoiImplementation {

    static int max = Integer.MAX_VALUE;
    static int min = Integer.MIN_VALUE;

    public static int Helper(String s , long num , int index , int sign){

        if(index>=s.length() || !Character.isDigit(s.charAt(index))){
            return (int)(sign * num);
        }

        num = num * 10 + (s.charAt(index) - '0');

        if(num * sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num * sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return Helper(s , num , index + 1 , sign);
    }

    public static int atoi(String str) {

        int i = 0;
        while(i <  str.length() && str.charAt(i) == ' ') i++;
        int sign = 1;
        if(i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')){
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        return Helper(str,0,i,sign);
    }
    public static void main(String[] args) {
        System.out.println(atoi("    -456"));
    }
}
