package demo2.Dao;

import demo2.Po.Customer;

import java.util.List;

/**
 * Created by win8 on 2017/2/25.
 */
public interface CustomerDao {
    public void insert(Customer customer);
    public Customer findCustomerByCustId(int CUST_ID);
    public List<Customer> getAllCustomer();
}
