package studentPack2;
import studentPack.*;

public class putStudent {
    public static void main(String args[]) {
        student s1 = new student();
        DOB SD1 = new DOB();
        s1.setStudentFName("Abhinav");
        s1.setStudentLName("Malviya");
        s1.setStudentRollno(2214910010045L);
        SD1.setDate(05);
        SD1.setMonth("August");
        SD1.setYear(2003);
        System.out.println("<=====Student details=====> \n");
        System.out.println("First Name: " + s1.getStudentFName() + " , Last Name: " + s1.getStudentLName() + "\n");
        System.out.println("Roll Nunber: " + s1.getStudentRollno());
        System.out.println("Date of birth: " + SD1.getDate()+"/"+SD1.getMonth()+"/"+SD1.getyear());
    }
}