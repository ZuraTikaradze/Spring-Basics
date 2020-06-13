package ge.cse.aop.demo.service.impl;

import ge.cse.aop.demo.aspect.Loggable;
import ge.cse.aop.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Loggable
    @Override
    public String getTask() {
        String task = "getTask";
        System.out.println(task);
        return task;
    }

    @Override
    public void setTask(String task) {
        System.out.println("setTask");
    }

    @Override
    public void exc() {
        throw new RuntimeException();
    }


}
