package HomeWork.dataAccess.HibernateDao;


import HomeWork.dataAccess.CourseDao;
import HomeWork.entities.Course;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile güncellendi.");
    }
}
