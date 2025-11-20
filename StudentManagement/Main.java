import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, age, course);
                    service.addStudent(s);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    Student result = service.searchStudent(sid);
                    if (result != null)
                        System.out.println(result);
                    else
                        System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    service.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Bye Ammu!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}