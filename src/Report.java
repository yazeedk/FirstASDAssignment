import java.util.List;

class Report {
    public static void generateAllAvailableCoursesReport(List<Course> courses) {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course.getTitle());
        }
    }

    public static void generateEnrolledCoursesReport(Student student) {
        System.out.println(student.getName() + "Enrolled Courses:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println("  " + course.getTitle());
        }
    }

    public static void generateStudentsInCourseReport(Course course, List<Student> students) {
        System.out.println("Students Enrolled in " + course.getTitle() + ":");
        for (Student student : students) {
            System.out.println("  " + student.getName());
        }
    }
}