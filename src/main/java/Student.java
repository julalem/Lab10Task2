package org.example;
import java.util.List;

public class Student {
    private String name;
    private String major;
    private List<Course> courses;


    public Student(String name, String major, List<Course> courses) {
        this.name = name;
        this.major = major;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", courses=" + courses +
                '}';
    }

    public double calculateAverageGrade() {
        if (courses == null || courses.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Course course : courses){
            sum += course.getCourseGrade();
        }
        return sum / courses.size();
    }
}