//package hello.hellospring.aop;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.context.annotation.ComponentScan;
//
//
//@ComponentScan
//@Aspect
//public class TimeTraceAop {
//    @Around("execution(* hello.hellospring. .*(..))")
//    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
//        long start = System.currentTimeMillis();
//        try{
//            return joinPoint.proceed();
//        }finally {
//            long finish = System.currentTimeMillis();
//            long timeMs = finish - start;
//            System.out.println("START : " + joinPoint.toString() + " " + timeMs + "ms");
//        }
//    }
//
//}
