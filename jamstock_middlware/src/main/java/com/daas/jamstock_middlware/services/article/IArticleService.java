package com.daas.jamstock_middlware.services.article;

import com.daas.jamstock_middlware.models.Article;

import java.util.List;

public interface IArticleService {
    List<Article> findAllArticles();
}
