package demo8.Dao;

import demo8.Po.Customer;

/**
 * Created by win8 on 2017/3/2.
 */
public interface CustomerDao {
    public Customer findCustomerById(int CustId);
}
