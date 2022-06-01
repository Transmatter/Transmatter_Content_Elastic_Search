package transmatter.sandbox.content.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transmatter.sandbox.content.news.dao.NewsDao;
import transmatter.sandbox.content.news.entity.News;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDao newsDao;

    @Override
    public News getContent(String id) {
        return newsDao.getContent(id);
    }

    @Override
    public List<News> getAllContents() {
        return newsDao.getAllContents();
    }

    @Override
    public News deleteContent(String id) {
        News news = newsDao.getContent(id);
        newsDao.deleteContent(id);
        return news;
    }
}
