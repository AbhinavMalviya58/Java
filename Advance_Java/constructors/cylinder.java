
/*                                  cylinder 
 * 
   */
public class cylinder {
    public static void main(String args[]) {
        Cylinder C1 = new Cylinder(5, 6);
        C1.show();
        double valume = C1.Volume();
        double totalSurfaceArea = C1.total_surface_area();
        double corvedSurfaceArea = C1.curved_surface_area();
        System.out.println("Valume of cylinder = " + valume);
        System.out.println("Totle surface area of cylinder = " + totalSurfaceArea);
        System.out.println("curved surface area of cylinder = " + corvedSurfaceArea);
    }
}

class Cylinder {
    double height;
    double radius;

    Cylinder(int H, int R) {
        this.height = H;
        this.radius = R;
    }

    double Volume() {
        double V = 3.14 * (radius * radius) * height;
        return V;
    }

    double total_surface_area() {
        double totalSurfaceArea = 2 * 3.14 * radius * (height + radius);
        return totalSurfaceArea;
    }

    double curved_surface_area() {
        double corvedSurfaceArea = 2 * 3.14 * radius * height;
        return corvedSurfaceArea;
    }
 
    void show() {
        System.out.println("Height = " + height + " Radius = " + radius);
    }
}

/*
 * OUTPUT
 * 
 * E:\programing\java\JAVA_by_saurabh_shukla_sir\constructors>java cylinder.java
 * Height = 5.0 Radius = 6.0
 * Valume of cylinder = 565.2
 * Totle surface area of cylinder = 414.48
 * curved surface area of cylinder = 188.4
 * 
 */