package com.dreamgyf.blog.dao.mapper;

import com.dreamgyf.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> selectAllArticle();

    Article selectAllByArticleId(@Param("id") int id);

    void insert(@Param("title") String title,@Param("subtitle") String subtitle,@Param("content") String content,@Param("time") Timestamp time,@Param("isPublic") int isPublic);

    void updateByArticleId(@Param("id") int id,@Param("title") String title,@Param("subtitle") String subtitle,@Param("content") String content,@Param("isPublic") int isPublic);

    void deleteByArticleId(@Param("id") int id);
}
