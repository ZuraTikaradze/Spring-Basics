package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.post.*;
import ge.cse.jpademo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/PostController")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("posts")
    public GetPostsOutput getPosts(@RequestBody GetPostsInput getPostsInput) {
        return postService.getPosts(getPostsInput);
    }

    @PostMapping("post")
    public AddPostOutput addPost(@RequestBody AddPostInput addPostInput) {
        return postService.addPost(addPostInput);
    }

    @PostMapping("post/detail")
    public GetPostDetailsOutput getPostDetails(@RequestBody GetPostDetailInput getPostDetailInput) {
        return postService.getPostDetails(getPostDetailInput);
    }

    @DeleteMapping("delete/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
