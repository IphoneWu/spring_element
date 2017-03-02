package demo8;


import demo8.Dao.CustomerDao;
import demo8.Po.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/3/2.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Demo8/applicationContext-all.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }
}
