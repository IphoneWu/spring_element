package demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by win8 on 2017/2/27.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Helloworld helloworld = (Helloworld) applicationContext.getBean("helloBean");
        helloworld.printHelloWorld("This is Spring_JavaConfg!");
    }
}
