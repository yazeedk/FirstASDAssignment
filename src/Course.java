import java.util.ArrayList;
import java.util.List;

class Course {
    private final String courseCode;
    private final String title;
    private final String instructor;
    private final int maxCapacity;
    private int Enrollment;


    public Course(String courseCode, String title, String instructor, int maxCapacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.Enrollment = 0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentEnrollment() {
        return Enrollment;
    }

    public boolean enrollStudent(Student student) {
        if (Enrollment < maxCapacity) {
            Enrollment++;
            return true;
        }
        return false;
    }

    public void dropStudent(Student student) {
        Enrollment--;
    }
}