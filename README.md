# FirstASDAssignment


![image](https://github.com/yazeedk/FirstASDAssignment/assets/36983323/75e2d272-a234-4881-8ef7-e46a2ccbc03b)

 Classes:

Course: Represents a course offered by the university.
Student: Represents a student enrolled at the university.
University: Represents the university.
Enrollment: Represents a relationship between a student and a course.
Report: Represents a report that can be generated about the course enrollment system.


The code defines the following methods:

Course.enrollStudent(): Enrolls a student in the course.
Course.dropStudent(): Drops a student from the course.
University.addStudent(): Adds a student to the university.
University.addCourse(): Adds a course to the university.
University.enrollStudentInCourse(): Enrolls a student in a course.
University.dropStudentFromCourse(): Drops a student from a course.
University.getAllCourses(): Returns a list of all courses offered by the university.
University.getCoursesForStudent(): Returns a list of courses enrolled in by a given student.
University.getStudentsInCourse(): Returns a list of students enrolled in a given course.
Enrollment.generateReports(): Generates reports about the course enrollment system.
Report.generateAllAvailableCoursesReport(): Generates a report of all available courses.
Report.generateEnrolledCoursesReport(): Generates a report of the courses enrolled in by a given student.
Report.generateStudentsInCourseReport(): Generates a report of the students enrolled in a given course.
The code can be used to perform a variety of tasks, such as:


Enrolling students in courses.
Dropping students from courses.
Generating reports of all available courses, enrolled courses for a student, or students enrolled in a course.
The code can be used to implement a complete course enrollment system for a university.


Student, and University classes encapsulates attributes and behavior methods related to specific entities.



Association between Student and Course, Student are associated with courses through the enrolledCourses method in the Student class and the enrolledStudent method in the Course class.

The Enrollment class manages the relationship between students and courses, allowing students to be enrolled in courses and generating reports based on this information.
