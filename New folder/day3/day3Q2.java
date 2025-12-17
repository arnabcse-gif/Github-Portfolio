import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box constructor: " + length + " x " + width + " x " + height);
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox constructor: " + length + " x " + width +
                " x " + height + " x " + thick);
    }

    void display() {
        System.out.println("\n=== Final Dimensions ===");
        System.out.println("Plate: " + length + " x " + width);
        System.out.println("Box: " + length + " x " + width + " x " + height);
        System.out.println("WoodBox: " + length + " x " + width + " x " + height + " x " + thick);
    }
}

class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions:");
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Width: ");
        double w = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        System.out.print("Thickness: ");
        double t = sc.nextDouble();

        System.out.println("\n=== Constructor Execution ===");
        WoodBox wb = new WoodBox(l, w, h, t);
        wb.display();

        sc.close();
    }
}