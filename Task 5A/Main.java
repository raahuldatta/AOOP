public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepo = new InMemoryStudentRepository();
        CourseRepository courseRepo = new InMemoryCourseRepository();
        EnrollmentManager enrollmentManager = new EnrollmentManager(studentRepo, courseRepo);

        Student student1 = new Student("S01", "Alice");
        Course course1 = new Course("C01", "Mathematics");

        enrollmentManager.enrollStudentInCourse(student1, course1);

        System.out.println("Student " + student1.getName() + " enrolled in courses: ");
        for (Course c : student1.getCourses()) {
            System.out.println(c.getName());
        }

        System.out.println("Course " + course1.getName() + " has students: ");
        for (Student s : course1.getStudents()) {
            System.out.println(s.getName());
        }
    }
}