// import java.util.*;

public class compressString {
    public static void main(String[] args) {
        String input = "aaabbcccaae";
        String output = compress(input);
        System.out.println("Input string: " + input);
        System.out.println("output string: " + output);
    }

    public static String compress(String str) {
        // input : aaabbcccaae, output : a3b2c3a2e1
        // if(str == null || str.length() == 0) return "";
        StringBuilder comperss = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                comperss.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        comperss.append(str.charAt(str.length() - 1)).append(count);
        return comperss.toString();
    }
}
