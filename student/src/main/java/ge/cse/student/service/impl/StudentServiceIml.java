package ge.cse.student.service.impl;

import ge.cse.student.dto.students.StudentsInput;
import ge.cse.student.dto.students.StudentsOutput;
import ge.cse.student.enums.GenderType;
import ge.cse.student.model.Student;
import ge.cse.student.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Primary
@Service
public class StudentServiceIml implements StudentService {

    List<Student> students;

    public StudentServiceIml() {
        students = new ArrayList<>();
        students.add(new Student(1L, "Nika", "Nikashvili", GenderType.MALE));
        students.add(new Student(2L, "Mari", "Marishvili", GenderType.FEMALE));
        students.add(new Student(3L, "Dato", "Datoshvili", GenderType.MALE));
        students.add(new Student(4L, "Ani", "Anadze", GenderType.FEMALE));
    }

    //    @Override
//    public List<Student> students() {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1L, "Nika", "Nikashvili", GenderType.MALE));
//        students.add(new Student(2L, "Mari", "Marishvili", GenderType.FEMALE));
//        students.add(new Student(3L, "Dato", "Datoshvili", GenderType.MALE));
//        students.add(new Student(4L, "Ani", "Anadze", GenderType.FEMALE));
//        return students;
//
//    }
    @Override
    public StudentsOutput students(StudentsInput studentsInput) {

        List<Student> nStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGenderType().equals(studentsInput.getGenderType())) {
                nStudents.add(student);
            }
        }
        StudentsOutput studentsOutput = new StudentsOutput();
        studentsOutput.setStudents(nStudents);
        return studentsOutput;

    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        for (Student cstudent : students) {
            if (cstudent.getId().equals(id)) {
                cstudent.setFirstName(student.getFirstName());
                cstudent.setLastName(student.getLastName());
                cstudent.setGenderType(student.getGenderType());
                cstudent.setId(student.getId());
            }
        }
    }

    @Override
    public void deleteStudent(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
            }
        }
        System.out.println(id);
    }
}
