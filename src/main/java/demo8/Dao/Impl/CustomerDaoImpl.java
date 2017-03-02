package demo8.Dao.Impl;

import demo8.Dao.CustomerDao;
import demo8.Po.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by win8 on 2017/3/2.
 */
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {

    public Customer findCustomerById(int CustId) {
        String sql = "SELECT CUST_ID  , NAME ,AGE FROM CUSTOMER WHERE CUST_ID = ?";
        Customer customer = (Customer)getJdbcTemplate().queryForObject(
                sql, new Object[] { CustId },new BeanPropertyRowMapper(Customer.class));
        return customer;
    }


}
