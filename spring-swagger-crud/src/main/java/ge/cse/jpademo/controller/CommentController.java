package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.category.AddCategoryInput;
import ge.cse.jpademo.dto.category.AddCategoryOutput;
import ge.cse.jpademo.dto.category.GetCategoriesInput;
import ge.cse.jpademo.dto.category.GetCategoriesOutput;
import ge.cse.jpademo.dto.comment.AddCommentInput;
import ge.cse.jpademo.dto.comment.AddCommentOutput;
import ge.cse.jpademo.service.CategoryService;
import ge.cse.jpademo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/CommentController")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("addComment")
    public AddCommentOutput addComment(@RequestBody AddCommentInput addCommentInput) {
        return commentService.addComment(addCommentInput);
    }
}
