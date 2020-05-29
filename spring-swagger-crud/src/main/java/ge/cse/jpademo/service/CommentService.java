package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.comment.AddCommentInput;
import ge.cse.jpademo.dto.comment.AddCommentOutput;

public interface CommentService {
    // კომენტარის დამატება
    AddCommentOutput addComment(AddCommentInput addCommentInput);
}
