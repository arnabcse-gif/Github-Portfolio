import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Enter Roll: ");
            s[i].roll = sc.nextInt();

            sc.nextLine();  // clear buffer
            System.out.print("Enter Name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    s[i].roll + " | " + s[i].name + " | " + s[i].cgpa
            );
        }

        System.out.println(
                "\nStudent with lowest CGPA: " + s[minIndex].name
        );
    }
}
