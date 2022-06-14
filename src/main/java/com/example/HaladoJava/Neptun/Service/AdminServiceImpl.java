package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.Persist.AdminDao;
import com.example.HaladoJava.Neptun.model.Admin;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao;

    public AdminServiceImpl(AdminDao adminDao){
        this.adminDao=adminDao;
    }

    @Override
    public Admin getAdmin(int id) throws InvalidParameterException {
        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        return adminDao.selectAdmin(id);
    }


    @Override
    public List listAllAdmin() {
        return adminDao.getAllAdmin();
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminDao.updateAdmin(admin);
    }

    @Override
    public void insertAdmin(Admin admin) {
        if(admin.getId()<1){
            throw new InvalidParameterException("id cannot less then one");
        }
        if (adminDao.idInUse(admin.getId())){
            throw new InvalidParameterException("id is in use");
        }
        adminDao.createAdmin(admin);
    }

    @Override
    public void deleteAdmin(int id) {
        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        adminDao.deleteAdmin(id);
    }
}
