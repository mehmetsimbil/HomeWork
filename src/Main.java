import HomeWork.business.CategoryManager;
import HomeWork.business.CourseManager;
import HomeWork.dataAccess.CategoryDao;
import HomeWork.dataAccess.HibernateDao.HibernateCategoryDao;
import HomeWork.dataAccess.JdbcDao.JdbcCourseDao;
import HomeWork.entities.Category;
import HomeWork.entities.Course;
import HomeWork.entities.Instructor;
import HomeWork.logging.DatabaseLogger;
import HomeWork.logging.EmailLogger;
import HomeWork.logging.FileLogger;
import HomeWork.logging.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category1 = new Category("Yazılım");
        ArrayList<Category> categories = new ArrayList<Category>();
        Instructor instructor = new Instructor("Mehmet");
        Course course = new Course("YazılımKursu","Java",1500,instructor);
        ArrayList<Course> courses = new ArrayList<Course>();
        HibernateCategoryDao hibernateCategoryDao = new HibernateCategoryDao();
        Logger[] loggers = {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
        CategoryManager categoryManager = new CategoryManager(categories,loggers,hibernateCategoryDao);
        categoryManager.add(category1);
        JdbcCourseDao jdbcCourseDao = new JdbcCourseDao();
        CourseManager courseManager = new CourseManager(courses,course,loggers,jdbcCourseDao);
        courseManager.add(course);
    }
}