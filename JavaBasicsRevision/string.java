public class string {
    public static void main(String[] args) {
        System.out.println("string in java");
        str();
        System.out.println("String Builder");
        strBuilder();
        System.out.println("String Buffer");
        strBuffer();

    }

    public static void str() {
        String str = "hello";
        String s1 = str.concat(" world");
        System.out.println(str + "\n" + s1);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        // System.out.println(str.charAt(5)); // error
        System.out.println(str.substring(0, 3));
        System.out.println(str.substring(1));
        System.out.println(str.contains("lo"));
        System.out.println(str.contains("ow"));
        System.out.println(str.indexOf("lo"));
        System.out.println(str.indexOf("ow"));
        System.out.println(str.equals("hello"));
        System.out.println(str.equals("Hello"));
        System.out.println(str.equalsIgnoreCase("Hello"));
        String str2 = "    he   llo   ";
        System.out.println(str2);
        System.out.println(str2.trim());
        System.out.println(str2.replace(" ", ""));
        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4); // true, same reference
        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println(str5 == str6); // false, different reference
        System.out.println(str5.equals(str6)); // true, same value
    }

    public static void strBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" world");
        sb.append("!");
        String str = sb.toString();
        int length = sb.length();
        sb.insert(5, ",");
        sb.replace(0, 1, "h");
        sb.deleteCharAt(sb.length() - 1);
        sb.reverse();
        // Hello, world!
        // !dlrow ,olleh
        System.out.println(str+" "+length+ "\n" +sb);
    }

    public static void strBuffer() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" world");
        sb.append("!");
        sb.insert(5, ",");
        sb.replace(0, 1, "h");
        sb.deleteCharAt(sb.length() - 1);
        sb.reverse();
        // Hello, world!
        // !dlrow ,olleh
        System.out.println(sb);
    }
}
