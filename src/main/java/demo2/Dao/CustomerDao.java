package demo2.Dao;

import demo2.Po.Customer;

/**
 * Created by win8 on 2017/2/25.
 */
public interface CustomerDao {
    public void insert(Customer customer);
    public Customer findCustomerByCustId(int CustId);
}
