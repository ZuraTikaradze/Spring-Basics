package ge.cse.di;

import ge.cse.di.config.AppConfig;
import ge.cse.di.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = applicationContext.getBean("StudentService", StudentService.class);
        System.out.println(studentService.getStudents().get(0));
    }
}
