import java.util.Scanner;

class RectangleArea {
    double length, breadth;

    // Default Constructor
    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    // Parameterized Constructor
    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        RectangleArea r = new RectangleArea(l, b);
        r.area();
    }
}
