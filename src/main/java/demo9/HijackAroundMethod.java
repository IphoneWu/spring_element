package demo9;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * Created by win8 on 2017/3/4.
 */
public class HijackAroundMethod implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method name:"+methodInvocation.getMethod().getName());
        System.out.println("Method arguments:"+ Arrays.toString(methodInvocation.getArguments()));

        // MethodBeforeAdvice
        System.out.println("before");
        try {
            //proceed to original method call
            Object result = methodInvocation.proceed();
            //afterReturnningAdvice
            System.out.println("after");
            return result;
        }catch (IllegalArgumentException e){
            //ThrowAdvice
            System.out.println("Throw exception!");
            throw e;
        }

    }
}
