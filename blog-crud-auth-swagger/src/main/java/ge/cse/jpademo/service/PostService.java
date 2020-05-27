package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.post.*;

public interface PostService {
    GetPostsOutput getPosts(GetPostsInput getPostsInput);

    AddPostOutput addPost(AddPostInput addPostInput);

    GetPostDetailsOutput getPostDetails(GetPostDetailInput getPostDetailInput);

    void deletePost(Long id);
}
