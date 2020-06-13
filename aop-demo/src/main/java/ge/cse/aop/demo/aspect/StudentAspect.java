//package ge.cse.aop.demo.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
///** #1 aspect
// *  1.1 getTaskAdvice() -ი გაეშვება *მანამდე* როცა გაეშვება ნებისმიერ სერვისში არსებული getTask() -მეთოდი
// *  1.2 getAllAdvice()-ი გაეშვება *მანამდე* როცა გაეშვება ნებისმიერ სერვისში არსებული ნებისმიერი მეთოდი რომელიც შეიცავს "get"-ს
// */
//@Aspect
//@Component
//public class StudentAspect {
//
//    //Advice - ი არის მოქმედება რომელიც სრულდება ჩვენს მიერ მითითებული მეთოდის გამოძახებისას
//    @Before("execution(public String getTask())")
//    public void getTaskAdvice() {
//        System.out.println("Executing Advice on getTask()");
//    }
//
//    @Before("execution(* ge.cse.aop.demo.service.*.get*())")
//    public void getAllAdvice() {
//        System.out.println("Service method getter called");
//    }
//}
