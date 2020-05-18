package ge.cse.student.dto.students;

import ge.cse.student.enums.GenderType;
import lombok.Data;

@Data
public class StudentsInput {
    private GenderType genderType;
}
