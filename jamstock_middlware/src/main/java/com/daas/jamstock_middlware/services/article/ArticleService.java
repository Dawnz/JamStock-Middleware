package com.daas.jamstock_middlware.services.article;

import com.daas.jamstock_middlware.models.Article;
import com.daas.jamstock_middlware.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public List<Article> findAllArticles(){
        return articleRepository.findAll();
    }
}
