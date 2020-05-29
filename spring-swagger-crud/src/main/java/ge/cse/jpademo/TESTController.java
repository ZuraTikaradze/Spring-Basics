package ge.cse.jpademo;

import ge.cse.jpademo.model.Attachment;
import ge.cse.jpademo.model.Category;
import ge.cse.jpademo.model.Comment;
import ge.cse.jpademo.model.Post;
import ge.cse.jpademo.repository.CategoryRepository;
import ge.cse.jpademo.repository.CommentRepository;
import ge.cse.jpademo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class TESTController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("addCategory")
    public void addCategory() {
        Category category = new Category();
        category.setTitle("კატეგორია 1");
        categoryRepository.save(category);
    }

    @GetMapping("addPost")
    public void addPostWithCategoryAndAttachment() {
        Category category1 = categoryRepository.getOne(2L);
        Category category2 = categoryRepository.getOne(3L);
        List<Category> categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);

        Attachment attachment = new Attachment();
        attachment.setUrl("image.jpg");

        Post post = new Post();
        post.setTitle("სატესტო პოსტი 2");
        post.setDescription("სატესტო პოსტის 2");
        post.setCategories(categories);

        post.setAttachment(attachment);

        postRepository.save(post);
    }

    @GetMapping("getPosts")
    public void getPosts() {
        for (Post post : postRepository.findAll()) {
            System.out.println(post);
            //   System.out.println(post.getComments().get(0).getText()); // FetchType.EAGER აქედან მაგრად კიდია ესენი მაინც მოაქვს lazy -ზეც
        }
    }

    @GetMapping("getPost")
    public void getPost() {
        Post post = postRepository.getOne(3L);
        System.out.println(post.getTitle());
        System.out.println(post.getComments().get(0).getText());
    }

    @GetMapping("addComment")
    public void addComment() {
        Post post = postRepository.getOne(3L);
        Comment comment = new Comment();
        comment.setText("სატესტო კომენტარი");
        comment.setPost(post);
        commentRepository.save(comment);
    }

    @GetMapping("getComments")
    public void getComments() {
        for (Comment comment : commentRepository.findAll()) {
            System.out.println(comment);
        }
    }


}
