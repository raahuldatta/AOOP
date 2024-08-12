import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentById(String id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }
}