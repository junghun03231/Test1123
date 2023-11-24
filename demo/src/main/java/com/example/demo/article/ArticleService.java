package com.example.demo.article;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.DataNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getlist() {
        return this.articleRepository.findAll();
    }

    public void create(String subject, String content) {
        Article a = new Article();
        a.setSubject(subject);
        a.setContent(content);
        a.setLocalDateTime(LocalDateTime.now());
        this.articleRepository.save(a);
    }

    public Article getArticle(Integer id) {
        Optional<Article> article = this.articleRepository.findById(id);
        if (article.isPresent()) {
            return article.get();
        } else {
            throw new DataNotFoundException("question not found");
        }

    }
}
