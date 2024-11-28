import dao.DisciplineDAO;
import entity.Discipline;

public class RegisterDisciplineTest {
    public static void main(String[] args) {
        Discipline discipline = new Discipline();

        discipline.setNome("Desenvolvimento de Software");
        discipline.setDescricao("Fundamentos do Desenvolvimento de Software");
        discipline.setWorkload(120);
        discipline.setMensalidade(800.00);
        discipline.setIdCategory((short)1);
        discipline.setIdEmployee(1);
        discipline.setIdCourse(1);

        new DisciplineDAO().registerDiscipline(discipline);
    }
}
