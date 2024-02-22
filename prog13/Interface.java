// Interface for common methods between Teacher and Student
interface Person {
    void displayDetails();
}

// Teacher class
class Teacher implements Person {
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Student class
class Student implements Person {
    private String name;
    private int age;
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class to test the classes
public class Interface {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher teacher = new Teacher("John Doe", 35, "Mathematics");
        // Displaying Teacher details
        teacher.displayDetails();

        // Creating a Student object
        Student student = new Student("Alice Smith", 20, 101);
        // Displaying Student details
        student.displayDetails();
    }
}
