class Subtract {

    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void sub(double a, double b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void sub(int a, int b, int c) {
        System.out.println("Subtraction = " + (a - b - c));
    }

    public static void main(String[] args) {
        Subtract s = new Subtract();

        s.sub(10, 5);
        s.sub(20.5, 10.2);
        s.sub(30, 10, 5);
    }
}
