package ge.cse.aop.demo.controller;


import ge.cse.aop.demo.service.LectureService;
import ge.cse.aop.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
    StudentService studentService;

//    @Autowired
//    LectureService lectureService;

    @GetMapping("test")
    public void test() {
        studentService.getTask();
    }

//    @GetMapping("test2")
//    public void test2() {
//        lectureService.getTask();
//    }
}
