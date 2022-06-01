package transmatter.sandbox.content.news.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import transmatter.sandbox.content.news.dto.NewsDto;
import transmatter.sandbox.content.news.service.NewsService;
import transmatter.sandbox.content.utils.TransmatterMapper;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewsResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    NewsService newsService;

    @Transactional
    NewsDto getContent(String id){
        return TransmatterMapper.INSTANCE.getNewsDto(newsService.getContent(id));
    }

    @Transactional
    List<NewsDto> getAllContents(){
        return TransmatterMapper.INSTANCE.getNewsDto(newsService.getAllContents());
    }

    @Transactional
    NewsDto deleteContent(String id){
        return TransmatterMapper.INSTANCE.getNewsDto(newsService.deleteContent(id));
    }
}
