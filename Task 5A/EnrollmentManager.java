public class EnrollmentManager implements Enrollment {
    private StudentRepository studentRepo;
    private CourseRepository courseRepo;

    public EnrollmentManager(StudentRepository studentRepo, CourseRepository courseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
    }

    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
        course.addStudent(student);
        studentRepo.addStudent(student);
        courseRepo.addCourse(course);
    }
}