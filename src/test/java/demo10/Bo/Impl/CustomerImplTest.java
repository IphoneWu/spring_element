package demo10.Bo.Impl;

import demo10.Bo.CustomerBo;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by win8 on 2017/3/6.
 */
public class CustomerImplTest extends TestCase {
    ApplicationContext applicationContext;
    CustomerBo customerBo;
    public void setUp() throws Exception {
        super.setUp();
        applicationContext = new ClassPathXmlApplicationContext("demo10/applicationContext.xml");
        customerBo = (CustomerBo) applicationContext.getBean("customerBo");
    }
    @Test
    public void testAddCustomer() throws Exception {
        customerBo.addCustomer();
    }
    @Test
    public void testAddCustomerReturnValue() throws Exception {
        customerBo.addCustomerReturnValue();
    }
    @Test
    public void testAddCustomerThrowException() throws Exception {
        customerBo.addCustomerThrowException();
    }
    @Test
    public void testAddCustomerAround() throws Exception {
        customerBo.addCustomerAround("mkyong");
    }

}