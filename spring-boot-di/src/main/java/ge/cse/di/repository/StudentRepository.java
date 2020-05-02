package ge.cse.di.repository;

import ge.cse.di.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
