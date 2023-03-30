package HomeWork.dataAccess.JdbcDao;

import HomeWork.dataAccess.CategoryDao;
import HomeWork.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile güncellendi.");
    }
}
