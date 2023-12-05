package constructors;
/*
 *                          right angle triangle
 */

public class hypotenuse {
    public static void main(String[] args) {
        rightAngleTriangle A1 = new rightAngleTriangle(2, 4);
        A1.show();
        double area = A1.area();
        double hypotenuse = A1.hypotenuse();
        double perimeter = A1.perimeter();
        System.out.println("Area of tringle = " + area + "\nHypotenuse of tringle = " + hypotenuse
                + "\nperimeter of tringle = " + perimeter);
    }
}

class rightAngleTriangle {
    double base;
    double parpenducular;

    rightAngleTriangle() {

    }

    rightAngleTriangle(double b, double c) {
        this.base = b;
        this.parpenducular = c;
    }

    double area() {
        double A = (base * parpenducular) / 2;
        return A;
    }

    double hypotenuse() {
        double hypotenuse = (parpenducular * parpenducular) + (base * base);
        double P = Math.sqrt(hypotenuse);
        return P;
    }

    double perimeter() {
        double p = parpenducular + base;
        double p1 = (parpenducular * parpenducular) + (base * base);
        double p2 = Math.sqrt(p1);
        double p3 = p + p2;
        return p3;
    }

    void show() {
        System.out.println("Base of trinngle\nb = " + base + "\nParpenducularc of trinngle\np = " + parpenducular);
    }

}
/*
 * OUTPUT
 * 
 * E:\programing\java\JAVA_by_saurabh_shukla_sir\constructors>java
 * hypotenuse.java
 * Base of trinngle
 * b = 2.0
 * Parpenducularc of trinngle
 * p = 4.0
 * Area of tringle = 4.0
 * Hypotenuse of tringle = 4.47213595499958
 * perimeter of tringle = 10.47213595499958
 * 
 */