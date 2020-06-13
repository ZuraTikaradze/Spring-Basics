package ge.cse.aop.demo.service.impl;

import ge.cse.aop.demo.service.LectureService;
import ge.cse.aop.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class LectureServiceImpl implements LectureService {
    @Override
    public String getTask() {
        String task = "Lecturer  getTask";
        System.out.println(task);
        return task;
    }

    @Override
    public void setTask(String task) {
        System.out.println("Lecturer setTask");
    }
}
