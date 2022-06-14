package com.example.HaladoJava.Neptun.Persist;


import com.example.HaladoJava.Neptun.model.Admin;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AdminImpl implements AdminDao {
    private Map<Integer, Admin> AdminMap;

    public AdminImpl()
    {
        AdminMap=new HashMap<>();
        AdminMap.put(1,new Admin(1,"Lajos","Valami","W2sj3"));
    }

    @Override
    public Admin selectAdmin(int id) {

        return AdminMap.get(id);
    }

    @Override
    public boolean idInUse(int id) {
        return AdminMap.containsKey(id);
    }

    @Override
    public List<Admin> getAllAdmin() {
        return new ArrayList<Admin>(AdminMap.values());
    }

    @Override
    public void createAdmin(Admin admin) {
        AdminMap.put(admin.getId(),admin);
    }

    @Override
    public void updateAdmin(Admin admin) {
        AdminMap.replace(admin.getId(), admin);
    }

    @Override
    public void deleteAdmin(int id) {
        AdminMap.remove(id);
    }
}
