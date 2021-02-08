package com.biometry.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class StudentMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studId;
    @Column
    private String studName;
    @Column
    private String studEmail;
    @Column
    private Integer roll;
    @Column
    private Long phone;
    @Column
    private String studPass;
    @ManyToOne(cascade = CascadeType.ALL)
    private Division div;
    @ManyToOne(cascade = CascadeType.ALL)
    private Dept dept;

    public List<AttendanceMaster> getAttendanceMasters() {
        return attendanceMasters;
    }

    public void setAttendanceMasters(List<AttendanceMaster> attendanceMasters) {
        this.attendanceMasters = attendanceMasters;
    }

    @ManyToMany(mappedBy = "studentMasterList")
    private List<AttendanceMaster> attendanceMasters;

    public Division getDiv() {
        return div;
    }

    public void setDiv(Division div) {
        this.div = div;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public StudentMaster() {
    }

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getStudPass() {
        return studPass;
    }

    public void setStudPass(String studPass) {
        this.studPass = studPass;
    }


}
