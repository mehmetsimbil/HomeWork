package HomeWork.business;

import HomeWork.dataAccess.CategoryDao;
import HomeWork.entities.Category;
import HomeWork.logging.Logger;

import java.util.ArrayList;

public class CategoryManager {
    private ArrayList<Category> categories = new ArrayList<Category>();
    private Logger[] loggers;
    private CategoryDao categoryDao;
    private Category category;

    public CategoryManager(ArrayList<Category> categories, Logger[] loggers, CategoryDao categoryDao) {
        this.categories = categories;
        this.loggers = loggers;
        this.categoryDao = categoryDao;
    }

    public void add(Category category) throws Exception {
        for (Category category1:categories)
              {
            if(category1.getCategoryName()== category.getCategoryName()){
                throw new Exception("Kategori ismi tekrar edemez.");
            }


        }
        for (Logger logger1:loggers)
              {
            logger1.log(category.getCategoryName());
        }
        categoryDao.add(category);
        categories.add(category);

    }
}
