package com.dreamgyf.blog.controller;

import com.dreamgyf.blog.entity.Article;
import com.dreamgyf.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/articleList")
    public List<Article> articleList()
    {
        return articleService.articleList();
    }

    @RequestMapping(value = "/getArticle")
    public Article getArticle(@RequestParam int id)
    {
        return articleService.getArticle(id);
    }
}
