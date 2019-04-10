package com.dreamgyf.blog.service;

public interface AdminService {

    int login(String username,String password);

    void newArticle(String title,String subtitle,String content,int isPublic);

    void editArticle(int id,String title,String subtitle,String content,int isPublic);

    void deleteArticle(int id);
}
