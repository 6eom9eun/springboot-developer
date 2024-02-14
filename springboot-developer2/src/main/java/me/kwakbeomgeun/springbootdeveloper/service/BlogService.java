package me.kwakbeomgeun.springbootdeveloper.service;


import lombok.RequiredArgsConstructor;
import me.kwakbeomgeun.springbootdeveloper.domain.Article;
import me.kwakbeomgeun.springbootdeveloper.dto.AddArticleRequest;
import me.kwakbeomgeun.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final 이 붙거나 @NotNull 이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}