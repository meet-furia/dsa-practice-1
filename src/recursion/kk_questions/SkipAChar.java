package recursion.kk_questions;

public class SkipAChar {
    public static void main(String[] args) {
        String s1 = "abcdabc";
        String newString = skipAChar(s1, 'a', new String(""), 0);
        System.out.println(newString);
    }

    static String skipAChar(String string, char c, String newString, int index) {
        if (index == string.length()) {
            return newString;
        }
        if (string.charAt(index) != c) {
            newString = newString + string.charAt(index);
            return skipAChar(string, c, newString, index+1);
        }
        else {
            return skipAChar(string, c, newString, index+1);
        }
    }
}
