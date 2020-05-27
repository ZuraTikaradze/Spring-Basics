package ge.cse.jpademo.dto.post;

import ge.cse.jpademo.dto.attachment.AttachmentDTO;
import ge.cse.jpademo.dto.category.CategoryDTO;
import ge.cse.jpademo.dto.comment.CommentDTO;
import ge.cse.jpademo.model.Attachment;
import ge.cse.jpademo.model.Category;
import ge.cse.jpademo.model.Comment;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class GetPostDetailsOutput {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
    private List<CommentDTO> comments = new ArrayList<>();
    private List<CategoryDTO> categories = new ArrayList<>();
    private AttachmentDTO attachment;
}
