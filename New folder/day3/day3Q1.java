import java.util.Scanner;

class Plastic2D {
    double l, w;
    final double RATE_SHEET = 40;

    Plastic2D(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double area() { return l * w; }
    double cost() { return area() * RATE_SHEET; }

    void show() {
        System.out.printf("Area: %.2f sq ft, Cost: Rs %.2f\n", area(), cost());
    }
}

class Plastic3D extends Plastic2D {
    double h;
    final double RATE_BOX = 60;

    Plastic3D(double l, double w, double h) {
        super(l, w);
        this.h = h;
    }

    double vol() { return l * w * h; }

    @Override
    double cost() { return vol() * RATE_BOX; }

    @Override
    void show() {
        System.out.printf("Volume: %.2f cu ft, Cost: Rs %.2f\n", vol(), cost());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for 2D sheet, 2 for 3D box: ");
        int ch = sc.nextInt();

        if(ch == 1) {
            System.out.print("Enter length & width: ");
            Plastic2D sheet = new Plastic2D(sc.nextDouble(), sc.nextDouble());
            sheet.show();
        }
        else if(ch == 2) {
            System.out.print("Enter length, width & height: ");
            Plastic3D box = new Plastic3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            box.show();
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}