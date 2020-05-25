package ge.cse.jpademo;

import ge.cse.jpademo.model.*;
import ge.cse.jpademo.repository.CategoryRepository;
import ge.cse.jpademo.repository.CommentRepository;
import ge.cse.jpademo.repository.PostRepository;
import ge.cse.jpademo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootTest
class JpaDemoApplicationTests {

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }


    @Test
    void addPost() {
        Post post = new Post();
        // post.setId(1l);
        post.setTitle("სატესტო პოსტი");
        post.setDescription("სატესტო კონტენტი");
        post.setCreateDate(new Date());
        post.setRate(5);
        postRepository.save(post);
    }

//    @Test
//    void getPosts() {
//        for (Post post : postRepository.findAll()) {
//            System.out.println(post);
//          //    System.out.println(post.getComments().get(0).getText()); // FetchType.EAGER
//        }
//    }

//    @Transactional
//    @Test
//    void getPost() {
//        Post post = postRepository.getOne(3L);
//        System.out.println(post.getTitle());
//        System.out.println(post.getComments().get(0).getText());
//    }

//    @Test
//    void addComment() {
//        Post post = postRepository.getOne(3L);
//        Comment comment = new Comment();
//        comment.setText("სატესტო კომენტარი");
//        comment.setPost(post);
//        commentRepository.save(comment);
//    }

//    @Test
//    void getComment() {
//        for (Comment comment : commentRepository.findAll()) {
//            System.out.println(comment);
//        }
//    }


//    @Test
//    void addCategory() {
//        Category category = new Category();
//        category.setTitle("კატეგორია 1");
//        categoryRepository.save(category);
//    }



    @Test
    void addPostWithCategory() {
        Category category1 = categoryRepository.getOne(3L);
        Category category2 = categoryRepository.getOne(4L);
        List<Category> categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);

        Post post = new Post();
        post.setTitle("სატესტო პოსტი 2");
        post.setDescription("სატესტო პოსტის 2");
        post.setCategories(categories);

        postRepository.save(post);
    }


    @Test
    void addPostWithCategoryAndAttachment() {


        Category category1 = categoryRepository.getOne(3L);
        Category category2 = categoryRepository.getOne(4L);
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


//    @Test
////    @Transactional
//    void addCommentFromPost() {
//        Post post = postRepository.getOne(2L);
//        Comment comment = new Comment();
//        comment.setText("სატესტო კომენტარი 2");
//
//        List<Comment> comments=new ArrayList<>();
//        comments.add(comment);
//
//        post.setComments(comments);
//
//        postRepository.save(post);
//    }


    @Test
    void addStudent() {
        Student student = new Student();
        student.setUsername("giorgi");
        student.setFirstName("Giorgi");
        student.setLastName("Giorgishvili");
        student.setAge(25);


        Student student1 = new Student();
        student1.setUsername("nika");
        student1.setFirstName("Nika");
        student1.setLastName("Nikashvili");
        student1.setAge(22);

        Student student2 = new Student();
        student2.setUsername("mari");
        student2.setFirstName("Mariam");
        student2.setLastName("Marishvili");
        student2.setAge(21);

        Student student3 = new Student();
        student3.setUsername("mari2");
        student3.setFirstName("Mariam");
        student3.setLastName("Ragac");
        student3.setAge(25);

        studentRepository.save(student);
        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

    }

    @Test
    void temp(){

        Student student=studentRepository.findFirstByUsername("giorgi12");
        System.out.println(student);

        List<Student> students=studentRepository.findAllByAge(10);
        System.out.println(students);

       Student student1 = studentRepository.findFirstByFirstNameAndLastName("Mariam","Marishvili");
        System.out.println(student1);

        List<Student> students1=studentRepository.findAllByAgeBetween(20,23);
        System.out.println(students1);

        List<Student> students2=studentRepository.findAllByAgeGreaterThan(23);

        System.out.println(students2);
    }
}
