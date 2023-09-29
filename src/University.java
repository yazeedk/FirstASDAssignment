import java.util.ArrayList;
import java.util.List;

// Create a University class
class University {
    private final List<Student> students;
    private final List<Course> courses;

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public static void generateReports(University university) {
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(int studentID, String courseCode) {
        Student student = findStudent(studentID);
        Course course = findCourse(courseCode);

        if (student != null && course != null && course.enrollStudent(student)) {
            student.enrollCourse(course);
        }
    }

    public void dropStudentFromCourse(int studentID, String courseCode) {
        Student student = findStudent(studentID);
        Course course = findCourse(courseCode);

        if (student != null && course != null) {
            course.dropStudent(student);
            student.dropCourse(course);
        }
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public List<Course> getCoursesForStudent(int studentID) {
        Student student = findStudent(studentID);
        if (student != null) {
            return student.getEnrolledCourses();
        }
        return null;
    }

    public List<Student> getStudentsInCourse(String courseCode) {
        Course course = findCourse(courseCode);
        if (course != null) {
            List<Student> studentsInCourse = new ArrayList<>();
            for (Student student : students) {
                if (student.getEnrolledCourses().contains(course)) {
                    studentsInCourse.add(student);
                }
            }
            return studentsInCourse;
        }
        return null;
    }

    private Student findStudent(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }

    private Course findCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
}