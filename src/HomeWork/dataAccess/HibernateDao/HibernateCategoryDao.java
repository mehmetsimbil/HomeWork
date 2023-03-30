package HomeWork.dataAccess.HibernateDao;

import HomeWork.dataAccess.CategoryDao;
import HomeWork.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile güncellendi.");
    }
}
