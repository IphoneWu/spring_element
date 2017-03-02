package demo1;

import demo8.Dao.CustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/2/25.
 */
public class application {
    public static void  main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Customer customer = (Customer) applicationContext.getBean("Customer");
        System.out.println(customer);
    }
}
