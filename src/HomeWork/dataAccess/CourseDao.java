package HomeWork.dataAccess;

import HomeWork.entities.Course;

public interface CourseDao{
    void add(Course course);
    void delete(Course course);
    void update(Course course);
}
