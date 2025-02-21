import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollegeAdmin {
    private static final String STUDENT_FILE = "data/students.txt";
    private static final String FACULTY_FILE = "data/faculty.txt";
    private static final String COURSE_FILE = "data/courses.txt";

    // Save objects to a file
    private static <T> void saveToFile(List<T> list, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Read objects from a file
    @SuppressWarnings("unchecked")
    private static <T> List<T> readFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    // Add a student
    public static void addStudent(Student student) {
        List<Student> students = readFromFile(STUDENT_FILE);
        students.add(student);
        saveToFile(students, STUDENT_FILE);
    }

    // List all students
    public static void listStudents() {
        List<Student> students = readFromFile(STUDENT_FILE);
        students.forEach(System.out::println);
    }
}
