package com.biometry.app.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table
public class AttendanceMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer attId;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<StudentMaster> studentMasterList;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CourseMaster> courseMasterList;
    @Column
    private Date date;
    @Column
    private Time time;

    public AttendanceMaster() {
    }

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    public List<StudentMaster> getStudentMasterList() {
        return studentMasterList;
    }

    public void setStudentMasterList(List<StudentMaster> studentMasterList) {
        this.studentMasterList = studentMasterList;
    }

    public List<CourseMaster> getCourseMasterList() {
        return courseMasterList;
    }

    public void setCourseMasterList(List<CourseMaster> courseMasterList) {
        this.courseMasterList = courseMasterList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "AttendanceMaster{" +
                "attId=" + attId +
                ", studentMasterList=" + studentMasterList +
                ", courseMasterList=" + courseMasterList +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
