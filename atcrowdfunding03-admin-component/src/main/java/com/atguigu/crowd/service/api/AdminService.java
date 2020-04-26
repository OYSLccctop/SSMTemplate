package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {
    void saveAdmin(Admin admin);

    List<Admin> getAll();
}
