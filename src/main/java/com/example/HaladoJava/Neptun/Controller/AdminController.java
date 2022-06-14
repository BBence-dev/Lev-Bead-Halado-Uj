package com.example.HaladoJava.Neptun.Controller;

import com.example.HaladoJava.Neptun.Service.AdminService;
import com.example.HaladoJava.Neptun.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
public class AdminController {

    private AdminService adminService;


    @Autowired
    public AdminController(AdminService adminService){
        this.adminService=adminService;
    }

    @GetMapping("allAdmin")
    public List getAdminList(){
        return adminService.listAllAdmin();
    }

    @GetMapping("getAdmin")
    public Admin selectAdmin(@RequestParam("id") int id){
        return adminService.getAdmin(id);
    }

    @PostMapping("CreateAdmin")
    public String createAdmin(@RequestBody Admin admin){
        adminService.insertAdmin(admin);
        return "ok";
    }
    @PutMapping("UpdateAdmin")
    public String UpdateAdmin( @RequestBody Admin admin) {
       adminService.updateAdmin(admin);
        return "ok";
    }
    @DeleteMapping("DeleteAdmin")
    public String deleteAdmin( @RequestParam String id) {
        adminService.deleteAdmin(Integer.parseInt(id));
        return "ok";
    }


    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}
