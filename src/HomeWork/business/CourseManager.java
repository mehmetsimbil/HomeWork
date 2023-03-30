package HomeWork.business;

import HomeWork.dataAccess.CourseDao;
import HomeWork.entities.Course;
import HomeWork.logging.Logger;

import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> courses = new ArrayList<Course>();
    private Course course;
    private Logger[] loggers;

    private CourseDao courseDao;

    public CourseManager(ArrayList<Course> courses, Course course, Logger[] loggers, CourseDao courseDao) {
        this.courses = courses;
        this.course = course;
        this.loggers = loggers;
        this.courseDao = courseDao;
    }

    public void add(Course course) throws Exception {

        for (Course course1:courses)
              {

                if(course1.getCourseName()==course.getCourseName()){
                    throw new Exception("Kurs ismi daha önce kullanılmış.");
                }
              }
        if (course.getPrice() < 1) {
            throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
        }
        courseDao.add(course);
        courses.add(course);
        for (Logger logger:loggers) {
            logger.log(course.getCourseName());
        }

        }
    }

