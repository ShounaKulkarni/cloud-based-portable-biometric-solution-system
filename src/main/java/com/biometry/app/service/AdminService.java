package com.biometry.app.service;

import com.biometry.app.entity.Admin;
import com.biometry.app.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public int checkLogin(Map<String,String> requestBody) {
        String email = requestBody.get("email");
        String password = requestBody.get("password");
        Optional<Admin> admin= adminRepository.findByAdminEmailAndAdminPassword(email,password);
        if(admin.isPresent()) {
            return admin.get().getAdminId();
        }
        else {
            return -1;
        }
    }

    public int addAdmins(Map<String,String> requestBody) {
        String email = requestBody.get("email");
        String password = requestBody.get("password");
        Optional<Admin> admin=adminRepository.findByAdminEmail(email);
        if(!admin.isPresent()) {
            Admin newAdmin=new Admin();
            newAdmin.setAdminEmail(email);
            newAdmin.setAdminPassword(password);
            adminRepository.save(newAdmin);
            admin = adminRepository.findByAdminEmailAndAdminPassword(email,password);
            return admin.get().getAdminId();
        }
        else {
            return -1;
        }
    }
}
