import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int regNumber;

    public Student(String name, int regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }
}

class Exam extends Student {
    int marks;

    public Exam(String name, int regNumber, int marks) {
        super(name, regNumber);
        this.marks = marks;
    }
}

class Result extends Exam {
    public Result(String name, int regNumber, int marks) {
        super(name, regNumber, marks);
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Result> results = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student register number:");
            int regNumber = scanner.nextInt();
            System.out.println("Enter marks:");
            int marks = scanner.nextInt();

            Result result = new Result(name, regNumber, marks);
            results.add(result);

            scanner.nextLine(); // Consume newline character
        }

        for (Result result : results) {
            result.display();
        }

        scanner.close();
    }
}
