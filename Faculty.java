import java.io.Serializable;

public class Faculty implements Serializable {
    private int facultyId;
    private String name;
    private String specialization;

    public Faculty(int facultyId, String name, String specialization) {
        this.facultyId = facultyId;
        this.name = name;
        this.specialization = specialization;
    }

    public int getFacultyId() { return facultyId; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + name + ", Specialization: " + specialization;
    }
}
