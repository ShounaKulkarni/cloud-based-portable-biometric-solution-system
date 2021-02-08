package com.biometry.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@JsonIgnoreProperties(allowGetters = true)
public class TeacherMaster {
    public List<CourseMaster> getCourseMasters() {
        return courseMasters;
    }

    public void setCourseMasters(List<CourseMaster> courseMasters) {
        this.courseMasters = courseMasters;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer teacherID;
    @Column
    private String teacherName;
    @Column
    private String teacherEmail;
    @Column
    private String teacherPass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private List<CourseMaster> courseMasters;

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherPass() {
        return teacherPass;
    }

    public void setTeacherPass(String teacherPass) {
        this.teacherPass = teacherPass;
    }

    public TeacherMaster() {
    }

    @Override
    public String toString() {
        return "TeacherMaster{" +
                "teacherID=" + teacherID +
                ", teacherName='" + teacherName + '\'' +
                ", teacherEmail='" + teacherEmail + '\'' +
                ", teacherPass='" + teacherPass + '\'' +
                '}';
    }
}
