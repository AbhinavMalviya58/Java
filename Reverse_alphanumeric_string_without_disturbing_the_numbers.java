

public class Reverse_alphanumeric_string_without_disturbing_the_numbers {
    public static void main(String[] args) {
        String str = "abc123d4e5";
        char[] charArray = str.toCharArray();
        reverse(charArray);
        String Ans = new String(charArray);
        System.out.println( "Ans = "+ Ans);
    }
    public static void reverse(char str[]) {
        int r = str.length - 1, l = 0;
        while (l < r) {
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}
