package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.comment.AddCommentInput;
import ge.cse.jpademo.dto.comment.AddCommentOutput;

public interface CommentService {
    AddCommentOutput addComment(AddCommentInput addCommentInput);
}
