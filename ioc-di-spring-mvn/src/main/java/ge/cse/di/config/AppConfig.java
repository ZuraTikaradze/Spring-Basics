package ge.cse.di.config;

import ge.cse.di.repository.StudentRepository;
import ge.cse.di.repository.StudentRepositoryImpl;
import ge.cse.di.service.StudentService;
import ge.cse.di.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ge.cse.di"})
public class AppConfig {

//    @Bean(name = "StudentService")
//    public StudentService getStudentService() {
//        StudentServiceImpl studentServiceImpl = new StudentServiceImpl(getStudentRepository());
//        return studentServiceImpl;
//    }
//
//    @Bean(name = "StudentRepository")
//    public StudentRepository getStudentRepository() {
//        StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();
//        return studentRepository;
//    }
}
