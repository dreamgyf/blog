package com.dreamgyf.blog.controller;

import com.dreamgyf.blog.exception.AlreadyLogInException;
import com.dreamgyf.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,Object> login(@RequestParam String username, @RequestParam String password, HttpSession session)
    {
        if(session.getAttribute("adminId") != null)
            throw new AlreadyLogInException();
        int adminId = adminService.login(username,password);
        session.setAttribute("adminId",adminId);
        Map<String,Object> mapReturn = new HashMap<>();
        mapReturn.put("status","ok");
        return mapReturn;
    }

    @RequestMapping(value = "/checkLogin")
    public Map<String,String> checkLogin(HttpSession session)
    {
        Map<String,String> mapReturn = new HashMap<>();
        Object adminIdObject = session.getAttribute("adminId");
        if(adminIdObject == null)
            mapReturn.put("status","not login");
        else
            mapReturn.put("status","already login");
        return mapReturn;
    }

    @RequestMapping(value = "/newArticle",method = RequestMethod.POST)
    public Map<String,Object> newArticle(@RequestParam String title,@RequestParam String subtitle,
                                         @RequestParam String content,@RequestParam int isPublic)
    {
        adminService.newArticle(title,subtitle,content,isPublic);
        Map<String,Object> mapReturn = new HashMap<>();
        mapReturn.put("status","ok");
        return mapReturn;
    }

    @RequestMapping(value = "/editArticle",method = RequestMethod.POST)
    public Map<String,Object> editArticle(@RequestParam int id,@RequestParam String title,@RequestParam String subtitle,
                                         @RequestParam String content,@RequestParam int isPublic)
    {
        adminService.editArticle(id,title,subtitle,content,isPublic);
        Map<String,Object> mapReturn = new HashMap<>();
        mapReturn.put("status","ok");
        return mapReturn;
    }

    @RequestMapping(value = "/deleteArticle")
    public Map<String,Object> deleteArticle(@RequestParam int id)
    {
        adminService.deleteArticle(id);
        Map<String,Object> mapReturn = new HashMap<>();
        mapReturn.put("status","ok");
        return mapReturn;
    }

    @RequestMapping(value = "/visitorCount")
    public long visitorCount(HttpSession session)
    {
        Object visitorCountObject = session.getAttribute("visitorCount");
        if(visitorCountObject == null)
            return 0;
        else
            return Long.parseLong(visitorCountObject.toString());
    }
}
