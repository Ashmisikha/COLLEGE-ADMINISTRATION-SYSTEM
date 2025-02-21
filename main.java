import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n🎓 College Administration System");
            System.out.println("1️⃣ Add Student");
            System.out.println("2️⃣ List Students");
            System.out.println("3️⃣ Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    CollegeAdmin.addStudent(new Student(id, name, department));
                    System.out.println("✅ Student Added Successfully!");
                    break;
                case 2:
                    System.out.println("\n📜 Student List:");
                    CollegeAdmin.listStudents();
                    break;
                case 3:
                    System.out.println("🚀 Exiting...");
                    return;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }
}
