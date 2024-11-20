import dao.CategoryDAO;
import entity.Category;

public class RegisterCategoryTest {
    public static void main(String[] args) {
        Category category = new Category();

        category.setDescricao("Informatica");

        new CategoryDAO().registerCategory(category);
    }
}
