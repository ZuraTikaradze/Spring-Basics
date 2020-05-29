package ge.cse.jpademo.dto.post;

import ge.cse.jpademo.dto.attachment.AttachmentDTO;
import ge.cse.jpademo.dto.category.CategoryDTO;
import ge.cse.jpademo.dto.comment.CommentDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GetPostDetailOutput {
    private String title;
    private String description;
    private Date createDate;
    private int rate;

    private AttachmentDTO attachment;
    private List<CategoryDTO> categories;
    private List<CommentDTO> comments;
}
