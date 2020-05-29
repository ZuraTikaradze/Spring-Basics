package ge.cse.jpademo.service.impl;

import ge.cse.jpademo.dto.comment.AddCommentInput;
import ge.cse.jpademo.dto.comment.AddCommentOutput;
import ge.cse.jpademo.model.Comment;
import ge.cse.jpademo.model.Post;
import ge.cse.jpademo.repository.CommentRepository;
import ge.cse.jpademo.repository.PostRepository;
import ge.cse.jpademo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public AddCommentOutput addComment(AddCommentInput addCommentInput) {
        Post post = postRepository.getOne(addCommentInput.getPostId());
        Comment comment = new Comment();
        comment.setText(addCommentInput.getText());
        comment.setPost(post);
        commentRepository.save(comment);

        AddCommentOutput addCommentOutput = new AddCommentOutput();
        addCommentOutput.setMsg("კომენტარი წარმატებით დაემატა");
        return addCommentOutput;
    }
}
