package demo9;

import demo9.Po.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/3/4.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo9/applicationContext.xml");
        Customer customer = (Customer) applicationContext.getBean("customerServiceProxy");
        System.out.println("******************************");
        customer.printName();
        System.out.println("******************************");
        customer.printUrl();
        System.out.println("******************************");
        try {
            customer.printThrowException();

        }catch (Exception e){

        }
    }

}
