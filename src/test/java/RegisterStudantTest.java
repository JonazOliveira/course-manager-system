import dao.StudantDAO;
import entity.Studant;

public class RegisterStudantTest {
    public static void main(String[] args) {
        Studant studant = new Studant();

        studant.setNome("João Torres");
        studant.setGenero("M");
        studant.setMatricula(20240003);
        studant.setCPF("13579024680");
        studant.setDataNascimento("1997-03-05");
        studant.setIdDiscipline(3);
        studant.setIdCourse(1);

        new StudantDAO().registerStudant(studant);
    }
}
