package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.post.*;

public interface PostService {
    // პოსტების წამოღება
    GetPostOutput getPosts(GetPostInput getPostInput);

    // პოსტის დამატება
    AddPostOutput addPost(AddPostInput addPostInput);

    // პოსტის დეტალები
    GetPostDetailOutput getPostDetail(GetPostDetailInput getPostDetailInput);

    // პოსტის წაშლა
    DeletePostOutput deletePost(DeletePostInput deletePostInput);
}
