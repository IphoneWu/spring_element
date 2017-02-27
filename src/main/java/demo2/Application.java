package demo2;


import demo2.Dao.CustomerDao;
import demo2.Dao.impl.CustomerDaoImpl;
import demo2.Po.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/2/25.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerDao customerDao = (CustomerDao) context.getBean("CustomerDaoImpl");
//        Customer customer = new Customer(21,"xiaoqiang",52);
//        customerDao.insert(customer);
//        System.out.println(customer);
        Customer customer1 = customerDao.findCustomerByCustId(20);
        System.out.println(customer1);
    }


}
