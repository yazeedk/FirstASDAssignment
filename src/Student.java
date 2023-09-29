import java.util.ArrayList;
import java.util.List;

// Create a Student class
class Student {
    private final int studentID;
    private final String name;
    private final String email;
    private final List<Course> enrolledCourses;

    public Student(int studentID, String name, String email) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }
}