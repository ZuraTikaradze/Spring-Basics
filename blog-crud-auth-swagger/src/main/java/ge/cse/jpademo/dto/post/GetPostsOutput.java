package ge.cse.jpademo.dto.post;

import lombok.Data;

import java.util.List;

@Data
public class GetPostsOutput {
    List<PostDTO> posts;
}
