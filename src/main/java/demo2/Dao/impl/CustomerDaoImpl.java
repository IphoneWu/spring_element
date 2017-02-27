package demo2.Dao.impl;

import demo2.Dao.CustomerDao;
import demo2.Po.Customer;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by win8 on 2017/2/25.
 */
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {


    /*
        传统方法开发jdbc
     */
//    public void insert(Customer customer) {
//        String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
//        Connection conn = null;
//        try {
//            conn = dataSource.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, customer.getCUST_ID());
//            ps.setString(2, customer.getNAME());
//            ps.setInt(3, customer.getAGE());
//            ps.executeUpdate();
//            ps.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    /*
        使用spring jdbcJdbcTemplate 开发
     */
    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
        Object[] obj = new Object[]{customer.getCUST_ID(),customer.getNAME(),customer.getAGE()};
        getJdbcTemplate().update(sql,obj);
    }

    public Customer findCustomerByCustId(int CUST_ID) {
        String sql = "SELECT CUST_ID  , NAME ,AGE FROM CUSTOMER WHERE CUST_ID = ?";
        Customer customer = (Customer)getJdbcTemplate().queryForObject(
                sql, new Object[] { CUST_ID },new BeanPropertyRowMapper(Customer.class));
        return customer;
    }

//    public Customer findCustomerByCustId(int CustId) {
//        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
//        Connection conn = null;
//        Customer customer = null;
//        try {
//            conn = dataSource.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1,CustId);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()){
//                customer=new Customer(rs.getInt("CUST_ID"),rs.getString("NAME"),rs.getInt("AGE"));
//            }
//            rs.close();
//            ps.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return customer;
//    }

    /**
     * 查询多个值
     */
    public List<Customer> getAllCustomer() {
        String sql = "Select * from Customer";
        List<Customer> customers = getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Customer>(Customer.class));
        return customers;
    }

}
