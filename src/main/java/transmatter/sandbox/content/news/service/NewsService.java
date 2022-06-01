package transmatter.sandbox.content.news.service;

import transmatter.sandbox.content.news.entity.News;

import java.util.List;

public interface NewsService {
    News getContent(String id);
    List<News> getAllContents();
    News deleteContent(String id);
}

