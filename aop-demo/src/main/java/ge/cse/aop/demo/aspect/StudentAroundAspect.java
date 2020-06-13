package ge.cse.aop.demo.aspect;

///**
// *  #5 aspect
// *  studentAroundAdvice() -ი ეშვება getTask()-ის დაპროცესებამდე და დაპროცესების შემდეგ.
// *  პრინტავს დაბრუნებულ მნიშვნელობასაც.
// */
//@Aspect
//@Component
//public class StudentAroundAspect {
//    @Around("execution(* ge.cse.aop.demo.service.impl.StudentServiceImpl.getTask())")
//    public Object studentAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("Before invoking getTask() method");
//        Object value = null;
//        try {
//            value = proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        System.out.println("After invoking getTask() method. Return value="+value);
//        return value;
//    }
//}
