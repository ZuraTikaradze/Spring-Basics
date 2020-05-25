package ge.cse.jpademo.repository;

import ge.cse.jpademo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
