//package ge.cse.aop.demo.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * #2 aspect
// * 2.1 getTaskPointcut() - ეშვება getTask() - მეთოდის გაშვებისას და უშვებს loggingAdvice()  და secondAdvice() -ს.
// * 2.2 allMethodsPointcut() - ეშვება ამ პაკეტში არსებული : ge.cse.aop.demo.service.impl ნებისმიერი მეთოდის გაშვებისას
// *    და უშვებს allServiceMethodsAdvice()- მეთოდს.
// */
//@Aspect
//@Component
//public class StudentAspectPointcut {
//
//    @Before("getTaskPointcut()")
//    public void loggingAdvice() {
//        System.out.println("Executing loggingAdvice on getTask()");
//    }
//
//    @Before("getTaskPointcut()")
//    public void secondAdvice() {
//        System.out.println("Executing secondAdvice on getTask()");
//    }
//    // Pointcut: Pointcut is expressions  to determine whether advice needs to be executed or not
//    @Pointcut("execution(public String getTask())")
//    public void getTaskPointcut() {
//
//    }
//
//    @Before("allMethodsPointcut()")
//    public void allServiceMethodsAdvice() {
//        System.out.println("Before executing service method");
//    }
//
//
//    //Pointcut to execute on all the methods of classes in a package
//    @Pointcut("within(ge.cse.aop.demo.service.impl.*)")
//    public void allMethodsPointcut() {
//    }
//}
