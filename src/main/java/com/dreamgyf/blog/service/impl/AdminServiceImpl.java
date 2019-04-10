package com.dreamgyf.blog.service.impl;

import com.dreamgyf.blog.dao.mapper.AdminMapper;
import com.dreamgyf.blog.dao.mapper.ArticleMapper;
import com.dreamgyf.blog.entity.Admin;
import com.dreamgyf.blog.entity.Article;
import com.dreamgyf.blog.exception.UsernameOrPasswordErrorException;
import com.dreamgyf.blog.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.sql.Timestamp;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public int login(String username, String password) {
        Admin admin = adminMapper.selectAllByUsername(username);
        if(admin == null)
            throw new UsernameOrPasswordErrorException();
        if(!admin.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes())))
            throw new UsernameOrPasswordErrorException();
        return admin.getAdminId();
    }

    @Override
    public void newArticle(String title, String subtitle, String content, int isPublic) {
        articleMapper.insert(title,subtitle,content,new Timestamp(System.currentTimeMillis()),isPublic);
    }

    @Override
    public void editArticle(int id, String title, String subtitle, String content, int isPublic) {
        articleMapper.updateByArticleId(id,title,subtitle,content,isPublic);
    }

    @Override
    public void deleteArticle(int id) {
        articleMapper.deleteByArticleId(id);
    }
}
