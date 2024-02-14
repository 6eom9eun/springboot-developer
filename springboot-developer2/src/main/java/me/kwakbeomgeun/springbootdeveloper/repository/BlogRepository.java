package me.kwakbeomgeun.springbootdeveloper.repository;

import me.kwakbeomgeun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
