package ge.cse.jpademo.repository;

import ge.cse.jpademo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findFirstByUsername(String username);

    List<Student> findAllByAge(int age);

    Student findFirstByFirstNameAndLastName(String firstName,String lastName);

    List<Student> findAllByAgeBetween(int min, int max);
    List<Student> findAllByAgeGreaterThan(int age);

}
