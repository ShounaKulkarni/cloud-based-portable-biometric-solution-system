package com.biometry.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@JsonIgnoreProperties(allowGetters = true)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;
    @Column
    private String courseName;
    @Column
    private String Year;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
    private List<CourseMaster> courseMasters;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public List<CourseMaster> getCourseMasters() {
        return courseMasters;
    }

    public void setCourseMasters(List<CourseMaster> courseMasters) {
        this.courseMasters = courseMasters;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}