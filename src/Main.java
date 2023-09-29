public class Main {
    public static void main(String[] args) {

        University university = new University();

        Student student1 = new Student(11912341, "Ahmad Mohsin", "ahmad@gmail.com");
        Student student2 = new Student(11912342, "Khalid Abdo", "khalid@gmail.com");
        university.addStudent(student1);
        university.addStudent(student2);

        Course course1 = new Course("C1", "Introduction to computer programming", "Dr.Mutasim", 59);
        Course course2 = new Course("C2", "Object Oriented Programming", "Dr.Mohammad", 59);
        university.addCourse(course1);
        university.addCourse(course2);

        university.enrollStudentInCourse(1, "C1");
        university.enrollStudentInCourse(2, "C2");

        university.dropStudentFromCourse(1, "C2");

        Enrollment.generateReports(university);

        Report.generateAllAvailableCoursesReport(university.getAllCourses());
        Report.generateEnrolledCoursesReport(student1);
        Report.generateStudentsInCourseReport(course1, university.getStudentsInCourse("C1"));

        }
}

