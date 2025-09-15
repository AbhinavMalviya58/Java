public class equals {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = str1;
        String str4 = "Hello";
        String str5 = "Hello";
        student s1 = new student("Harsh");
        student s2 = new student("Harsh");

        System.out.println((s1 == s2) + "\n" + s1.equals(s2));
        // Using ==
        System.out.println("str4 & str5: " + (str4 == str5));
        System.out.println("str1 & str2: " + (str1 == str2) + "\n" + (str1 == str3));
        // Using .equals()
        System.out.println((str1.equals(str2)) + "\n" + (str1.equals(str3)));
    }

}

class student {
    String name;

    student(String name) {
        this.name = name;
    }
}