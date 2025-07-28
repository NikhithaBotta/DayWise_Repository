package CourseReg;

import java.util.Scanner;

public class CourseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseOperations ops = new CourseOperations(); // contains methods above

        while (true) {
            System.out.println("\n1. Add Course\n2. List Courses\n3. Update Course\n4. Delete Course\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.print("Enter Course ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Course Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Faculty: ");
                String faculty = sc.nextLine();

                System.out.print("Enter Credits: ");
                int credits = sc.nextInt();

                ops.addCourse(id, name, faculty, credits);
                break;

                case 2:
                    ops.listCourses();
                    break;
                case 3:
                    System.out.print("Enter ID to update, New Faculty, New Credits: ");
                    ops.updateCourse(sc.nextInt(), sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    ops.deleteCourse(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}