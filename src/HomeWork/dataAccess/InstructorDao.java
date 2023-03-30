package HomeWork.dataAccess;

import HomeWork.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void delete(Instructor instructor);
    void update(Instructor instructor);
}
