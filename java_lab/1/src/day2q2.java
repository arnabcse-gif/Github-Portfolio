import java.util.Scanner;

class ObjectCount {
    static int count = 0;

    ObjectCount() {
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        ObjectCount[] obj = new ObjectCount[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new ObjectCount();
        }

        System.out.println("No of objects created = " + count);
    }
}
