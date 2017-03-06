package demo10.Bo;

/**
 * Created by win8 on 2017/3/5.
 */
public interface CustomerBo {
    void addCustomer();
    String addCustomerReturnValue();
    void addCustomerThrowException() throws Exception;
    void addCustomerAround(String name);
}
