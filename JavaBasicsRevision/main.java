import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);
        String input = "aaabbcccaae";
        System.out.println("Input string: " + input);
        String output = compressString(input);
        String scannerOutput = compressString(line);
        System.out.println("output string: " + output + 
        "\n scanner output: " + scannerOutput);
        scanner.close();
    }

    public static String compressString(String str) {
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
    // 7318326050
    // 05224232036
}