import dao.CourseDAO;
import entity.Course;

public class RegisterCourseTest {
    public static void main(String[] args) {
        Course course = new Course();

        course.setNome("Design");
        course.setDescricao("Curso geral de Design");
        course.setDataInicio("2024-01-12");
        course.setDataFinal(null);

        new CourseDAO().registerCourse(course);
    }
}
