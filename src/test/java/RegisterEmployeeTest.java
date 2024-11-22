import dao.EmployeeDAO;
import entity.Employee;
public class RegisterEmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setNome("Vinicius Silva");
        employee.setCPF("24680135790");
        employee.setDataInicio("2020-03-05");
        employee.setDataFinal(null);
        employee.setSalario(2000.00);
        employee.setFuncao("Zelador");

        new EmployeeDAO().registerEmployee(employee);
    }
}
