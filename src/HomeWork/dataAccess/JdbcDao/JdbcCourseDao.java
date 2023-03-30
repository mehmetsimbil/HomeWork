package HomeWork.dataAccess.JdbcDao;

import HomeWork.dataAccess.CourseDao;
import HomeWork.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("JDBC ile silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("JDBC ile güncellendi.");
    }
}
