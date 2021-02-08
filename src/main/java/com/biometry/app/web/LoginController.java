package com.biometry.app.web;

import com.biometry.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController(value = "/login")
public class LoginController {
    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/login")
    @ResponseBody
    public Map<String,String> login(@RequestBody Map<String,String> requestBody) {
        Map<String,String> responseBody=new HashMap<>();
        int role = Integer.parseInt(requestBody.get("role"));
        if(role==0) {
            int id = adminService.checkLogin(requestBody);
            if (id == -1) {
                responseBody.put("message", "User does not exist!");
                return responseBody;
            } else {
                responseBody.put("id", Integer.toString(id));
                return responseBody;
            }
        }
        else
            return null;
    }
}