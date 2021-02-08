package com.biometry.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer divId;
    @Column
    private String divName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "div")
    private List<StudentMaster> studs;

    public Division() {
    }

    public Integer getDivId() {
        return divId;
    }

    public void setDivId(Integer divId) {
        this.divId = divId;
    }

    public String getDivName() {
        return divName;
    }

    public List<StudentMaster> getStuds() {
        return studs;
    }

    public void setStuds(List<StudentMaster> studs) {
        this.studs = studs;
    }

    public void setDivName(String divName) {
        this.divName = divName;
    }

    @Override
    public String toString() {
        return "Division{" +
                "divId=" + divId +
                ", divName='" + divName + '\'' +
                '}';
    }
}
