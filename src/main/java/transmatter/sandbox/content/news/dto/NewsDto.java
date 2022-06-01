package transmatter.sandbox.content.news.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewsDto {
    String id;

    String author;
    String publicDate;
    String title;
    String content;
    List<String> imageUrls;
    List<CommentDto> comment;
}
