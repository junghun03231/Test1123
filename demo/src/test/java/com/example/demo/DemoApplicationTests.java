package com.example.demo;

import com.example.demo.article.Article;
import com.example.demo.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testJpa() {
		Article q1 = new Article();
		q1.setSubject("안녕하세요");
		q1.setContent("가입 인사드립니다 ^^");
		this.articleRepository.save(q1);

		Article q2 = new Article();
		q2.setSubject("질문 있습니다");
		q2.setContent("ORM이 궁금합니다");
		this.articleRepository.save(q2);
	}

}
