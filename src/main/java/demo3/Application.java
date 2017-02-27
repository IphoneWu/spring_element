package demo3;


import demo3.Po.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/2/27.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo3/beans.xml");
        Customer customer = (Customer) context.getBean("CustomerBean");
        System.out.println(customer);
    }
}
