//package ge.cse.aop.demo.aspect;
//
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// *  #3 aspect
// *  3.1 loggingAdvice() -ი გაშვება ge.cse.aop.demo.service.impl არსებულ set ით დაწყებულ მეთოდებზე
// *      და დაპრინტავს გადაცემულ პარამეტრებს
// *
// */
//@Aspect
//@Component
//public class StudentAspectJoinPoint {
//
//    // Join Point: A join point is a specific point in the application such as
//    // method execution, exception handling changing object variable values.
//    //  "მეთოდიში არსებული ინფირმაცია"
//    @Before("execution(public void ge.cse.aop.demo.service.impl..set*(*))")
//    public void loggingAdvice(JoinPoint joinPoint){
//        System.out.println("Before running loggingAdvice on method="+joinPoint.toString());
//
//        System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));
//
//    }
//
//}
