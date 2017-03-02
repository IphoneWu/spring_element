package demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/2/28.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo6/beans.xml");

        A_B_Hellper a_b_hellper = (A_B_Hellper) applicationContext.getBean("Helper");
        a_b_hellper.printHello();
    }


}
