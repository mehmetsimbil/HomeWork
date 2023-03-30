package HomeWork.dataAccess.HibernateDao;

import HomeWork.dataAccess.InstructorDao;
import HomeWork.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile güncellendi.");
    }
}
