package demo7;


import demo7.Po.Customer;
import demo7.Po.DatePo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/3/2.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo7/datePo.xml");
        DatePo datePo = (DatePo) context.getBean("CustomerBean");
        System.out.println(datePo);
    }
}
