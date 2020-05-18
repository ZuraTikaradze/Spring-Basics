package ge.cse.student.controller;

import ge.cse.student.dto.students.StudentsInput;
import ge.cse.student.dto.students.StudentsOutput;
import ge.cse.student.model.Student;
import ge.cse.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

//    @Qualifier("studentServiceMockIml")
    @Autowired
    StudentService studentService;

//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }


//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }

//    // @RequestMapping(value = "/students", method = RequestMethod.GET)
//    @GetMapping("students")
//    public List<Student> students() {
//        return studentService.students();
//    }

    // @RequestMapping(value = "/students", method = RequestMethod.GET)
    @PostMapping("students")
    public StudentsOutput students(@RequestBody StudentsInput studentsInput) {
        return studentService.students(studentsInput);
    }

    //    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    @PostMapping("addStudent")
    public void addStudents(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    //    @RequestMapping(value = "updateStudent/{id}", method = RequestMethod.POST)
    @PutMapping("updateStudent/{id}")
    public void updateStudents(@PathVariable Long id,@RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }


}
