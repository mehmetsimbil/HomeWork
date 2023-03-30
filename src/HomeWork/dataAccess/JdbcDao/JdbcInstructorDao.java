package HomeWork.dataAccess.JdbcDao;

import HomeWork.dataAccess.InstructorDao;
import HomeWork.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile güncellendi.");
    }
}
