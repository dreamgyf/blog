package com.dreamgyf.blog.service.impl;

import com.dreamgyf.blog.dao.mapper.ArticleMapper;
import com.dreamgyf.blog.entity.Article;
import com.dreamgyf.blog.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> articleList() {
        return articleMapper.selectAllArticle();
    }

    @Override
    public Article getArticle(int id) {
        return articleMapper.selectAllByArticleId(id);
    }
}
