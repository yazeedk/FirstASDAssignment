import java.util.ArrayList;
import java.util.List;

public class Enrollment {


    private Student[] students;
    private Course[] courses;

    public static void generateReports(University university) {

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

    public void generateReports() {
        System.out.println("All Available Courses:");
        for (Course course : courses) {
            System.out.println(course.getTitle());
            System.out.println("....................................");
        }

        System.out.println("\nEnrolled Courses for Each Student:");
        for (Student student : students) {
            System.out.println(student.getName() + ":");
            for (Course course : student.getEnrolledCourses()) {
                System.out.println("  " + course.getTitle());
                System.out.println("....................................");
            }
        }

        System.out.println("\nStudents Enrolled in Each Course:");
        for (Course course : courses) {
            System.out.println(course.getTitle() + ":");
            List<Student> studentsInCourse = getStudentsInCourse(course.getCourseCode());
            if (studentsInCourse != null) {
                for (Student student : studentsInCourse) {
                    System.out.println("  " + student.getName());
                }
            }
            System.out.println("....................................");
        }
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

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
