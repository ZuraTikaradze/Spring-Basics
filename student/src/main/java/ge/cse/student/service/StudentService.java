package ge.cse.student.service;

import ge.cse.student.dto.students.StudentsInput;
import ge.cse.student.dto.students.StudentsOutput;
import ge.cse.student.model.Student;

import java.util.List;

public interface StudentService {
//    List<Student> students();
     StudentsOutput students(StudentsInput studentsInput);
    void addStudent(Student student);

    void updateStudent(Long id, Student student);

    void deleteStudent(Long id);

}
