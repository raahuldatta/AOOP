import java.util.ArrayList;
import java.util.List;

public class InMemoryCourseRepository implements CourseRepository {
    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public Course getCourseById(String id) {
        return courses.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }
}