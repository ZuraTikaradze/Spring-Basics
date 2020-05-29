package ge.cse.jpademo.repository;

import ge.cse.jpademo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
