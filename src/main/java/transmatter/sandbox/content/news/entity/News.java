package transmatter.sandbox.content.news.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class News {
    @Id
    String id;

    String source;
    String author;
    String public_date;
    String title;
    String content;
    List<Image> images;
    List<Comment> comment;
}
