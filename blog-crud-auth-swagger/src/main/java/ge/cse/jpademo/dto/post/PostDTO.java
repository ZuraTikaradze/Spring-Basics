package ge.cse.jpademo.dto.post;

import lombok.Data;

import java.util.Date;

@Data
public class PostDTO {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
}
