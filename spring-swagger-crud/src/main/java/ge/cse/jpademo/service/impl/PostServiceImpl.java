package ge.cse.jpademo.service.impl;

import ge.cse.jpademo.dto.attachment.AttachmentDTO;
import ge.cse.jpademo.dto.category.AddCategoryInput;
import ge.cse.jpademo.dto.category.AddCategoryOutput;
import ge.cse.jpademo.dto.category.CategoryDTO;
import ge.cse.jpademo.dto.comment.CommentDTO;
import ge.cse.jpademo.dto.post.*;
import ge.cse.jpademo.model.Attachment;
import ge.cse.jpademo.model.Category;
import ge.cse.jpademo.model.Comment;
import ge.cse.jpademo.model.Post;
import ge.cse.jpademo.repository.CategoryRepository;
import ge.cse.jpademo.repository.PostRepository;
import ge.cse.jpademo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public GetPostOutput getPosts(GetPostInput getPostInput) {

        List<PostDTO> postDTOList = new ArrayList<>();
        for (Post post : postRepository.findAll()) {
            PostDTO postDTO = new PostDTO();
            postDTO.setId(post.getId());
            postDTO.setTitle(post.getTitle());
            postDTO.setRate(post.getRate());
            postDTO.setDescription(post.getDescription());
            postDTO.setCreateDate(post.getCreateDate());
            postDTOList.add(postDTO);
        }

        GetPostOutput getPostOutput = new GetPostOutput();
        getPostOutput.setPosts(postDTOList);
        return getPostOutput;
    }

    @Override
    public AddPostOutput addPost(AddPostInput addPostInput) {
        Post post = new Post();
        post.setTitle(addPostInput.getTitle());
        post.setDescription(addPostInput.getDescription());
        post.setCreateDate(addPostInput.getCreateDate());
        post.setRate(addPostInput.getRate());

        Attachment attachment = new Attachment();
        attachment.setUrl(addPostInput.getAttachment().getUrl());
        post.setAttachment(attachment);

        List<Category> categories = new ArrayList<>();
        for (CategoryDTO categoryDTO : addPostInput.getCategories()) {
            Category category = categoryRepository.getOne(categoryDTO.getId());
            categories.add(category);
        }
        post.setCategories(categories);

        postRepository.save(post);

        AddPostOutput addPostOutput = new AddPostOutput();
        addPostOutput.setMsg("პოსტი დაემატა");
        return addPostOutput;
    }

    @Override
    public GetPostDetailOutput getPostDetail(GetPostDetailInput getPostDetailInput) {
        Post post = postRepository.getOne(getPostDetailInput.getPostId());

        GetPostDetailOutput getPostDetailOutput = new GetPostDetailOutput();
        getPostDetailOutput.setTitle(post.getTitle());
        getPostDetailOutput.setDescription(post.getDescription());
        getPostDetailOutput.setCreateDate(post.getCreateDate());
        getPostDetailOutput.setRate(post.getRate());

        Attachment attachment = post.getAttachment();
        AttachmentDTO attachmentDTO = new AttachmentDTO();
        attachmentDTO.setId(attachment.getId());
        attachmentDTO.setUrl(attachment.getUrl());
        getPostDetailOutput.setAttachment(attachmentDTO);


        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for (Category category : post.getCategories()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setTitle(category.getTitle());
            categoryDTOList.add(categoryDTO);
        }
        getPostDetailOutput.setCategories(categoryDTOList);

        List<CommentDTO> commentDTOList = new ArrayList<>();
        for (Comment comment : post.getComments()) {
            CommentDTO commentDTO = new CommentDTO();
            commentDTO.setId(comment.getId());
            commentDTO.setText(comment.getText());
            commentDTOList.add(commentDTO);
        }
        getPostDetailOutput.setComments(commentDTOList);

        return getPostDetailOutput;
    }

    @Override
    public DeletePostOutput deletePost(DeletePostInput deletePostInput) {
        Post post = postRepository.getOne(deletePostInput.getPostId());
        post.getCategories().clear();
        postRepository.delete(post);

        DeletePostOutput deletePostOutput = new DeletePostOutput();
        deletePostOutput.setMsg("პოსტი წარმატებით წაიშალა");
        return deletePostOutput;
    }
}
