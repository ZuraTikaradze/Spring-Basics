package ge.cse.di.repository;

import ge.cse.di.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("StudentRepository")
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe"));
        return studentList;
    }
}
