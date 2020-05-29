package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.post.*;
import ge.cse.jpademo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/PostController")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("getPosts")
    public GetPostOutput getPosts(@RequestBody GetPostInput getPostInput) {
        return postService.getPosts(getPostInput);
    }

    @PostMapping("addPost")
    public AddPostOutput addPost(@RequestBody AddPostInput addPostInput) {
        return postService.addPost(addPostInput);
    }

    @PostMapping("getPostDetail")
    public GetPostDetailOutput getPostDetail(@RequestBody GetPostDetailInput getPostDetailInput) {
        return postService.getPostDetail(getPostDetailInput);
    }

    @PostMapping("deletePost")
    public DeletePostOutput deletePost(@RequestBody DeletePostInput deletePostInput) {
        return postService.deletePost(deletePostInput);
    }
}
