package practice;

public class Student {
    // Instance variables
    private String name;
    private int rollNo;
    private int[] marks;

    // Constructor to initialize Student object
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate total marks
    public int marksTotal() {
        int total = 0;
        for (int mark : marks) {
            total = total+ mark;
        }
        return total;
    }

    // Getter methods for name and rollNo
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {
        // Create Student objects and initialize them with constructors
        Student student1 = new Student("Alice", 101, new int[]{85, 90, 78, 92, 88});
        Student student2 = new Student("Bob", 102, new int[]{78, 92, 76, 85, 91});
        Student student3 = new Student("Charlie", 103, new int[]{90, 88, 92, 87, 79});

        // Calculate and print total marks for each student
        System.out.println(student1.getName() + "'s Total Marks: " + student1.marksTotal());
        System.out.println(student2.getName() + "'s Total Marks: " + student2.marksTotal());
        System.out.println(student3.getName() + "'s Total Marks: " + student3.marksTotal());
    }
}
