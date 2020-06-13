//package ge.cse.aop.demo.aspect2;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
///**
// * #4 aspect
// *  4.1 logExceptions() -ი ეშვება StudentServiceImpl კლასში მომხდარი exception -ის *შემდეგ*
// *      და პრინტავს მეთოდს სადაც მოხდა შეცდომა
// *  4.2 getTaskReturningAdvice() -ი ეშვება getTask()- მეთოდის გაშვების *შემდეგ* და პრინტავს
// *      getTask()-ის მიერ დაბრუნებულ მნიშვნელობას
// */
//@Aspect
//@Component
//public class StudentAfterAspect {
//
//
//    @AfterThrowing("within(ge.cse.aop.demo.service.impl.StudentServiceImpl)")
//    public void logExceptions(JoinPoint joinPoint){
//        System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
//    }
//
//    @AfterReturning(pointcut="execution(* getTask())", returning="returnString")
//    public void getTaskReturningAdvice(String returnString){
//        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
//    }
//}
