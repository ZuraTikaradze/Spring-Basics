package ge.cse.jpademo.dto.comment;

import lombok.Data;

@Data
public class AddCommentInput {
    private Long postId;
    private String text;
}
