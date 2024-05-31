import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course("Programming Course");


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student's name:");
            String name = scanner.nextLine();

            System.out.println("Enter student's surname:");
            String surname = scanner.nextLine();

           Faculty field = null;
            boolean validField = false;
            while (!validField) {
                System.out.println("Enter student's field (Proqramer, Design, SMM):");
                String fieldStr = scanner.nextLine();
                if (isValidField(fieldStr)) {
                    field = Faculty.valueOf(fieldStr);
                    validField = true;
                } else {
                    System.out.println("Invalid field. Please enter a valid field.");
                }
            }

            Student student = new Student(name, surname, field);
            course.addStudent(student);
        }

        System.out.println(course);
    }

    private static boolean isValidField(String fieldStr) {
        for (Faculty field : Faculty.values()) {
            if (field.name().equalsIgnoreCase(fieldStr)) {
                return true;
            }
        }
        return false;
    }
}



