package com.biometry.app.web;

import com.biometry.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping(value="/addAdmin")
    @ResponseBody
    public Map<String,String> addAdmin(@RequestBody Map<String,String> requestBody) {
        int id = adminService.addAdmins(requestBody);
        Map<String,String> responseBody=new HashMap<>();
        if(id==-1) {
            responseBody.put("message","User already exists!");
            return responseBody;
        }
        else {
            responseBody.put("id",Integer.toString(id));
            return responseBody;
        }
    }
}
