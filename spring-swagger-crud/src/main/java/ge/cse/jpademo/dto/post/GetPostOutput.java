package ge.cse.jpademo.dto.post;

import lombok.Data;

import java.util.List;

@Data
public class GetPostOutput {
    private List<PostDTO> posts;
}
