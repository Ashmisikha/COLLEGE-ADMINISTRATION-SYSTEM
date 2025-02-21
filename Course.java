import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String department;

    public Course(String courseCode, String courseName, String department) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Name: " + courseName + ", Dept: " + department;
    }
}
