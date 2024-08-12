public interface StudentRepository {
    void addStudent(Student student);
    Student getStudentById(String id);
}