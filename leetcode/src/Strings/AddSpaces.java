package Strings;

public class AddSpaces {
    public String addSpaces(String s, int[] spaces) {
        int m = spaces.length;
        int n = s.length();

        String[] t = new String[m + n];
        int j = 0;
        for(int i = 0; i < n ; i++){
            if(j < m && i == spaces[j]){
                t[i + j] = " ";
                j++;
            }
            t[i + j] = String.valueOf(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m + n ; i++){
            sb.append(t[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AddSpaces ob = new AddSpaces();
        String res = ob.addSpaces("LeetcodeHelpsMeLearn" , new int[]{8, 13, 15});
        System.out.println(res);
    }
}
