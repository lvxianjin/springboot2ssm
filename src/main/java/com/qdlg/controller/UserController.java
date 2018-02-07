package com.qdlg.controller;

import com.qdlg.dao.UserDao;
import com.qdlg.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 10184 on 2018/2/7.
 */
//证明是controller层并且返回json
@RestController
public class UserController {
    @Autowired
    private UserDao dao;
    @PostMapping(value= "cs")
    public User cs(HttpServletRequest request) {
        String name = request.getParameter("username");
        User user = dao.selectUserByName(name);
        return user;
    }
}

