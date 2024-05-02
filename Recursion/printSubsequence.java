public class printSubsequence {
    static void printSS(String Ques, String Ans) {
        if (Ques.length() == 0) {
            System.out.print(Ans + " ");
            return;
        }
        char ch = Ques.charAt(0);
        String ros = Ques.substring(1);
        printSS(ros, Ans + ch);
        printSS(ros, Ans + "_");
    }

    public static void main(String[] args) {
        String s = "abc";
        printSS(s, "");
    }
}
