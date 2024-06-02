package org.example;

public class Course {
    private String courseName;
    private int courseGrade;

    public Course(String courseName, int courseGrade) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(int courseGrade) {
        this.courseGrade = courseGrade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseGrade=" + courseGrade +
                '}';
    }
}
