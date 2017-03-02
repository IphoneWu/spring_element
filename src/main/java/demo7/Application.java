package demo7;

import demo7.Po.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/3/2.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo7/beans.xml");
        Customer customer = (Customer) context.getBean("CustomerBean");
        System.out.println(customer);
    }
}
