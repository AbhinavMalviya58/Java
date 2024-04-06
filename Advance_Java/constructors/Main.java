package constructors;


public class Main {
    public static void main(String[] args) {
        Cuboid C1 = new Cuboid(10, 20, 30);
        C1.show();
        int TSA = C1.totalSusfaceArea();
        int VOA = C1.valume();
        int AO4W = C1.areaOf4Wall();
        System.out.println("total surface area = " + TSA + "\nVolume of cuboid = " + VOA + "\nArea of 4 wall = " + AO4W);
    }
}

class Cuboid {
    int length;
    int Breadth;
    int height;

    Cuboid() {

    }

    Cuboid(int length, int Breadth, int height) {
        this.length = length;
        this.Breadth = Breadth;
        this.height = height;
    }

    int totalSusfaceArea() {
        int TSA = 2 * ((length * Breadth) + (Breadth * height) + (length * height));
        return TSA;
    }

    int valume() {
        int VOA = length * Breadth * height;
        return VOA;
    }

    int areaOf4Wall() {
        int AO4W = 2 * height * (length + Breadth);
        return AO4W;
    }

    void show() {
        System.out.println(length + " " + Breadth + " " + height);
    }

}

/*


                        OUTPUT
                    E:\programing\java\JAVA_by_saurabh_shukla_sir\constructors>java Main.java
                    10 20 30
                    total surface area = 2200
                    Volume of cuboid = 6000
                    Area of 4 wall = 1800
 * 
 * 
 * 
 */