package com.biometry.app.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties(allowGetters = true)
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;
    @Column(nullable=false)
    private String adminEmail;
    @Column(nullable=false)
    private String adminPassword;

    public Admin() {
    }
    public Admin(int adminId, String adminPassword, String adminEmail) {
        super();
        this.adminId = adminId;
        this.adminPassword = adminPassword;
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + ", adminEmail=" + adminEmail + "]";
    }
    public int getAdminId() {
        return adminId;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getAdminPassword() {
        return adminPassword;
    }
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public String getAdminEmail() {
        return adminEmail;
    }
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
}
