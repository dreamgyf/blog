package com.dreamgyf.blog.service;

import com.dreamgyf.blog.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    List<Article> articleList();

    Article getArticle(int id);
}
