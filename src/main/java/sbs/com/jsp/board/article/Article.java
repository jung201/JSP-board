package sbs.com.jsp.board.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {
    private long id;
    private String subject;
    private String content;
}
