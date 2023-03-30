package HomeWork.entities;

public class Course {
    private String courseName;
    private String description;
    private double price;
    private Instructor instructor;


    public Course(String courseName, String description, double price, Instructor instructor) {
        this.courseName = courseName;
        this.description = description;
        this.price = price;
        this.instructor = instructor;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


}
