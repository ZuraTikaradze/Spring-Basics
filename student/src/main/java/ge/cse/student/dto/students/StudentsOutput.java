package ge.cse.student.dto.students;

import ge.cse.student.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentsOutput {
    private List<Student> students = new ArrayList<>();
}
